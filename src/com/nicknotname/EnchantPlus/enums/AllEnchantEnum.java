package com.nicknotname.EnchantPlus.enums;

import com.mysql.fabric.xmlrpc.base.Array;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EnderDragon;

import java.util.Arrays;
import java.util.List;

public enum AllEnchantEnum {
    AQUA_AFFINITY(ChatColor.GREEN + "Aqua Affinity", Enchantment.WATER_WORKER,1, Arrays.asList("Makes Mining Underwater faster")),
    BANE_OF_ARTHROPODS(ChatColor.GREEN + "Bane Of Arthropods", Enchantment.DAMAGE_ARTHROPODS,5, Arrays.asList("Increases damage to spiders, bees, silverfish and endermites")),
    BLAST_PROTECTION(ChatColor.GREEN + "Blast Protection", Enchantment.PROTECTION_EXPLOSIONS,4, Arrays.asList("Reduces damage from explosions")),
    CHANNELING(ChatColor.GREEN + "Channeling", Enchantment.CHANNELING,1, Arrays.asList("Produces Lightning if a trident hits a mob in a thunderstorm")),
    DEPTH_STRIDER(ChatColor.GREEN + "Depth Strider", Enchantment.DEPTH_STRIDER,3, Arrays.asList("Move SPEEDY SPEEDY in water")),
    EFFICIENCY(ChatColor.GREEN + "Efficiency", Enchantment.DIG_SPEED,5, Arrays.asList("Increases Mining Speed")),
    FEATHER_FALLING(ChatColor.GREEN + "Feather Falling", Enchantment.PROTECTION_FALL,4, Arrays.asList("Lessens fall damage")),
    FIRE_ASPECT(ChatColor.GREEN + "Fire Aspect", Enchantment.FIRE_ASPECT,2, Arrays.asList("Sets mobs on fire when they are hit")),
    FIRE_PROTECTION(ChatColor.GREEN + "Fire Protection", Enchantment.PROTECTION_FIRE,4, Arrays.asList("Reduces damage from fire")),
    FLAME(ChatColor.GREEN + "Flame", Enchantment.ARROW_FIRE,1,Arrays.asList("Makes your bow shoot flaming arrows")),
    FORTUNE(ChatColor.GREEN + "Fortune", Enchantment.LOOT_BONUS_BLOCKS,3,Arrays.asList("Increases the chance of specific item drops from blocks")),
    IMPALING(ChatColor.GREEN + "Impaling", Enchantment.IMPALING,5,Arrays.asList("Makes your trident do extra damage to aquatic mobs")),
    INFINITY(ChatColor.GREEN + "Infinity", Enchantment.ARROW_INFINITE,1,Arrays.asList("Makes your bow only need one arrow")),
    KNOCKBACK(ChatColor.GREEN + "Knockback", Enchantment.KNOCKBACK,2,Arrays.asList("Knocks Mobs back on hit")),
    LOOTING(ChatColor.GREEN + "Looting", Enchantment.LOOT_BONUS_MOBS,3,Arrays.asList("Increases the chance of specific item drops from mobs")),
    LOYALTY(ChatColor.GREEN + "Loyalty", Enchantment.LOYALTY,3,Arrays.asList("Makes the trident return when thrown")),
    LUCK_OF_THE_SEA(ChatColor.GREEN + "Luck", Enchantment.LUCK,3,Arrays.asList("Makes treasure more likely to be fished up")),
    LURE(ChatColor.GREEN + "Lure", Enchantment.LURE,3,Arrays.asList("Makes catching an item quicker")),
    MENDING(ChatColor.GREEN + "Mending", Enchantment.MENDING, 1, Arrays.asList("Mends items when you collect experience")),
    MULTISHOT(ChatColor.GREEN + "Multishot", Enchantment.MULTISHOT,1,Arrays.asList("Makes Crossbows shoot 3 arrows")),
    PIERCING(ChatColor.GREEN + "Piercing", Enchantment.PIERCING,4,Arrays.asList("Makes Crossbows shoot through mobs")),
    POWER(ChatColor.GREEN + "Power", Enchantment.ARROW_DAMAGE,5,Arrays.asList("Makes Bows stronger")),
    PROJECTILE_PROTECTION(ChatColor.GREEN + "Projectile Protection", Enchantment.PROTECTION_PROJECTILE,4,Arrays.asList("Reduces damage from arrows")),
    PROTECTION(ChatColor.GREEN + "Protection", Enchantment.PROTECTION_ENVIRONMENTAL,4,Arrays.asList("Reduces damage in general")),
    PUNCH(ChatColor.GREEN + "Punch", Enchantment.ARROW_KNOCKBACK,2,Arrays.asList("Makes Bows knock entities back further")),
    QUICK_CHARGE(ChatColor.GREEN + "Quick Charge", Enchantment.QUICK_CHARGE,3,Arrays.asList("Makes Crossbows charge up quicker")),
    RESPIRATION(ChatColor.GREEN + "Respiration", Enchantment.OXYGEN,3,Arrays.asList("Extends breathing time underwater")),
    RIPTIDE(ChatColor.GREEN + "Riptide", Enchantment.RIPTIDE,3,Arrays.asList("Shoot yourself when in water with a Trident")),
    SHARPNESS(ChatColor.GREEN + "Sharpness", Enchantment.DAMAGE_ALL,5,Arrays.asList("Increases Melee Damage")),
    SILK_TOUCH(ChatColor.GREEN + "Silk Touch", Enchantment.SILK_TOUCH,1,Arrays.asList("Allows many blocks to drop themselves")),
    SMITE(ChatColor.GREEN + "Smite", Enchantment.DAMAGE_UNDEAD, 5,Arrays.asList("Increases damage to undead mobs")),
    SWEEPING_EDGE(ChatColor.GREEN + "Sweeping Edge", Enchantment.SWEEPING_EDGE,3,Arrays.asList("Attacks mobs around the one you hit with less power")),
    THORNS(ChatColor.GREEN + "Thorns", Enchantment.THORNS,3,Arrays.asList("69 for damage")),
    UNBREAKING(ChatColor.GREEN + "Unbreaking", Enchantment.DURABILITY,3,Arrays.asList("Increases your armor's durability"))
    ;

    private final String name;
    private final Enchantment enchantment;
    private final int maxLevel;
    private final List<String> lore;

    AllEnchantEnum(String name, Enchantment enchantment, int maxLevel, List<String> lore){
        this.name = name;
        this.enchantment = enchantment;
        this.maxLevel = maxLevel;
        this.lore = lore;
    }

    public String getName(){
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
