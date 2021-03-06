package com.nicknotname.EnchantPlus.enums;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;
import java.util.List;

public enum HelmetEnchantments {
    AQUA_AFFINITY(ChatColor.GREEN + "Aqua Affinity", Enchantment.WATER_WORKER, 1, Arrays.asList("Makes Mining Underwater faster")),
    BLAST_PROTECTION(ChatColor.GREEN + "Blast Protection", Enchantment.PROTECTION_EXPLOSIONS, 4, Arrays.asList("Reduces damage from explosions")),
    FIRE_PROTECTION(ChatColor.GREEN + "Fire Protection", Enchantment.PROTECTION_FIRE, 4, Arrays.asList("Reduces damage from fire")),
    PROJECTILE_PROTECTION(ChatColor.GREEN + "Projectile Protection", Enchantment.PROTECTION_PROJECTILE, 4, Arrays.asList("Reduces damage from arrows")),
    PROTECTION(ChatColor.GREEN + "Protection", Enchantment.PROTECTION_ENVIRONMENTAL, 4, Arrays.asList("Reduces damage in general")),
    RESPIRATION(ChatColor.GREEN + "Respiration", Enchantment.OXYGEN, 3, Arrays.asList("Extends breathing time underwater")),
    THORNS(ChatColor.GREEN + "Thorns", Enchantment.THORNS, 3, Arrays.asList("69 for damage")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY, 3, Arrays.asList("Increases your armor's durability")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),

    ;

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    HelmetEnchantments(String name, Enchantment enchantment, int maxLevel, List<String> lore) {
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
