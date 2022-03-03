package me.rllol.smp.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.UUID;

public class items {
    public static ItemStack smoothstonesword;

    public static void init() {
        //no im not british. it means initialize.
        createSSS();
    }

    private static void createSSS() {
        ItemStack sss = new ItemStack(Material.STONE_SWORD);
        ItemMeta sssM = sss.getItemMeta();
        sssM.setDisplayName("§aSmooth Stone Sword");
        ArrayList<String> sssL = new ArrayList<>();
        sssL.add("§fLike a stone sword, but smoother!");
        sssM.setLore(sssL);
        AttributeModifier dmgmodifier = new AttributeModifier(UUID.randomUUID(), "generic.attackdamage", 6, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        sssM.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, dmgmodifier);
        sss.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        sss.setItemMeta(sssM);
        smoothstonesword = sss;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("smoothstonesword"), sss);
        sr.shape(" S ", " S ", " T ");
        sr.setIngredient('S', Material.STONE);
        sr.setIngredient('T', Material.STICK);
        Bukkit.getServer().addRecipe(sr);
    }
}
