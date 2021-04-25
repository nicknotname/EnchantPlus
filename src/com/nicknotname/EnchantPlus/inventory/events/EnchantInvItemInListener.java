package com.nicknotname.EnchantPlus.inventory.events;

import com.nicknotname.EnchantPlus.commands.EnchantInvCmd;
import com.nicknotname.EnchantPlus.enums.*;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class EnchantInvItemInListener implements Listener {

    public ItemStack unableEnchant= new ItemStack(Material.RED_DYE);
    public ItemMeta unableEnchantMeta = unableEnchant.getItemMeta();
    public static String unableEnchantName = ChatColor.RED + "UNABLE TO ENCHANT THIS ITEM";

    public static ToolType isEnchantable(Material item){

        for(ToolType toolType: ToolType.values()){
            List<Material> toolList = toolType.getToolList();
            if(toolList.contains(item)){
                return toolType;
            }
        }

        return ToolType.OTHER;
    }

    @EventHandler
    public void ItemPutInEvent(InventoryClickEvent event){
        if(event.getWhoClicked() instanceof Player){
            if (event.getView().getTitle().equals(EnchantInvCmd.testInvName)){
                if(event.getInventory().getItem(28) != null){
                    Player p = (Player) event.getWhoClicked();
                    Material itemType = event.getInventory().getItem(28).getType();

                    Inventory eventInventory = event.getInventory();
                    ToolType toolType = isEnchantable(itemType);

                    switch (toolType){
                        case AXE:
                            int axeIndex = 0;
                            for(AxeEnchantments axeEnchantments : AxeEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(axeIndex);

                                ItemStack axeEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta axeEnchantmentBookMeta = (EnchantmentStorageMeta) axeEnchantmentBook.getItemMeta();
                                axeEnchantmentBookMeta.setDisplayName(axeEnchantments.getName());
                                axeEnchantmentBookMeta.setLore(axeEnchantments.getLore());
                                axeEnchantmentBookMeta.addStoredEnchant(axeEnchantments.getEnchantment(),1,false);
                                axeEnchantmentBook.setItemMeta(axeEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,axeEnchantmentBook);


                                axeIndex++;
                            }
                            break;
                        case BOOTS:
                            int bootsIndex = 0;
                            for(BootsEnchantments bootsEnchantments : BootsEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(bootsIndex);

                                ItemStack bootsEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta bootsEnchantmentBookMeta = (EnchantmentStorageMeta) bootsEnchantmentBook.getItemMeta();
                                bootsEnchantmentBookMeta.setDisplayName(bootsEnchantments.getName());
                                bootsEnchantmentBookMeta.setLore(bootsEnchantmentBookMeta.getLore());
                                bootsEnchantmentBookMeta.addStoredEnchant(bootsEnchantments.getEnchantment(),1,false);
                                bootsEnchantmentBook.setItemMeta(bootsEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,bootsEnchantmentBook);


                                bootsIndex++;
                            }
                            break;
                        case BOW:
                            int bowIndex = 0;
                            for(BowEnchantments bowEnchantments : BowEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(bowIndex);

                                ItemStack bowEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta bowEnchantmentBookMeta = (EnchantmentStorageMeta) bowEnchantmentBook.getItemMeta();
                                bowEnchantmentBookMeta.setDisplayName(bowEnchantments.getName());
                                bowEnchantmentBookMeta.setLore(bowEnchantments.getLore());
                                bowEnchantmentBookMeta.addStoredEnchant(bowEnchantments.getEnchantment(),1,false);
                                bowEnchantmentBook.setItemMeta(bowEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,bowEnchantmentBook);


                                bowIndex++;
                            }
                            break;
                        case CHESTPLATE:
                            int chestplateIndex = 0;
                            for(ChestplateEnchantments chestplateEnchantments : ChestplateEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(chestplateIndex);

                                ItemStack chestplateEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta chestplateEnchantmentBookMeta = (EnchantmentStorageMeta) chestplateEnchantmentBook.getItemMeta();
                                chestplateEnchantmentBookMeta.setDisplayName(chestplateEnchantments.getName());
                                chestplateEnchantmentBookMeta.setLore(chestplateEnchantments.getLore());
                                chestplateEnchantmentBookMeta.addStoredEnchant(chestplateEnchantments.getEnchantment(),1,false);
                                chestplateEnchantmentBook.setItemMeta(chestplateEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,chestplateEnchantmentBook);


                                chestplateIndex++;
                            }
                            break;
                        case CROSSBOW:
                            int crossbowIndex = 0;
                            for(CrossbowEnchantments crossbowEnchantments : CrossbowEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(crossbowIndex);

                                ItemStack crossbowEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta crossbowEnchantmentBookMeta = (EnchantmentStorageMeta) crossbowEnchantmentBook.getItemMeta();
                                crossbowEnchantmentBookMeta.setDisplayName(crossbowEnchantments.getName());
                                crossbowEnchantmentBookMeta.setLore(crossbowEnchantments.getLore());
                                crossbowEnchantmentBookMeta.addStoredEnchant(crossbowEnchantments.getEnchantment(),1,false);
                                crossbowEnchantmentBook.setItemMeta(crossbowEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,crossbowEnchantmentBook);


                                crossbowIndex++;
                            }
                            break;
                        case ELYTRA:
                            int elytraIndex = 0;
                            for(ElytraEnchantments elytraEnchantments : ElytraEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(elytraIndex);

                                ItemStack elytraEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta elytraEnchantmentBookMeta = (EnchantmentStorageMeta) elytraEnchantmentBook.getItemMeta();
                                elytraEnchantmentBookMeta.setDisplayName(elytraEnchantments.getName());
                                elytraEnchantmentBookMeta.setLore(elytraEnchantments.getLore());
                                elytraEnchantmentBookMeta.addStoredEnchant(elytraEnchantments.getEnchantment(),1,false);
                                elytraEnchantmentBook.setItemMeta(elytraEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,elytraEnchantmentBook);


                                elytraIndex++;
                            }
                            break;
                        case FISHING_ROD:
                            int fishingRodIndex = 0;
                            for(FishingRodEnchantments fishingRodEnchantments : FishingRodEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(fishingRodIndex);

                                ItemStack fishingRodEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta fishingRodEnchantmentBookMeta = (EnchantmentStorageMeta) fishingRodEnchantmentBook.getItemMeta();
                                fishingRodEnchantmentBookMeta.setDisplayName(fishingRodEnchantments.getName());
                                fishingRodEnchantmentBookMeta.setLore(fishingRodEnchantments.getLore());
                                fishingRodEnchantmentBookMeta.addStoredEnchant(fishingRodEnchantments.getEnchantment(),1,false);
                                fishingRodEnchantmentBook.setItemMeta(fishingRodEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,fishingRodEnchantmentBook);


                                fishingRodIndex++;
                            }
                            break;
                        case HELMET:
                            int helmetIndex = 0;
                            for(HelmetEnchantments helmetEnchantments : HelmetEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(helmetIndex);

                                ItemStack helmetEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta helmetEnchantmentBookMeta = (EnchantmentStorageMeta) helmetEnchantmentBook.getItemMeta();
                                helmetEnchantmentBookMeta.setDisplayName(helmetEnchantments.getName());
                                helmetEnchantmentBookMeta.setLore(helmetEnchantments.getLore());
                                helmetEnchantmentBookMeta.addStoredEnchant(helmetEnchantments.getEnchantment(),1,false);
                                helmetEnchantmentBook.setItemMeta(helmetEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,helmetEnchantmentBook);


                                helmetIndex++;
                            }
                            break;
                        case HOE:
                            int hoeIndex = 0;
                            for(HoeEnchantments hoeEnchantments : HoeEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(hoeIndex);

                                ItemStack hoeEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta hoeEnchantmentBookMeta = (EnchantmentStorageMeta) hoeEnchantmentBook.getItemMeta();
                                hoeEnchantmentBookMeta.setDisplayName(hoeEnchantments.getName());
                                hoeEnchantmentBookMeta.setLore(hoeEnchantments.getLore());
                                hoeEnchantmentBookMeta.addStoredEnchant(hoeEnchantments.getEnchantment(),1,false);
                                hoeEnchantmentBook.setItemMeta(hoeEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,hoeEnchantmentBook);


                                hoeIndex++;
                            }
                            break;
                        case LEGGINGS:
                            int leggingsIndex = 0;
                            for(LeggingsEnchantments leggingsEnchantments : LeggingsEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(leggingsIndex);

                                ItemStack leggingsEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta leggingsEnchantmentBookMeta = (EnchantmentStorageMeta) leggingsEnchantmentBook.getItemMeta();
                                leggingsEnchantmentBookMeta.setDisplayName(leggingsEnchantments.getName());
                                leggingsEnchantmentBookMeta.setLore(leggingsEnchantments.getLore());
                                leggingsEnchantmentBookMeta.addStoredEnchant(leggingsEnchantments.getEnchantment(),1,false);
                                leggingsEnchantmentBook.setItemMeta(leggingsEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,leggingsEnchantmentBook);


                                leggingsIndex++;
                            }
                            break;
                        case PICKAXE:
                            int pickaxeIndex = 0;
                            for(PickaxeEnchantments pickaxeEnchantments : PickaxeEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(pickaxeIndex);

                                ItemStack pickaxeEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta pickaxeEnchantmentBookMeta = (EnchantmentStorageMeta) pickaxeEnchantmentBook.getItemMeta();
                                pickaxeEnchantmentBookMeta.setDisplayName(pickaxeEnchantments.getName());
                                pickaxeEnchantmentBookMeta.setLore(pickaxeEnchantments.getLore());
                                pickaxeEnchantmentBookMeta.addStoredEnchant(pickaxeEnchantments.getEnchantment(),1,false);
                                pickaxeEnchantmentBook.setItemMeta(pickaxeEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,pickaxeEnchantmentBook);


                                pickaxeIndex++;
                            }
                            break;
                        case SHOVEL:
                            int shovelIndex = 0;
                            for(ShovelEnchantments shovelEnchantments : ShovelEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(shovelIndex);

                                ItemStack shovelEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta shovelEnchantmentBookMeta = (EnchantmentStorageMeta) shovelEnchantmentBook.getItemMeta();
                                shovelEnchantmentBookMeta.setDisplayName(shovelEnchantments.getName());
                                shovelEnchantmentBookMeta.setLore(shovelEnchantments.getLore());
                                shovelEnchantmentBookMeta.addStoredEnchant(shovelEnchantments.getEnchantment(),1,false);
                                shovelEnchantmentBook.setItemMeta(shovelEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,shovelEnchantmentBook);


                                shovelIndex++;
                            }
                            break;
                        case SWORD:
                            int swordIndex = 0;
                            for(SwordEnchantments swordEnchantments : SwordEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(swordIndex);

                                ItemStack swordEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta swordEnchantmentBookMeta = (EnchantmentStorageMeta) swordEnchantmentBook.getItemMeta();
                                swordEnchantmentBookMeta.setDisplayName(swordEnchantments.getName());
                                swordEnchantmentBookMeta.setLore(swordEnchantments.getLore());
                                swordEnchantmentBookMeta.addStoredEnchant(swordEnchantments.getEnchantment(),1,false);
                                swordEnchantmentBook.setItemMeta(swordEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,swordEnchantmentBook);


                                swordIndex++;
                            }
                            break;
                        case TRIDENT:
                            int tridentIndex = 0;
                            for(TridentEnchantments tridentEnchantments : TridentEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(tridentIndex);

                                ItemStack tridentEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta tridentEnchantmentBookMeta = (EnchantmentStorageMeta) tridentEnchantmentBook.getItemMeta();
                                tridentEnchantmentBookMeta.setDisplayName(tridentEnchantments.getName());
                                tridentEnchantmentBookMeta.setLore(tridentEnchantments.getLore());
                                tridentEnchantmentBookMeta.addStoredEnchant(tridentEnchantments.getEnchantment(),1,false);
                                tridentEnchantmentBook.setItemMeta(tridentEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,tridentEnchantmentBook);


                                tridentIndex++;
                            }
                            break;
                        case TURTLE_HELMET:
                            int turtleHelmetIndex = 0;
                            for(TurtleHelmetEnchantments turtleShellEnchantments : TurtleHelmetEnchantments.values()){
                                List<Integer> InvSlots = Arrays.asList(13,14,15,16,22,23,24,25,31,32,33,34,40,41,42,43);
                                int invSlot = InvSlots.get(turtleHelmetIndex);

                                ItemStack turtleShellEnchantmentBook = new ItemStack(Material.ENCHANTED_BOOK);
                                EnchantmentStorageMeta turtleShellEnchantmentBookMeta = (EnchantmentStorageMeta) turtleShellEnchantmentBook.getItemMeta();
                                turtleShellEnchantmentBookMeta.setDisplayName(turtleShellEnchantments.getName());
                                turtleShellEnchantmentBookMeta.setLore(turtleShellEnchantments.getLore());
                                turtleShellEnchantmentBookMeta.addStoredEnchant(turtleShellEnchantments.getEnchantment(),1,false);
                                turtleShellEnchantmentBook.setItemMeta(turtleShellEnchantmentBookMeta);

                                eventInventory.setItem(invSlot,turtleShellEnchantmentBook);


                                turtleHelmetIndex++;
                            }
                            break;
                    }

                    /*
                    if(){
                        unableEnchantMeta.setDisplayName(unableEnchantName);
                        unableEnchant.setItemMeta(unableEnchantMeta);
                        event.getInventory().setItem(32, unableEnchant);
                    }

                     */
                }
            }
        }
    }
}
