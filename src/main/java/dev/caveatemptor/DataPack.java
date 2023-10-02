package dev.caveatemptor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class DataPack {
    private final List<Namespace> namespaces;
    private String name;
    private String description;


    DataPack(String name, String description) {
        name = name.toLowerCase();

        this.name = name;
        this.description = description;
        namespaces = new ArrayList<>();
    }


    public List<Namespace> getNamespaces() {
        return namespaces;
    }

    public boolean addNamespace(Namespace namespace) {
        namespaces.add(namespace);
        return true;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    void generate() {
        File pack = new File("pack/");
        pack.mkdirs();
        File mcmeta = new File("pack/pack.mcmeta");

        try {
            mcmeta.createNewFile();
            FileWriter fileWriter = new FileWriter(mcmeta.getPath());
            fileWriter.write("" +
                    "{\n" +
                    "  \"pack\": {\n" +
                    "    \"pack_format\": 18,\n" +
                    "    \"description\": \"" + description + "\"\n" +
                    "  }\n" +
                    "}");
            fileWriter.close();

            for (Namespace namespace : namespaces) {
                File namespaceFunctionFolder = new File("pack/data/" + namespace.name + "/functions/");
                namespaceFunctionFolder.mkdirs();

                for (Function function : namespace.functions) {
                    File functionFile = new File(namespaceFunctionFolder.getPath() + "/" + function.getName() + ".mcfunction");
                    functionFile.createNewFile();

                    fileWriter = new FileWriter(functionFile.getPath());
                    for (Command command : function.getCommands()) {
                        fileWriter.write(command.generate() + "\n");
                    }
                    fileWriter.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}