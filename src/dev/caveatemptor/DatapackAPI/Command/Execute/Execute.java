package dev.caveatemptor.DatapackAPI.Command.Execute;

import dev.caveatemptor.DatapackAPI.Command.Command;


/**
 * Represents the execute command.
 */
public class Execute implements Command {
    // TODO: implement // https://minecraft.fandom.com/wiki/Commands/execute

    ExecuteSubCommand[] subCommands;

    /**
     *
     * @param subCommands The subcommands of the execute command.
     */
    public Execute(ExecuteSubCommand[] subCommands) {
        this.subCommands = subCommands;
    }


    /**
     *
     * @return Generated command for use in-game.
     */
    @Override
    public String generate() {
        StringBuilder generated = new StringBuilder("execute ");

        for (ExecuteSubCommand subCommand : subCommands) {
            generated.append(subCommand.generate()).append(" ");
        }

        return generated.toString();
    }
}
