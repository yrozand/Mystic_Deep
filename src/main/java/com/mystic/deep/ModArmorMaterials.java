package com.mystic.deep;

import com.google.common.base.Supplier;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public enum ModArmorMaterials implements ArmorMaterial {
    MARINITE("marinite", 25, new int[] {2, 6, 5, 2}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.MARINITE_INGOT)),
    ABYSSITE("abyssite", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.ABYSSITE_INGOT)),
    EARTHCORE("earthcore", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.EARTHCORE_INGOT)),
    FLAMESTONE("flamestone", 25, new int[] {3, 8, 6, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.FLAMESTONE_INGOT)),
    SHADOW("shadow", 25, new int[] {4, 10, 9, 4}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.ofItems(ModItems.SHADOW_INGOT));

    public final String name;
    public final int durabilityMultiplier;
    public final int[] protectionAmounts;
    public final int enchantability;
    public final SoundEvent equipSound;
    public final float toughness;
    public final float knockbackResistance;
    public final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmount, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient){
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmount;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MysticDeep.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    
}
