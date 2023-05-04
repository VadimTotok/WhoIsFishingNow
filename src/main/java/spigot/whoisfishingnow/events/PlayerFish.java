package spigot.whoisfishingnow.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class PlayerFish implements Listener {

    @EventHandler
    public void onFish(PlayerFishEvent event) {
        Player player = event.getPlayer();

        if (event.getState().equals(PlayerFishEvent.State.CAUGHT_FISH)) {
            int x = event.getHook().getLocation().getBlockX();
            int y = event.getHook().getLocation().getBlockX();
            int z = event.getHook().getLocation().getBlockX();

            event.getPlayer().getServer().getConsoleSender().sendMessage(ChatColor.WHITE + "[WhoIsFishing] " + "Player name: " + player.getName() + " " + "X:" + x +"," + "Y:" + y + "," + "Z:" + z);
        }
    }
}