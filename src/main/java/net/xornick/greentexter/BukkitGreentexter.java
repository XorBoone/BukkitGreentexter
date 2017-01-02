package net.xornick.greentexter;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitGreentexter extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BukkitGreentexterListener(), this);
    }
}
