package me.rllol.smp;

import me.rllol.smp.commands.chatcommands;
import me.rllol.smp.commands.colorsbook;
import me.rllol.smp.commands.help;
import me.rllol.smp.commands.ping;
import me.rllol.smp.events.chatEvent;
import me.rllol.smp.events.itemEvents;
import me.rllol.smp.items.items;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMP extends JavaPlugin {

    @Override
    public void onEnable() {
        items.init();

        getCommand("ping").setExecutor(new ping());
        getCommand("colorcodes").setExecutor(new colorsbook());
        getCommand("help").setExecutor(new help());
        getCommand("boop").setExecutor(new chatcommands());
        getCommand("heart").setExecutor(new chatcommands());

        Bukkit.getPluginManager().registerEvents(new itemEvents(), this);
        Bukkit.getPluginManager().registerEvents(new chatEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
