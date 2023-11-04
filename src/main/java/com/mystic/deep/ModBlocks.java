package com.mystic.deep;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block MARINITE_BLOCK = registerBlock("marinite_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_MARINITE_BLOCK = registerBlock("raw_marinite_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block SHADOW_BLOCK = registerBlock("shadow_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block EARTHCORE_BLOCK = registerBlock("earthcore_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block ABYSSITE_BLOCK = registerBlock("abyssite_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block FLAMESTONE_BLOCK = registerBlock("flamestone_block", 
        new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block MARINITE_ORE_BLOCK = registerBlock("marinite_ore_block",
        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_MARINITE_ORE_BLOCK = registerBlock("deepslate_marinite_ore_block",
        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f), UniformIntProvider.create(2, 5)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MysticDeep.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MysticDeep.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    private static void addItemsToBUILDINGTabItemGroup(FabricItemGroupEntries entries){
        entries.add(SHADOW_BLOCK);
        entries.add(EARTHCORE_BLOCK);
        entries.add(ABYSSITE_BLOCK);
        entries.add(FLAMESTONE_BLOCK);
        entries.add(MARINITE_BLOCK);
    }

    public static void registerModBlocks(){
        MysticDeep.LOGGER.info("Registering ModBlocks for "+MysticDeep.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBUILDINGTabItemGroup);
    }
}
