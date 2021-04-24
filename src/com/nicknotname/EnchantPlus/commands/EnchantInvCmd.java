package com.nicknotname.EnchantPlus.commands;

import com.nicknotname.EnchantPlus.inventory.init.EnchantInvInit;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class EnchantInvCmd implements CommandExecutor {

    public static String testInvName = ChatColor.RED + "Enchantment Table";
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player){
            Inventory testInv = Bukkit.createInventory(null,54,testInvName);
            EnchantInvInit.testInvInit(testInv);
            ((Player) commandSender).openInventory(testInv);
            return true;
        } else{
            commandSender.sendMessage(ChatColor.RED + "You must be a Player to run this command");
            return true;
        }
    }
}
