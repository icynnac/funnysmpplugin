package me.rllol.smp.events;

import me.rllol.smp.SMP;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.Objects;

public class itemEvents implements Listener {
    @EventHandler
    public void h(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        BukkitScheduler scheduler = Bukkit.getScheduler();
        if (e.getItem() != null) {
            if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lCocaine")) {
                if (e.getAction().isRightClick()) {
                    p.sendMessage("§cWhy do you do this to yourself.");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 240 * 20, 3));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60 * 20, 0));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120 * 20, 0));
                    p.getEquipment().setItem(Objects.requireNonNull(e.getHand()), null);
                }
            } else if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lBaked Potato Sword")
            && e.getAction().isRightClick() && 20 > p.getFoodLevel()) {
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 7*20, 2));
                int soundrepeat = scheduler.scheduleSyncRepeatingTask(SMP.plugin, () -> {
                        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 1, 1);
                },0, 4);
                scheduler.scheduleSyncDelayedTask(SMP.plugin, () -> {
                    scheduler.cancelTask(soundrepeat);
                    p.removePotionEffect(PotionEffectType.SLOW);
                    if (p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§6§lBaked Potato Sword")) {
                        p.playSound(p.getLocation(), Sound.ENTITY_PLAYER_BURP, 1, 1);
                        p.setFoodLevel(p.getFoodLevel() + 10);
                        p.setSaturation(p.getSaturation() + 10);
                        p.getEquipment().setItemInMainHand(new ItemStack(Material.AIR));
                        p.sendMessage("§6mmm yummy blade");
                    }
                }, 3*20);

            }
        }
    }
}