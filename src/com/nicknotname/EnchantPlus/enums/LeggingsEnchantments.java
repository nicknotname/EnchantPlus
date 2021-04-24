package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum LeggingsEnchantments {
    AQUA_AFFINITY(ChatColor.GREEN + "Aqua Affinity", Enchantment.WATER_WORKER,1, Arrays.asList("Makes Mining Underwater faster")),
    FIRE_PROTECTION(ChatColor.GREEN + "Fire Protection", Enchantment.PROTECTION_FIRE,4, Arrays.asList("Reduces damage from fire")),
    PROJECTILE_PROTECTION(ChatColor.GREEN + "Projectile Protection", Enchantment.PROTECTION_PROJECTILE,4,Arrays.asList("Reduces damage from arrows")),
    PROTECTION(ChatColor.GREEN + "Protection", Enchantment.PROTECTION_ENVIRONMENTAL,4,Arrays.asList("Reduces damage in general")),
    THORNS(ChatColor.GREEN + "Thorns", Enchantment.THORNS,3,Arrays.asList("69 for damage")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    }
