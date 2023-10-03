package dev.caveatemptor.DatapackAPI.Target;

public class TargetSelectorArgument implements Target {
    private TargetSelectorArgumentType argumentType;
    private String argumentValue;
    private final boolean valid;


    /**
     *
     * @param argumentType The Type of argument.
     * @param argumentValue The value of the argument.
     */

    // TODO: Implement the rest of the arguments // https://minecraft.fandom.com/wiki/Target_selectors
    public TargetSelectorArgument(TargetSelectorArgumentType argumentType, int argumentValue) {
        if (argumentType != TargetSelectorArgumentType.X
                && argumentType != TargetSelectorArgumentType.Y
                && argumentType != TargetSelectorArgumentType.Z
                && argumentType != TargetSelectorArgumentType.DISTANCE) {

            System.out.println("TargetSelectorArgument " + argumentType + " with value " + argumentValue + " is invalid!");
            valid = false;
        }
        else {
            this.argumentType = argumentType;
            this.argumentValue = Integer.toString(argumentValue);
            valid = true;
        }
    }


    /**
     *
     * @return The argument value.
     */
    public String getArgumentValue() {
        return argumentValue;
    }


    /**
     *
     * @return The argument type.
     */
    public TargetSelectorArgumentType getArgumentType() {
        return argumentType;
    }


    /**
     *
     * @return Whether or not the target selector is valid and will work in-game.
     *
     */
    public boolean isValid() { // TODO: finish this
        return valid;
    }


    @Override
    public String toString() {
        return "[" + argumentType.name().toLowerCase() + "=" + argumentValue + "]";
    }
}
