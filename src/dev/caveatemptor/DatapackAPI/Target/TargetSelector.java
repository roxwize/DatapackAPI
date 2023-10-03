package dev.caveatemptor.DatapackAPI.Target;

import java.util.ArrayList;
import java.util.List;

public class TargetSelector implements Target {
    private final TargetSelectorType targetSelectorType;
    private final List<TargetSelectorArgument> targetSelectorArguments = new ArrayList<>();


    /**
     *
     * @param targetSelectorType The target selector type.
     */
    public TargetSelector(TargetSelectorType targetSelectorType) {
        this.targetSelectorType = targetSelectorType;
    }

    /**
     *
     * @param targetSelectorType The target selector type.
     * @param targetSelectorArguments The target selector arguments.
     */
    public TargetSelector(TargetSelectorType targetSelectorType, List<TargetSelectorArgument> targetSelectorArguments) {
        this.targetSelectorType = targetSelectorType;
        this.targetSelectorArguments.addAll(targetSelectorArguments);
    }

    public TargetSelector(TargetSelectorType targetSelectorType, TargetSelectorArgument targetSelectorArgument) {
        this.targetSelectorType = targetSelectorType;
        this.targetSelectorArguments.add(targetSelectorArgument);
    }


    /**
     *
     * @return The selector type.
     */
    public TargetSelectorType getTargetSelectorType() {
        return targetSelectorType;
    }


    /**
     *
     * @return The arguments of this selector.
     */
    public List<TargetSelectorArgument> getTargetSelectorArguments() {
        return targetSelectorArguments;
    }


    /**
     *
     * @return The string representation of the TargetSelector.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(targetSelectorType.toString());

        for (TargetSelectorArgument argument : targetSelectorArguments) {
            result.append(argument.toString());
        }

        return result.toString();
    }
}