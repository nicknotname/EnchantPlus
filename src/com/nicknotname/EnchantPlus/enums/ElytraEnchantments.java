package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;

public enum ElytraEnchantments {
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3, Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

}
