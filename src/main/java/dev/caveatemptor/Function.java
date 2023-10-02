package dev.caveatemptor;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private String name;
    private final List<Command> commands;

    Function(String name) {
        name = name.toLowerCase();

        this.name = name;
        commands = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public List<Command> getCommands() {
        return commands;
    }

    public boolean addCommand(Command command) {
        commands.add(command);
        return true;
    }
}
