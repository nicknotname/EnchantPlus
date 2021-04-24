package com.nicknotname.EnchantPlus.inventory.events;

import com.nicknotname.EnchantPlus.commands.EnchantInvCmd;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EnchantInvBaseListener implements Listener {

    @EventHandler
    public void TestInvCancelClicks(InventoryClickEvent event){
            if(event.getView().getTitle().equals(EnchantInvCmd.testInvName)){
                if (event.getCurrentItem() != null) {
                        int slotClicked = event.getSlot();
                            if(!(event.getClickedInventory() instanceof PlayerInventory)){
                                event.setCancelled(true);
                            }else{
                                event.setCancelled(false);
                            }

                            if(event.getCurrentItem().getType() == Material.BARRIER){
                                event.getWhoClicked().closeInventory();
                            }
                    }
                }

            }


    @EventHandler
    public void TestInvCloseEvent(InventoryCloseEvent event){

        if(event.getPlayer() instanceof Player) {
            Player p = (Player) event.getPlayer();
            if(event.getView().getTitle().equals(EnchantInvCmd.testInvName)){
                ItemStack slot28 = event.getView().getTopInventory().getItem(28);
                if(slot28 != null){
                        Location playerLoc = p.getLocation();
                        World playerWorld = p.getWorld();

                        playerWorld.dropItem(playerLoc, slot28);
                }
            }
        }

    }

}
