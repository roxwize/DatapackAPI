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
     *
     * @param name Name of the function.
     */
    public Function(String name) {
        name = name.toLowerCase();

        this.name = name;
        commands = new ArrayList<>();
    }

    /**
     *
     * @return The name of the function.
     */
    public String getName() {
        return name;
    }


    /**
     *
     * @return The list of commands.
     */
    public List<Command> getCommands() {
        return commands;
    }


    /**
     *
     * @param command Command to add.
     * @return True if success, false if failure.
     */
    public boolean addCommand(Command command) {
        commands.add(command);
        return true;
    }
}
