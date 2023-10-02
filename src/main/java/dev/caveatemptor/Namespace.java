package dev.caveatemptor;

import java.util.ArrayList;
import java.util.List;

public class Namespace {
    String name;
    List<Function> functions;

    Namespace(String name) {
        name = name.toLowerCase();

        this.name = name;
        functions = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public List<Function> getFunctions() {
        return functions;
    }

    public boolean addFunction(Function function) {
        functions.add(function);
        return true;
    }
}
