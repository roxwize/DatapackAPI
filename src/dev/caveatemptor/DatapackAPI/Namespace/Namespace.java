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
     * Creates a new Namespace for functions to be added to. Must be added to a Datapack to take effect.
     * @param name Name of the namespace.
     */
    public Namespace(String name) {
        name = name.toLowerCase();

        this.name = name;
        functions = new ArrayList<>();
    }


    /**
     * Gets the name of the namespace.
     * @return - The name of the namespace.
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the functions in the namespace.
     * @return - The list of functions.
     */
    public List<Function> getFunctions() {
        return functions;
    }


    /**
     * Adds a function to the namespace.
     * @param function The function to add.
     * @return True on success, false on failure.
     */
    public boolean addFunction(Function function) {
        functions.add(function);
        return true;
    }
}
