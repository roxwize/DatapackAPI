package dev.caveatemptor.DatapackAPI.Namespace;

import dev.caveatemptor.DatapackAPI.Function.Function;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a datapack namespace.
 */
public class Namespace {
    private final String name;
    private final List<Function> functions;


    /**
     *
     * @param name Name of the namespace.
     */
    public Namespace(String name) {
        name = name.toLowerCase();

        this.name = name;
        functions = new ArrayList<>();
    }


    /**
     *
     * @return - The name of the namespace.
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return - The list of functions.
     */
    public List<Function> getFunctions() {
        return functions;
    }


    /**
     *
     * @param function The function to add.
     * @return  True on success, false on failure.
     */
    public boolean addFunction(Function function) {
        functions.add(function);
        return true;
    }
}
