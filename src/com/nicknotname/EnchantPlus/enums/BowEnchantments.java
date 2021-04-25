package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum BowEnchantments {
    FLAME(ChatColor.GREEN + "Flame", Enchantment.ARROW_FIRE,1, Arrays.asList("Makes your bow shoot flaming arrows")),
    INFINITY(ChatColor.GREEN + "Infinity", Enchantment.ARROW_INFINITE,1,Arrays.asList("Makes your bow only need one arrow")),
    POWER(ChatColor.GREEN + "Power", Enchantment.ARROW_DAMAGE,5,Arrays.asList("Makes Bows stronger")),
    PUNCH(ChatColor.GREEN + "Punch", Enchantment.ARROW_KNOCKBACK,2,Arrays.asList("Makes Bows knock entities back further")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    ;

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    BowEnchantments(String name, Enchantment enchantment,int maxLevel,List<String> lore){
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
