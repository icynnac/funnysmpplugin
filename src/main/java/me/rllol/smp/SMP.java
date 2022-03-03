package me.rllol.smp;

import me.rllol.smp.commands.colorsbook;
import me.rllol.smp.commands.help;
import me.rllol.smp.commands.ping;
import me.rllol.smp.items.items;
import org.bukkit.plugin.java.JavaPlugin;

public final class SMP extends JavaPlugin {

    @Override
    public void onEnable() {
        items.init();

        getCommand("ping").setExecutor(new ping());
        getCommand("colorcodes").setExecutor(new colorsbook());
        getCommand("help").setExecutor(new help());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
