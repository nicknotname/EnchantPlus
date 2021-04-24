package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;

public class FishingRodEnchantments {
    LUCK_OF_THE_SEA(ChatColor.GREEN + "Luck", Enchantment.LUCK,3,Arrays.asList("Makes treasure more likely to be fished up")),
    LURE(ChatColor.GREEN + "Lure", Enchantment.LURE,3,Arrays.asList("Makes catching an item quicker")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

}
