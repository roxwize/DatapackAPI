package dev.caveatemptor.DatapackAPI.Command;


/**
 * Represents a Minecraft command.
 */
public interface Command {
    /**
     *
     * @return Generates command for use in-game.
     */
    String generate();
}
