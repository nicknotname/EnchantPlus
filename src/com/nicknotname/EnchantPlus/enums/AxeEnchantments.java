package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;

public enum AxeEnchantments {
    BANE_OF_ARTHROPODS(ChatColor.GREEN + "Bane Of Arthropods", Enchantment.DAMAGE_ARTHROPODS,5, Arrays.asList("Increases damage to spiders, bees, silverfish and endermites")),
    EFFICIENCY(ChatColor.GREEN + "Efficiency", Enchantment.DIG_SPEED,5, Arrays.asList("Increases Mining Speed")),
    FORTUNE(ChatColor.GREEN + "Fortune", Enchantment.LOOT_BONUS_BLOCKS,3,Arrays.asList("Increases the chance of specific item drops from blocks")),
    SHARPNESS(ChatColor.GREEN + "Sharpness", Enchantment.DAMAGE_ALL,5,Arrays.asList("Increases Melee Damage")),
    SILK_TOUCH(ChatColor.GREEN + "Silk Touch", Enchantment.SILK_TOUCH,1,Arrays.asList("Allows many blocks to drop themselves")),
    SMITE(ChatColor.GREEN + "Smite", Enchantment.DAMAGE_UNDEAD, 5,Arrays.asList("Increases damage to undead mobs")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    }
