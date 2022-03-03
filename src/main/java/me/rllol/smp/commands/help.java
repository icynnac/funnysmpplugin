package me.rllol.smp.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static me.rllol.smp.util.messages.sendInteractiveMessage;

public class help implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender,  Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Runtime runtime = Runtime.getRuntime();
            if (args.length > 0) {
                TextComponent previous = new TextComponent("§e<<<");
                previous.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to go to the last page.").create()));
                TextComponent next = new TextComponent("§e>>>");
                next.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click to go to the next page.").create()));
                TextComponent inbetween = new TextComponent("§6=-=-=-=-=-=-=-=-=-=-=-=-="); TextComponent inbetweenplus = new TextComponent("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-="); TextComponent inbetweenminus = new TextComponent("§6=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                switch (args[0].toLowerCase()) {
                    case "commands":
                        if (args.length > 1) {
                            switch (args[1].toLowerCase()) {
                                case "1":
                                    next.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/help commands 2"));
                                    p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                    sendInteractiveMessage(p, "§e/afk §8- §6Notify everyone you're afk.", "/afk", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /afk");
                                    sendInteractiveMessage(p, "§e/colorcodes §8- §6A simple color code guide.", "/colorcodes", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /colorcodes");
                                    sendInteractiveMessage(p, "§e/createhome §8- §6Create a /home", "/createhome", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /createhome");
                                    sendInteractiveMessage(p, "§e/delhome §8- §cdelete a home. you didn't like it anyway.", "/delhome home", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /delhome");
                                    sendInteractiveMessage(p, "§e/mail §8- §eYou've got mail!", "/mail ", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /mail");
                                    sendInteractiveMessage(p, "§e/msg §8- §6Send someone a message.", "/msg (player name)", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /msg");
                                    p.spigot().sendMessage(inbetweenplus, next);
                                    break;
                                case "2":
                                    previous.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/help commands 1"));
                                    next.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/help commands 3"));
                                    p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                    sendInteractiveMessage(p, "§e/msgtoggle §8- §6Turn on/off getting messages.", "/msgtoggle", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /msgtoggle");
                                    sendInteractiveMessage(p, "§e/ping §8- §6Pong! See your connection to the server.", "/ping", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /ping");
                                    sendInteractiveMessage(p, "§e/r §8- §6Reply to someone.", "/r (player)", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /r");
                                    sendInteractiveMessage(p, "§e/sit §8- §6take a seat.", "/sit", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /sit");
                                    sendInteractiveMessage(p, "§e/tomap §8- §6Convert an image to mapart.", "/tomap (Image URL [a URL ending in .png,.jpg, etc.])", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tomap");
                                    sendInteractiveMessage(p, "§e/tpa §8- §6Ask to teleport to someone.", "/tpa (player name)", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tpa");
                                    p.spigot().sendMessage(previous, inbetween, next);
                                    break;
                                case "3":
                                    previous.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/help commands 2"));
                                    p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                    sendInteractiveMessage(p, "§e/tpacancel §8- §6Cancel a sent tpa/tpahere request.", "/tpacancel", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tpacancel");
                                    sendInteractiveMessage(p, "§e/tpaccept §8- §6Accept someone's teleport request.", "/tpaccept", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tpaccept");
                                    sendInteractiveMessage(p, "§e/tpdeny §8- §6Deny someone's teleport request.", "/tpdeny", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tpdeny");
                                    sendInteractiveMessage(p, "§e/tpahere §8- §6Teleport someone to you.", "/tpahere (player)", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tpahere");
                                    sendInteractiveMessage(p, "§e/tptoggle §8- §6Turn on/off teleport requests", "/tptoggle", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /tptoggle");
                                    p.spigot().sendMessage(previous, inbetweenminus);
                                    break;
                            }
                        } else {
                            next.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/help commands 2"));
                            p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            sendInteractiveMessage(p, "§e/afk §8- §6Notify everyone you're afk.", "/afk", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /afk");
                            sendInteractiveMessage(p, "§e/colorcodes §8- §6A simple color code guide.", "/colorcodes", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /colorcodes");
                            sendInteractiveMessage(p, "§e/createhome §8- §6Create a /home", "/createhome", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /createhome");
                            sendInteractiveMessage(p, "§e/delhome §8- §cdelete a home. you didn't like it anyway.", "/delhome home", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /delhome");
                            sendInteractiveMessage(p, "§e/mail §8- §eYou've got mail!", "/mail ", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /mail");
                            sendInteractiveMessage(p, "§e/msg §8- §6Send someone a message.", "/msg (player name)", ClickEvent.Action.SUGGEST_COMMAND, "Click to use /msg");
                            p.spigot().sendMessage(inbetweenplus, next);
                        }
                        break;
                    case "sysinfo":
                        p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        p.sendMessage("§bServer IP: icynnac.apexmc.co");
                        p.sendMessage("§bPlayers: " + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers());
                        p.sendMessage("§bSoftware: " + Bukkit.getServer().getVersion());
                        p.sendMessage("§bRAM: " + (runtime.freeMemory() / 1048576) + "MB /" + (runtime.totalMemory() / 1048576) + "MB");
                        p.sendMessage("§bWorld: " + p.getWorld().getName());
                        p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        break;
                    case "plugins":

                }
            } else {
                p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                sendInteractiveMessage(p, "§a§lCommands", "/help commands", ClickEvent.Action.RUN_COMMAND, "§fClick to see §a§lCommands.");
                sendInteractiveMessage(p, "§b§lServer Info", "/help sysinfo", ClickEvent.Action.RUN_COMMAND, "§fClick to see §b§lServer Info.");
                p.sendMessage("§6-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete( CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) new ArrayList<>(Arrays.asList("commands", "sysinfo"));
        return new ArrayList<>();
    }
}
