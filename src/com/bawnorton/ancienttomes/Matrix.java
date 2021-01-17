package com.bawnorton.ancienttomes;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;

import java.util.Hashtable;

public class Matrix {
    public static final Hashtable<EntityType, String> entityMatrix = new Hashtable<EntityType, String>() {{
        put(EntityType.BLAZE, "Blaze");
        put(EntityType.CAVE_SPIDER, "Cave Spider");
        put(EntityType.CREEPER, "Creeper");
        put(EntityType.DROWNED, "Drowned");
        put(EntityType.ELDER_GUARDIAN, "Elder Guardian");
        put(EntityType.ENDERMAN, "Enderman");
        put(EntityType.ENDER_DRAGON, "Ender Dragon");
        put(EntityType.ENDERMITE, "Endermite");
        put(EntityType.EVOKER, "Evoker");
        put(EntityType.GHAST, "Ghast");
        put(EntityType.GUARDIAN, "Guardian");
        put(EntityType.HOGLIN, "Hoglin");
        put(EntityType.IRON_GOLEM, "Iron Golem");
        put(EntityType.HUSK, "Husk");
        put(EntityType.MAGMA_CUBE, "Magma Cube");
        put(EntityType.PHANTOM, "Phantom");
        put(EntityType.PIGLIN, "Piglin");
        put(EntityType.PIGLIN_BRUTE, "Piglin Brute");
        put(EntityType.PILLAGER, "Pillager");
        put(EntityType.RAVAGER, "Ravager");
        put(EntityType.SHULKER, "Shulker");
        put(EntityType.SKELETON, "Skeleton");
        put(EntityType.STRAY, "Stray");
        put(EntityType.SLIME, "Slime");
        put(EntityType.SILVERFISH, "Silverfish");
        put(EntityType.SPIDER, "Spider");
        put(EntityType.VEX, "Vex");
        put(EntityType.VINDICATOR, "Vindicator");
        put(EntityType.WITCH, "Witch");
        put(EntityType.WITHER, "Wither");
        put(EntityType.WITHER_SKELETON, "Wither Skeleton");
        put(EntityType.ZOMBIE, "Zombie");
        put(EntityType.ZOMBIE_VILLAGER, "Zombie Villager");
        put(EntityType.ZOMBIFIED_PIGLIN, "Zombified Piglin");
    }};
    public static final Hashtable<String, Object[]> enchantmentMatrix = new Hashtable<String, Object[]>() {{
        put("Power", new Object[]{Enchantment.ARROW_DAMAGE, 6});
        put("Punch", new Object[]{Enchantment.ARROW_KNOCKBACK, 3});
        put("Sharpness", new Object[]{Enchantment.DAMAGE_ALL, 6});
        put("Bane of Arthropods", new Object[]{Enchantment.DAMAGE_ARTHROPODS, 6});
        put("Smite", new Object[]{Enchantment.DAMAGE_UNDEAD, 6});
        put("Efficieny", new Object[]{Enchantment.DIG_SPEED, 6});
        put("Unbreaking", new Object[]{Enchantment.DURABILITY, 4});
        put("Fire Aspect", new Object[]{Enchantment.FIRE_ASPECT, 3});
        put("Frost Walker", new Object[]{Enchantment.FROST_WALKER, 3});
        put("Impaling", new Object[]{Enchantment.IMPALING, 6});
        put("Knockback", new Object[]{Enchantment.KNOCKBACK, 3});
        put("Fortune", new Object[]{Enchantment.LOOT_BONUS_BLOCKS, 4});
        put("Looting", new Object[]{Enchantment.LOOT_BONUS_MOBS, 4});
        put("Loyalty", new Object[]{Enchantment.LOYALTY, 4});
        put("Luck of the Sea", new Object[]{Enchantment.LUCK, 4});
        put("Lure", new Object[]{Enchantment.LURE, 4});
        put("Respiration", new Object[]{Enchantment.OXYGEN, 4});
        put("Piercing", new Object[]{Enchantment.PIERCING, 5});
        put("Protection", new Object[]{Enchantment.PROTECTION_ENVIRONMENTAL, 5});
        put("Blast Protection", new Object[]{Enchantment.PROTECTION_EXPLOSIONS, 5});
        put("Feather Falling", new Object[]{Enchantment.PROTECTION_FALL, 5});
        put("Fire Protection", new Object[]{Enchantment.PROTECTION_FIRE, 5});
        put("Projectile Protection", new Object[]{Enchantment.PROTECTION_PROJECTILE, 5});
        put("Quick Charge", new Object[]{Enchantment.QUICK_CHARGE, 4});
        put("Riptide", new Object[]{Enchantment.RIPTIDE, 4});
        put("Soul Speed", new Object[]{Enchantment.SOUL_SPEED, 4});
        put("Sweeping Edge", new Object[]{Enchantment.SWEEPING_EDGE, 4});
        put("Thorns", new Object[]{Enchantment.THORNS, 4});
    }};
}
