package dev.caveatemptor.DatapackAPI.Datapack;

import dev.caveatemptor.DatapackAPI.Command.Command;
import dev.caveatemptor.DatapackAPI.Function.Function;
import dev.caveatemptor.DatapackAPI.Namespace.Namespace;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Minecraft datapack.
 */
public class Datapack {
    private final List<Namespace> namespaces;
    private final String name;
    private final String description;
    private final List<String> authors = new ArrayList<>();


    /**
     *
     * @param name Name of the datapack.
     * @param description Description of the datapack.
     */
    public Datapack(String name, String description) {
        name = name.toLowerCase();

        this.name = name;
        this.description = description;
        namespaces = new ArrayList<>();
    }

    /**
     *
     * @param name Name of the datapack.
     * @param description Description of the datapack.
     * @param author Author of the datapack.
     */
    public Datapack(String name, String description, String author) {
        name = name.toLowerCase();

        this.name = name;
        this.description = description;
        namespaces = new ArrayList<>();
        authors.add(author);
    }

    /**
     *
     * @param name Name of the datapack.
     * @param description Description of the datapack.
     * @param authors Authors of the datapack.
     */
    public Datapack(String name, String description, String[] authors) {
        name = name.toLowerCase();

        this.name = name;
        this.description = description;
        namespaces = new ArrayList<>();
        this.authors.addAll(List.of(authors));
    }


    /**
     *
     * @return The list of namespaces.
     */
    public List<Namespace> getNamespaces() {
        return namespaces;
    }

    /**
     *
     * @param namespace Namespace to add.
     * @return True if success, false if failure.
     */
    public boolean addNamespace(Namespace namespace) {
        namespaces.add(namespace);
        return true;
    }


    /**
     *
     * @return The name of the datapack.
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return The description of the datapack.
     */
    public String getDescription() {
        return description;
    }


    /**
     * Generates and outputs the datapack.
     */
    public void generate() {
        File pack = new File("pack/");
        pack.mkdirs();
        File mcmeta = new File("pack/pack.mcmeta");

        try {
            // create the geninfo file
            File geninfo = new File("pack/geninfo.txt");
            geninfo.createNewFile();
            FileWriter fileWriter = new FileWriter(geninfo.getPath());
            fileWriter.write("" +
                    "This file is not part of the datapack. Feel free to edit or remove it.\n\n" +
                    "Datapack Name: " + name + "\n" +
                    "Author(s): " + authors.toString() + "\n" +
                    "Generated: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(LocalDateTime.now())
                    // TODO: add errors to geninfo
            );
            fileWriter.close();

            // create mcmeta file
            mcmeta.createNewFile();
            fileWriter = new FileWriter(mcmeta.getPath());
            fileWriter.write("" +
                    "{\n" +
                    "  \"pack\": {\n" +
                    "    \"pack_format\": 18,\n" +
                    "    \"description\": \"" + description + "\"\n" +
                    "  }\n" +
                    "}"
            );
            fileWriter.close();

            for (Namespace namespace : namespaces) {
                File namespaceFunctionFolder = new File("pack/data/" + namespace.getName() + "/functions/");
                namespaceFunctionFolder.mkdirs();

                for (Function function : namespace.getFunctions()) {
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