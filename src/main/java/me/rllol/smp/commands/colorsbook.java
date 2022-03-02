package me.rllol.smp.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.jetbrains.annotations.NotNull;

public class colorsbook implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta bookMeta = (BookMeta) book.getItemMeta();
            bookMeta.setAuthor("Icynnac");
            bookMeta.setTitle("Color Code Guide");
            bookMeta.addPage("Hello! This is a simple color code guide. \n \nChat Colors\n§0Black: &0 \n§1Dark Blue: &1 \n§2Dark Green: &2 \n§3Dark Aqua: &3 \n§4Dark Red: &4 \n§5Dark Purple: &5 \n§6Gold: &6 \n§7Light Grey: &7 \n§8Dark Grey: &8 \n§9Blue: &9");
            bookMeta.addPage("Extra Chat Colors \n§aGreen: &a \n§bAqua: &b \n§cLight Red: &c \n§dPink: &d \n§eYellow: &e \n§0White: &f §r\n\nChat Formatting \n§lBold: &l \n§r§oItalics: &o \n§r§mStrikethrough: &m \n§r§nUnderline: &n");
            book.setItemMeta(bookMeta);
            p.openBook(book);
        }
        return false;
    }
}
