package dev.caveatemptor.DatapackAPI.Target.TargetSelector;

import dev.caveatemptor.DatapackAPI.Target.Target;

public enum TargetSelectorType implements Target {
    ALL("@a"),
    NEAREST("@p"),
    RANDOM("@r"),
    SELF("@s");

    private final String selector;

    /**
     *
     * @param selector The target selector type.
     */
    TargetSelectorType(String selector) {
        this.selector = selector;
    }


    /**
     *
     * @return The string representation of the target selector type.
     */
    public String generate() {
        return selector;
    }
}
