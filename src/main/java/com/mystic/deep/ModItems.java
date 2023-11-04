package com.mystic.deep;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
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
    public static final Item MUSIC_LIKE_FLAMES = registerItem("likes_flames_music_disc", new MusicDiscItem(7, ModSound.LIKE_FLAMES, new FabricItemSettings().maxCount(1), 250));
    public static final Item MUSIC_GEAR_FIVE = registerItem("gear_five_music_disc", new MusicDiscItem(7, ModSound.GEAR_FIVE, new FabricItemSettings().maxCount(1), 250));

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
    }

    private static void addItemsToOUTILSTabItemGroup(FabricItemGroupEntries entries){
        entries.add(MUSIC_LIKE_FLAMES);
        entries.add(MUSIC_GEAR_FIVE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MysticDeep.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MysticDeep.LOGGER.info("Registering ModItems for "+MysticDeep.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToOUTILSTabItemGroup);
    }
}