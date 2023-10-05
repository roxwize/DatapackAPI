package dev.caveatemptor.DatapackAPI.Command.Teleport;

import dev.caveatemptor.DatapackAPI.Target.Target;
import dev.caveatemptor.DatapackAPI.Vector.Vector2;
import dev.caveatemptor.DatapackAPI.Vector.Vector3;


// TODO: Implement facing

/**
 * Represents the teleport command.
 */
public class Teleport implements dev.caveatemptor.DatapackAPI.Command.Command {
    Target target;
    Vector3 location;
    Vector2 rotation;


    /**
     * Creates a new Teleport command with the given Target and location.
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     */
    public Teleport(Target target, Vector3 location) {
        this.target = target;
        this.location = location;
    }


    /**
     * Creates a new Teleport command with the given Target, location, and rotation.
     * @param target Defines what entities will be selected as a target.
     * @param location The location to teleport the target(s) to.
     * @param rotation The rotation to set the target(s) to.
     */
    public Teleport(Target target, Vector3 location, Vector2 rotation) {
        this.target = target;
        this.location = location;
        this.rotation = rotation;
    }

    /**
     * Creates a new Teleport command with the given location. This will only affect the entity executing the command.
     * @param location The location to teleport the target to.
     */
    public Teleport(Vector3 location) {
        this.location = location;
    }

    /**
     * Creates a new Teleport command with the given location and rotation. This will only affect the entity executing the command.
     * @param location The location to teleport the target to.
     * @param rotation The rotation to set the target to.
     */
    public Teleport(Vector3 location, Vector2 rotation) {
        this.location = location;
        this.rotation = rotation;
    }


    /**
     * Converts the Teleport command into a String usable in mcfunctions
     * @return The generated Minecraft command.
     */
    @Override
    public String generate() {
        String generated = "teleport ";

        if (target != null) {
            generated += " " + target.toString() + " ";
        }

        generated += location.toString();

        if (rotation != null) {
            generated += " " + rotation + " ";
        }

        return generated;
    }
}
