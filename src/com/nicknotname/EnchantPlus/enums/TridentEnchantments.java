package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum TridentEnchantments {
    CHANNELING(ChatColor.GREEN + "Channeling", Enchantment.CHANNELING,1,Arrays.asList("Produces Lightning if a trident hits a mob in a thunderstorm")),
    IMPALING(ChatColor.GREEN + "Impaling", Enchantment.IMPALING,5,Arrays.asList("Makes your trident do extra damage to aquatic mobs")),
    LOYALTY(ChatColor.GREEN + "Loyalty", Enchantment.LOYALTY,3,Arrays.asList("Makes the trident return when thrown")),
    RIPTIDE(ChatColor.GREEN + "Riptide", Enchantment.RIPTIDE,3,Arrays.asList("Shoot yourself when in water with a Trident")),
    SHARPNESS(ChatColor.GREEN + "Sharpness", Enchantment.DAMAGE_ALL,5,Arrays.asList("Increases Melee Damage")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;
}
