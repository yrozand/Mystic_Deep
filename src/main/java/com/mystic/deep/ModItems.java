package com.mystic.deep;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MARINITE_INGOT = registerItem("marinite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_MARINITE = registerItem("marinite_raw", new Item(new FabricItemSettings()));
    public static final Item MARINITE_GEMS = registerItem("marinite_gems", new Item(new FabricItemSettings()));
    public static final Item ABYSSITE_GEMS = registerItem("abyssite_gems", new Item(new FabricItemSettings()));
    public static final Item ABYSSITE_INGOT = registerItem("abyssite_ingot", new Item(new FabricItemSettings()));
    public static final Item EARTHCORE_GEMS = registerItem("earthcore_gems", new Item(new FabricItemSettings()));
    public static final Item EARTHCORE_INGOT = registerItem("earthcore_ingot", new Item(new FabricItemSettings()));
    public static final Item FLAMESTONE_GEMS = registerItem("flamestone_gems", new Item(new FabricItemSettings()));
    public static final Item FLAMESTONE_INGOT = registerItem("flamestone_ingot", new Item(new FabricItemSettings()));
    public static final Item SHADOW_GEMS = registerItem("shadow_gems", new Item(new FabricItemSettings()));
    public static final Item SHADOW_INGOT = registerItem("shadow_ingot", new Item(new FabricItemSettings()));
    public static final Item SETSUKO_PLUSH = registerItem("setsuko_plush", new Item(new FabricItemSettings()));
    public static final Item MYSTICSTESS_PLUSH = registerItem("mysticstess_plush", new Item(new FabricItemSettings()));
    public static final Item DEMONICA_PLUSH = registerItem("demonica_plush", new Item(new FabricItemSettings()));
    public static final Item BEER = registerItem("beer_chope", new Item(new FabricItemSettings()));
    public static final Item CHOPE = registerItem("chope", new Item(new FabricItemSettings()));
    public static final Item MARINITE_PICKAXE = registerItem("marinite_pickaxe", new PickaxeItem(ModToolMaterial.MARINITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ABYSSITE_PICKAXE = registerItem("abyssite_pickaxe", new PickaxeItem(ModToolMaterial.ABYSSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FLAMESTONE_PICKAXE = registerItem("flamestone_pickaxe", new PickaxeItem(ModToolMaterial.FLAMESTONE, 0, -2.8f, new FabricItemSettings()));
    public static final Item EARTHCORE_PICKAXE = registerItem("earthcore_pickaxe", new PickaxeItem(ModToolMaterial.EARTHCORE, 0, -2.8f, new FabricItemSettings()));
    public static final Item SHADOW_PICKAXE = registerItem("shadow_pickaxe", new PickaxeItem(ModToolMaterial.SHADOW, 0, -2.8f, new FabricItemSettings()));
    public static final Item MARINITE_AXE = registerItem("marinite_axe", new AxeItem(ModToolMaterial.MARINITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ABYSSITE_AXE = registerItem("abyssite_axe", new AxeItem(ModToolMaterial.ABYSSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FLAMESTONE_AXE = registerItem("flamestone_axe", new AxeItem(ModToolMaterial.FLAMESTONE, 0, -2.8f, new FabricItemSettings()));
    public static final Item EARTHCORE_AXE = registerItem("earthcore_axe", new AxeItem(ModToolMaterial.EARTHCORE, 0, -2.8f, new FabricItemSettings()));
    public static final Item SHADOW_AXE = registerItem("shadow_axe", new AxeItem(ModToolMaterial.SHADOW, 0, -2.8f, new FabricItemSettings()));
    public static final Item MARINITE_SHOVEL = registerItem("marinite_shovel", new ShovelItem(ModToolMaterial.MARINITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ABYSSITE_SHOVEL = registerItem("abyssite_shovel", new ShovelItem(ModToolMaterial.ABYSSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FLAMESTONE_SHOVEL = registerItem("flamestone_shovel", new ShovelItem(ModToolMaterial.FLAMESTONE, 0, -2.8f, new FabricItemSettings()));
    public static final Item EARTHCORE_SHOVEL = registerItem("earthcore_shovel", new ShovelItem(ModToolMaterial.EARTHCORE, 0, -2.8f, new FabricItemSettings()));
    public static final Item SHADOW_SHOVEL = registerItem("shadow_shovel", new ShovelItem(ModToolMaterial.SHADOW, 0, -2.8f, new FabricItemSettings()));
    public static final Item MARINITE_SWORD = registerItem("marinite_sword", new SwordItem(ModToolMaterial.MARINITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ABYSSITE_SWORD = registerItem("abyssite_sword", new SwordItem(ModToolMaterial.ABYSSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FLAMESTONE_SWORD = registerItem("flamestone_sword", new SwordItem(ModToolMaterial.FLAMESTONE, 0, -2.8f, new FabricItemSettings()));
    public static final Item EARTHCORE_SWORD = registerItem("earthcore_sword", new SwordItem(ModToolMaterial.EARTHCORE, 0, -2.8f, new FabricItemSettings()));
    public static final Item SHADOW_SWORD = registerItem("shadow_sword", new SwordItem(ModToolMaterial.SHADOW, 0, -2.8f, new FabricItemSettings()));
    public static final Item MARINITE_HOE = registerItem("marinite_hoe", new SwordItem(ModToolMaterial.MARINITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item ABYSSITE_HOE = registerItem("abyssite_hoe", new HoeItem(ModToolMaterial.ABYSSITE, 0, -2.8f, new FabricItemSettings()));
    public static final Item FLAMESTONE_HOE = registerItem("flamestone_hoe", new HoeItem(ModToolMaterial.FLAMESTONE, 0, -2.8f, new FabricItemSettings()));
    public static final Item EARTHCORE_HOE = registerItem("earthcore_hoe", new HoeItem(ModToolMaterial.EARTHCORE, 0, -2.8f, new FabricItemSettings()));
    public static final Item SHADOW_HOE = registerItem("shadow_hoe", new HoeItem(ModToolMaterial.SHADOW, 0, -2.8f, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(MARINITE_INGOT);
        entries.add(RAW_MARINITE);
        entries.add(MARINITE_GEMS);
        entries.add(ABYSSITE_GEMS);
        entries.add(ABYSSITE_INGOT);
        entries.add(EARTHCORE_GEMS);
        entries.add(EARTHCORE_INGOT);
        entries.add(FLAMESTONE_GEMS);
        entries.add(FLAMESTONE_INGOT);
        entries.add(SHADOW_GEMS);
        entries.add(SHADOW_INGOT);
        entries.add(BEER);
        entries.add(CHOPE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MysticDeep.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MysticDeep.LOGGER.info("Registering ModItems for "+MysticDeep.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}