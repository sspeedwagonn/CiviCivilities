package net.civicraft.civiCivilities.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoinEvent implements Listener {
    public static boolean canWelcome = false;
    /*
    Starts a timer for welcomes and welcome backs
    Also sends a custom join message
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (!player.hasPlayedBefore()) {

        } else {

        }
    }
}
