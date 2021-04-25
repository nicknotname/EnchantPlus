package com.nicknotname.EnchantPlus.enums;

import com.mysql.fabric.xmlrpc.base.Array;
import org.bukkit.Material;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public enum ToolType {
    AXE(Arrays.asList(Material.WOODEN_AXE,Material.STONE_AXE,Material.IRON_AXE,Material.DIAMOND_AXE,Material.NETHERITE_AXE)),
    BOOTS(Arrays.asList(Material.LEATHER_BOOTS,Material.IRON_BOOTS,Material.DIAMOND_BOOTS,Material.NETHERITE_BOOTS)),
    BOW(Arrays.asList(Material.BOW)),
    CHESTPLATE(Arrays.asList(Material.LEATHER_CHESTPLATE,Material.IRON_BOOTS,Material.DIAMOND_BOOTS,Material.NETHERITE_BOOTS)),
    CROSSBOW(Arrays.asList(Material.CROSSBOW)),
    ELYTRA(Arrays.asList(Material.ELYTRA)),
    FISHING_ROD(Arrays.asList(Material.FISHING_ROD)),
    HELMET(Arrays.asList(Material.LEATHER_HELMET,Material.IRON_HELMET,Material.DIAMOND_HELMET,Material.NETHERITE_HELMET)),
    HOE(Arrays.asList(Material.WOODEN_HOE,Material.STONE_HOE,Material.IRON_HOE,Material.DIAMOND_HOE,Material.NETHERITE_HOE)),
    LEGGINGS(Arrays.asList(Material.LEATHER_LEGGINGS,Material.IRON_LEGGINGS,Material.DIAMOND_LEGGINGS,Material.NETHERITE_LEGGINGS)),
    PICKAXE(Arrays.asList(Material.WOODEN_PICKAXE,Material.STONE_PICKAXE,Material.IRON_PICKAXE,Material.DIAMOND_PICKAXE,Material.NETHERITE_PICKAXE)),
    SHOVEL(Arrays.asList(Material.WOODEN_SHOVEL,Material.STONE_SHOVEL,Material.IRON_SHOVEL,Material.DIAMOND_SHOVEL,Material.NETHERITE_SHOVEL)),
    SWORD(Arrays.asList(Material.WOODEN_SWORD,Material.STONE_SWORD,Material.IRON_SWORD,Material.DIAMOND_SWORD,Material.NETHERITE_SWORD)),
    TRIDENT(Arrays.asList(Material.TRIDENT)),
    TURTLE_HELMET(Arrays.asList(Material.TURTLE_HELMET)),
    OTHER(Arrays.asList(Material.RED_DYE))
    ;

    private final List<Material> toolList;

    ToolType(List<Material> toolList){
        this.toolList = toolList;
    }

    public List<Material> getToolList() {
        return toolList;
    }
}
