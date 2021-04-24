package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum  SwordEnchantments {
    BANE_OF_ARTHROPODS(ChatColor.GREEN + "Bane Of Arthropods", Enchantment.DAMAGE_ARTHROPODS,5,Arrays.asList("Increases damage to spiders, bees, silverfish and endermites")),
    FIRE_ASPECT(ChatColor.GREEN + "Fire Aspect", Enchantment.FIRE_ASPECT,2, Arrays.asList("Sets mobs on fire when they are hit")),
    KNOCKBACK(ChatColor.GREEN + "Knockback", Enchantment.KNOCKBACK,2,Arrays.asList("Knocks Mobs back on hit")),
    LOOTING(ChatColor.GREEN + "Looting", Enchantment.LOOT_BONUS_MOBS,3,Arrays.asList("Increases the chance of specific item drops from mobs")),
    SHARPNESS(ChatColor.GREEN + "Sharpness", Enchantment.DAMAGE_ALL,5,Arrays.asList("Increases Melee Damage")),
    SILK_TOUCH(ChatColor.GREEN + "Silk Touch", Enchantment.SILK_TOUCH,1,Arrays.asList("Allows many blocks to drop themselves")),
    SMITE(ChatColor.GREEN + "Smite", Enchantment.DAMAGE_UNDEAD, 5,Arrays.asList("Increases damage to undead mobs")),
    SWEEPING_EDGE(ChatColor.GREEN + "Sweeping Edge", Enchantment.SWEEPING_EDGE,3,Arrays.asList("Attacks mobs around the one you hit with less power")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;
}
