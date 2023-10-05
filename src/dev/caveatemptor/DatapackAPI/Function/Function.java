package dev.caveatemptor.DatapackAPI.Function;

import dev.caveatemptor.DatapackAPI.Command.Command;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a mcfunction file.
 */
public class Function {
    private final String name;
    private final List<Command> commands;


    /**
     * Creates a function to be added to a namespace with an empty Command list. Must be added to a Namespace to take effect.
     * @param name Name of the function.
     */
    public Function(String name) {
        this.name = name.toLowerCase();
        commands = new ArrayList<>();
    }

    /**
     * Creates a function to be added to a namespace with a specified command list. Must be added to a Namespace to take effect.
     * @param name Name of the function.
     * @param commands The commands to be added to the function.
     */
    public Function(String name, Command[] commands) {
        this.name = name.toLowerCase();
        this.commands = List.of(commands);
    }

    /**
     * Gets the name of the function.
     * @return The name of the function.
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the commands in a function.
     * @return The list of commands.
     */
    public List<Command> getCommands() {
        return commands;
    }


    /**
     * Adds a command to the function.
     * @param command Command to add.
     * @return True if success, false if failure.
     */
    public boolean addCommand(Command command) {
        commands.add(command);
        return true;
    }
}
