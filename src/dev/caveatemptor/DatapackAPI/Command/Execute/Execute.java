package dev.caveatemptor.DatapackAPI.Command.Execute;

import dev.caveatemptor.DatapackAPI.Command.Command;

public class Execute implements Command {
    // TODO: implement // https://minecraft.fandom.com/wiki/Commands/execute

    ExecuteSubCommand[] subCommands;

    public Execute(ExecuteSubCommand[] subCommands) {
        this.subCommands = subCommands;
    }


    @Override
    public String generate() {
        StringBuilder generated = new StringBuilder("execute ");

        for (ExecuteSubCommand subCommand : subCommands) {
            generated.append(subCommand.generate()).append(" ");
        }

        return generated.toString();
    }
}
