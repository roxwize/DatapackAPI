package dev.caveatemptor.DatapackAPI.Target;

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
    public String toString() {
        return name;
    }
}
