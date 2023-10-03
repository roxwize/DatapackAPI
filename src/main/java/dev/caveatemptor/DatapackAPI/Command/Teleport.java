package dev.caveatemptor.DatapackAPI.Command;

import dev.caveatemptor.DatapackAPI.Target.Target;
import dev.caveatemptor.DatapackAPI.Vector.Vector2;
import dev.caveatemptor.DatapackAPI.Vector.Vector3;


// TODO: Implement facing

/**
 * Represents the teleport command.
 */
public class Teleport implements Command {
    Target target;
    Vector3 location;
    Vector2 rotation;


    /**
     *
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     */
    public Teleport(Target target, Vector3 location) {
        this.target = target;
        this.location = location;
    }


    /**
     *
     * @param targetSelector Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     * @param rotation The rotation to set the target(s) to.
     */
    public Teleport(Target targetSelector, Vector3 location, Vector2 rotation) {
        this.target = targetSelector;
        this.location = location;
        this.rotation = rotation;
    }


    /**
     *
     * @return The generated Minecraft command.
     */
    @Override
    public String generate() {
        String generated = "teleport " + target.toString() + " " + location;

        if (rotation != null) {
            generated += " " + rotation;
        }

        return generated;
    }
}
