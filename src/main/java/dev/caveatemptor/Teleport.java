package dev.caveatemptor;

public class Teleport implements Command {
    TargetSelector targetSelector;
    Location location;

    public Teleport(TargetSelector targetSelector, Location location) {
        this.targetSelector = targetSelector;
        this.location = location;
    }

    @Override
    public String generate() {
        return "teleport" + " " + targetSelector.getSelector() + " " + location.getX() + " " + location.getY() + " " + location.getZ();
    }
}
