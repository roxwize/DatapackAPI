package dev.caveatemptor.DatapackAPI.Target.TargetSelector;

public enum TargetSelectorType {
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
    public String toString() {
        return selector;
    }
}
