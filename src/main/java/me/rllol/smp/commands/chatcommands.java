package me.rllol.smp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class chatcommands implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            switch (label.toLowerCase()) {
                case "heart":
                    p.chat("§c❤");
                    break;
                case "boop":
                    if (args.length > 0) {
                        Player t = Bukkit.getPlayer(args[0]);
                        p.sendMessage("§6SMP §8>> §d§lYou Booped " + t.getName() + "!");
                        t.sendMessage("§6SMP §8>> §d§l" + p.getName() + " has Booped you!");
                    }
                    break;
            }
        }
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        return null;
    }
}
