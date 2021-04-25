package com.nicknotname.EnchantPlus.inventory.events;

import com.nicknotname.EnchantPlus.commands.EnchantInvCmd;
import com.nicknotname.EnchantPlus.enums.ToolType;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import javax.tools.Tool;

public class EnchantInvBookClickListener implements Listener {

    public void EnchantBookClickEvent(InventoryClickEvent event){
        if(event.getWhoClicked() instanceof Player){
            if(event.getView().getTitle().equals(EnchantInvCmd.testInvName)){
                if(event.getCurrentItem() != null){
                    if(event.getCurrentItem().getType() == Material.ENCHANTED_BOOK){
                        if(event.getInventory().getItem(28) != null){
                            ItemStack item28 = event.getInventory().getItem(28);
                            Material item28Material = item28.getType();

                            ToolType item28ToolType = EnchantInvItemInListener.isEnchantable(item28Material);

                            

                        }
                    }
                }
            }
        }
    }

}
