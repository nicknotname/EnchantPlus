package com.nicknotname.EnchantPlus.inventory.events;

import com.nicknotname.EnchantPlus.commands.EnchantInvCmd;
import com.nicknotname.EnchantPlus.enums.ToolType;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EnchantInvItemInListener implements Listener {

    public ItemStack unableEnchant= new ItemStack(Material.RED_DYE);
    public ItemMeta unableEnchantMeta = unableEnchant.getItemMeta();
    public static String unableEnchantName = ChatColor.RED + "UNABLE TO ENCHANT THIS ITEM";

    @EventHandler
    public void ItemPutInEvent(InventoryClickEvent event){
        if(event.getWhoClicked() instanceof Player){
            if (event.getView().getTitle().equals(EnchantInvCmd.testInvName)){
                if(event.getInventory().getItem(28) != null){
                    Material itemType = event.getInventory().getItem(28).getType();
                    List<Material> axeToolList = ToolType.AXE.getToolList();
                    if(axeToolList.contains(itemType)){
                        unableEnchantMeta.setDisplayName(unableEnchantName);
                        unableEnchant.setItemMeta(unableEnchantMeta);
                        event.getInventory().setItem(32, unableEnchant);
                    }
                }
            }
        }
    }
}
