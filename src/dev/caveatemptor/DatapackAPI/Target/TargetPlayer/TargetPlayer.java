package dev.caveatemptor.DatapackAPI.Target.TargetPlayer;

import dev.caveatemptor.DatapackAPI.Target.Target;

/**
 * The target player for a command.
 */
public class TargetPlayer implements Target {
    String name;

    /**
     * Gets the player. Currently only works by name.
     * @param name The player name.
     */
    public TargetPlayer(String name) {
        this.name = name;
    }

    /**
     * While named generate() to be consistent with the rest of the API, this simply returns the TargetPlayer's name.
     * @return The player name.
     */
    public String generate() {
        return name;
    }
}
