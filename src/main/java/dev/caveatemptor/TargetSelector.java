package dev.caveatemptor;

public enum TargetSelector {
    ALL("@a"),
    NEAREST("@p"),
    RANDOM("@r"),
    SELF("@s");

    private final String selector;

    TargetSelector(String selector) {
        this.selector = selector;
    }

    public String getSelector() { return selector; }
}