package dev.caveatemptor.DatapackAPI.Target.TargetPlayer;

import dev.caveatemptor.DatapackAPI.Target.Target;

/**
 * The target player for a command.
 */
public class TargetPlayer implements Target {
    String name;

    /**
     *
     * @param name The player name.
     */
    public TargetPlayer(String name) {
        this.name = name;
    }

    /**
     *
     * @return The player name.
     */
    public String generate() {
        return name;
    }
}
