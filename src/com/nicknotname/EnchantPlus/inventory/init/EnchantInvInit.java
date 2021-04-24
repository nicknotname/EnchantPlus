package com.nicknotname.EnchantPlus.inventory.init;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantInvInit {

    public static String blackStainedGlassPaneName = ChatColor.BOLD + "egg";
    public static String toolSignName = ChatColor.BOLD + "Place your item below";
    public static String enchantTableName = ChatColor.DARK_AQUA + "Click here after inserting item!";



    public static Inventory testInvInit(Inventory inv){
        int slotNumber = inv.getSize();
        for(int slot = 0; slot < slotNumber; slot++){
            //<editor-fold desc="Black Stained Glass Pane">
            ItemStack blackStainedGlassPane = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemMeta blackStainedGlassPaneMeta = blackStainedGlassPane.getItemMeta();
            blackStainedGlassPaneMeta.setDisplayName(blackStainedGlassPaneName);
            blackStainedGlassPane.setItemMeta(blackStainedGlassPaneMeta);
            inv.setItem(slot,blackStainedGlassPane);
            //</editor-fold>

            //<editor-fold desc="Tool Sign">
            ItemStack toolSign = new ItemStack(Material.OAK_SIGN);
            ItemMeta toolSignMeta = toolSign.getItemMeta();
            toolSignMeta.setDisplayName(toolSignName);
            toolSign.setItemMeta(toolSignMeta);
            inv.setItem(19,toolSign);
            //</editor-fold>

            //<editor-fold desc="Air">
            ItemStack air = new ItemStack(Material.AIR);
            inv.setItem(28,air);
            //</editor-fold>

            //<editor-fold desc="Enchant Table">
            ItemStack enchantTable = new ItemStack(Material.ENCHANTING_TABLE);
            ItemMeta enchantTableMeta = enchantTable.getItemMeta();
            enchantTableMeta.setDisplayName(enchantTableName);
            enchantTable.setItemMeta(enchantTableMeta);
            inv.setItem(37, enchantTable);
            //</editor-fold>

            //<editor-fold desc="CloseBarrier">
            ItemStack closeBarrier = new ItemStack(Material.BARRIER);
            ItemMeta closeBarrierMeta = closeBarrier.getItemMeta();
            closeBarrierMeta.setDisplayName(ChatColor.RED + "Close");
            closeBarrier.setItemMeta(closeBarrierMeta);
            inv.setItem(49,closeBarrier);
            //</editor-fold>
        }

        return inv;

    }
}
