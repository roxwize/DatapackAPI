package dev.caveatemptor.DatapackAPI.Command.Execute;

import dev.caveatemptor.DatapackAPI.Command.Command;
import dev.caveatemptor.DatapackAPI.Entity.Player.Player;


/**
 * Represents a subcommand for the execute command.
 */
public class ExecuteSubCommand implements Command {
    private final ExecuteSubCommandType type;
    private final String value;

    // TODO: Error checking, invalid commands
    // remember TargetPlayer exists


    /**
     * Creates a new ExecuteSubCommand with the specified type and String value.
     * @param type The type of the subcommand.
     * @param value The value of the subcommand.
     */
    public ExecuteSubCommand(ExecuteSubCommandType type, String value) {
        this.type = type;
        this.value = value;
    }

    public ExecuteSubCommand(ExecuteSubCommandType type, Player player) {
        this.type = type;
        this.value = player.generate();
    }

    /**
     * Creates a new ExecuteSubCommand with the specified type and Command value.
     * @param type The type of the subcommand.
     * @param value The value of the subcommand.
     */
    public ExecuteSubCommand(ExecuteSubCommandType type, Command value) {
        this.type = type;
        this.value = value.generate();
    }


    /**
     * Gets the type of the subcommand.
     * @return The type of the subcommand.
     */
    public ExecuteSubCommandType getType() {
        return type;
    }


    /**
     * Gets the value of the subcommand.
     * @return The value of the subcommand.
     */
    public String getValue() {
        return value;
    }


    /**
     * Converts the ExecuteSubCommand into a String usable in mcfunctions
     * @return String usable in mcfunctions.
     */
    @Override
    public String generate() {
        return type.name().toLowerCase() + " " + value;
    }
}
