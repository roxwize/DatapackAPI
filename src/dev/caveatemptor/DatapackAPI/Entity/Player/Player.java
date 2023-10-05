package dev.caveatemptor.DatapackAPI.Entity.Player;

import dev.caveatemptor.DatapackAPI.Entity.Entity;

/**
 * The target player for a command.
 */
public class Player implements Entity {
    String name;

    /**
     * Gets the player by name.
     * @param name The player name.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * While named generate() to be consistent with the rest of the API, this simply returns the Players's name.
     * @return The player name.
     */
    @Override
    public String generate() {
        return name;
    }
}
