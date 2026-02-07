package net.civicraft.civiCivilities.command;

import net.civicraft.civiCivilities.event.OnPlayerJoinEvent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class WelcomeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        if (OnPlayerJoinEvent.canWelcome) {

            return true;
        } else {
            commandSender.sendMessage("No one has joined recently!");
            return false;
        }
    }
    /*
    Player runs /welcome or /wb or another custom command which welcomes all players who joined in the past 30 seconds
     */

}
