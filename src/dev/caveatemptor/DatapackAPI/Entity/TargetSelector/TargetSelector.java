package dev.caveatemptor.DatapackAPI.Entity.TargetSelector;

import dev.caveatemptor.DatapackAPI.Entity.Entity;

import java.util.ArrayList;
import java.util.List;


/**
 * Selects the entities a command will affect.
 */
public class TargetSelector implements Entity {
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
     * Converts the TargetSelector into a String usable in mcfunctions
     * @return The string representation of the TargetSelector.
     */
    @Override
    public String generate() {
        StringBuilder result = new StringBuilder(targetSelectorType.generate());

        for (TargetSelectorArgument argument : targetSelectorArguments) {
            result.append(argument.generate());
        }

        return result.toString();
    }
}