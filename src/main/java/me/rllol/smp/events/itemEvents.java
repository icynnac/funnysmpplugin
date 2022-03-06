package me.rllol.smp.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class itemEvents implements Listener {
    @EventHandler
    public void h(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getItem() != null) {
            if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lCocaine")) {
                if (e.getAction().isRightClick()) {
                    p.sendMessage("§cWhy do you do this to yourself.");
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 240 * 20, 3));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 60 * 20, 0));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 120 * 20, 0));
                    p.getEquipment().setItem(Objects.requireNonNull(e.getHand()), null);
                }
            } else if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6§lBaked Potato Sword")) {
                if (e.getAction().isRightClick()) {
                    p.setFoodLevel(p.getFoodLevel() + 5);
                    p.sendMessage("§6mmm yummy blade");
                }
            }
        }
    }
}