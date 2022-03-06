package me.rllol.smp.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

public class items {
    public static void init() {
        //no im not british. it means initialize.
        createSSS();
        createCoke();
        createPotatoSword();
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

        ShapedRecipe srM = new ShapedRecipe(NamespacedKey.minecraft("smoothstonesword"), sss);
        srM.shape(" S ", " S ", " T ");
        srM.setIngredient('S', Material.STONE);
        srM.setIngredient('T', Material.STICK);
        Bukkit.getServer().addRecipe(srM);
    }
    private static void createCoke() {
        ItemStack c = new ItemStack(Material.SUGAR);
        ItemMeta cM = c.getItemMeta();
        cM.setDisplayName("§6§lCocaine");
        ArrayList<String> cL = new ArrayList<>();
        cL.add("§7This item will get you on a watchlist.");
        cL.add("§7[§a+§7] §9Speed IV 4:00");
        cL.add("§7[§c-§7] §9Nausea I 2:00");
        cL.add("§7[§c-§7] §9Poison I 1:00");
        cM.setLore(cL);
        cM.addEnchant(Enchantment.LUCK, 0, true);
        cM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        c.setItemMeta(cM);

        ShapelessRecipe shapelessRecipe = new ShapelessRecipe(NamespacedKey.minecraft("coke"), c);
        shapelessRecipe.addIngredient(Material.SUGAR);
        shapelessRecipe.addIngredient(Material.QUARTZ);
        shapelessRecipe.addIngredient(Material.BLAZE_POWDER);
        Bukkit.getServer().addRecipe(shapelessRecipe);
    }
    private static void createPotatoSword() {
        ItemStack sword = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta swordM = sword.getItemMeta();
        swordM.setDisplayName("§6§lBaked Potato Sword");
        ArrayList<String> swordL = new ArrayList<>();
        swordL.add("§7An edible sword!");
        swordM.setLore(swordL);
        sword.setItemMeta(swordM);

        ShapedRecipe potatsword = new ShapedRecipe(NamespacedKey.minecraft("potatsword"), sword);
        potatsword.shape(" P ", " P ", " T ");
        potatsword.setIngredient('P', Material.BAKED_POTATO);
        potatsword.setIngredient('T', Material.STICK);
        Bukkit.getServer().addRecipe(potatsword);
    }
}
