package me.rllol.smp.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Location loc = p.getLocation();
        if (args.length > 0) {
            Player t = Bukkit.getPlayer(args[0]);
            if (t != null) {
                p.sendMessage("§6SMP §8>> §b"+ t.getName() + "'s ping is " + t.getPing() + "ms");
                p.playSound(loc, Sound.ENTITY_VILLAGER_AMBIENT, 1,1);
            }
        } else {
            p.sendMessage("§6SMP §8>> §bYour ping is " + p.getPing() + "ms");
            p.playSound(loc, Sound.ENTITY_VILLAGER_AMBIENT, 1,1);
        }
        return false;
    }
}
