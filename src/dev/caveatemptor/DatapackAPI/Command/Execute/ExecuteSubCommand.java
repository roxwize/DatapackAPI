package dev.caveatemptor.DatapackAPI.Command.Execute;

import dev.caveatemptor.DatapackAPI.Command.Command;

public class ExecuteSubCommand implements Command {
    private final ExecuteSubCommandType type;
    private final String value;

    // TODO: Error checking, invalid commands


    /**
     *
     * @param type The type of the subcommand.
     * @param value The value of the subcommand.
     */
    public ExecuteSubCommand(ExecuteSubCommandType type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     *
     * @param type The type of the subcommand.
     * @param value The value of the subcommand.
     */
    public ExecuteSubCommand(ExecuteSubCommandType type, Command value) {
        this.type = type;
        this.value = value.generate();
    }


    /**
     *
     * @return The type of the subcommand.
     */
    public ExecuteSubCommandType getType() {
        return type;
    }


    /**
     *
     * @return The value of the subcommand.
     */
    public String getValue() {
        return value;
    }


    /**
     * @return Generates command for use in-game.
     */
    @Override
    public String generate() {
        return type.name().toLowerCase() + " " + value;
    }
}
