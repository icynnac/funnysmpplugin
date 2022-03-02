package me.rllol.smp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length > 0) {
                Player t = Bukkit.getPlayer(args[0]);
                if (t != null) {
                    p.sendMessage("§6SMP §8>> §b"+ t.getName() + "'s ping is" + t.getPing() + "ms");
                }
            } else p.sendMessage("§6SMP §8>> §bYour ping is " + p.getPing() + "ms");
        } else sender.sendMessage("no");
        return false;
    }
}
