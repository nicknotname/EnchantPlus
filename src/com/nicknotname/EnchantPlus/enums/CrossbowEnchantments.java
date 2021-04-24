package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;

public class CrossbowEnchantments {
    MULTISHOT(ChatColor.GREEN + "Multishot", Enchantment.MULTISHOT,1,Arrays.asList("Makes Crossbows shoot 3 arrows")),
    PIERCING(ChatColor.GREEN + "Piercing", Enchantment.PIERCING,4,Arrays.asList("Makes Crossbows shoot through mobs")),
    QUICK_CHARGE(ChatColor.GREEN + "Quick Charge", Enchantment.QUICK_CHARGE,3,Arrays.asList("Makes Crossbows charge up quicker")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

}
