package dev.caveatemptor.DatapackAPI.Target;

public enum TargetSelector implements dev.caveatemptor.DatapackAPI.Target.Target {
    ALL("@a"),
    NEAREST("@p"),
    RANDOM("@r"),
    SELF("@s");

    private final String selector;

    /**
     * // TODO: 10/2/2023 Replace selector with a better name.
     * @param selector The string representation of the TargetSelector.
     */
    TargetSelector(String selector) {
        this.selector = selector;
    }

    /**
     *
     * @return The string representation of the TargetSelector.
     */
    @Override
    public String toString() {
        return selector;
    }
}