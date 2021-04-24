package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum TurtleShellEnchantments {
    AQUA_AFFINITY(ChatColor.GREEN + "Aqua Affinity", Enchantment.WATER_WORKER,1, Arrays.asList("Makes Mining Underwater faster")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    ;
    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    }
