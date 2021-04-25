package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum FishingRodEnchantments {
    LUCK_OF_THE_SEA(ChatColor.GREEN + "Luck", Enchantment.LUCK,3,Arrays.asList("Makes treasure more likely to be fished up")),
    LURE(ChatColor.GREEN + "Lure", Enchantment.LURE,3,Arrays.asList("Makes catching an item quicker")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    ;
    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    FishingRodEnchantments(String name, Enchantment enchantment,int maxLevel,List<String> lore){
        this.name = name;
        this.enchantment = enchantment;
        this.maxLevel = maxLevel;
        this.lore = lore;
    }

    public String getName() {
        return name;
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public List<String> getLore() {
        return lore;
    }
}
