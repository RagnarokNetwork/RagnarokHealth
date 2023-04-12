package net.ragnaroknetwork.ragnarokshrug;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RagnarokHealth extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new Placeholder(this).register();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
