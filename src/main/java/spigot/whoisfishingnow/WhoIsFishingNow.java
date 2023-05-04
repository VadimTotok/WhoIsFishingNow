package spigot.whoisfishingnow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.whoisfishingnow.events.PlayerFish;

public final class WhoIsFishingNow extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerFish(), this);
    }
}