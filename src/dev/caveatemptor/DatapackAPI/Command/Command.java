package dev.caveatemptor.DatapackAPI.Command;


/**
 * Represents a Minecraft command.
 */
public interface Command {
    /**
     *
     * @return Converts the Command into a String usable in mcfunctions
     */
    String generate();
}
