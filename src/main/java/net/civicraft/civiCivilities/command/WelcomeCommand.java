package net.civicraft.civiCivilities.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class WelcomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        return false;
    }
    /*
    Player runs /welcome or /wb or another custom command which welcomes all players who joined in the past 30 seconds
     */

}
