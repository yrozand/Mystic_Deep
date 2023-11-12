package com.mystic.deep;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {

    public static final ItemGroup MYSTICDEEP_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(MysticDeep.MOD_ID, "icon"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.MysticDeep"))
            .icon(() -> new ItemStack(ModItems.MARINITE_INGOT)).entries((displayContext, entries) -> {             
                entries.add(ModBlocks.DEEPSLATE_MARINITE_ORE_BLOCK);
                entries.add(ModBlocks.MARINITE_ORE_BLOCK);
                entries.add(ModItems.RAW_MARINITE);
                entries.add(ModBlocks.RAW_MARINITE_BLOCK);
                entries.add(ModItems.MARINITE_INGOT);
                entries.add(ModItems.MARINITE_GEMS);
                entries.add(ModBlocks.MARINITE_BLOCK);
                entries.add(ModItems.ABYSSITE_GEMS);
                entries.add(ModItems.ABYSSITE_INGOT);
                entries.add(ModBlocks.ABYSSITE_BLOCK);
                entries.add(ModItems.EARTHCORE_GEMS);
                entries.add(ModItems.EARTHCORE_INGOT);
                entries.add(ModBlocks.EARTHCORE_BLOCK);
                entries.add(ModItems.FLAMESTONE_GEMS);
                entries.add(ModItems.FLAMESTONE_INGOT);
                entries.add(ModBlocks.FLAMESTONE_BLOCK);
                entries.add(ModItems.SHADOW_GEMS);
                entries.add(ModItems.SHADOW_INGOT);
                entries.add(ModBlocks.SHADOW_BLOCK);
                entries.add(ModItems.SETSUKO_PLUSH);
                entries.add(ModItems.DEMONICA_PLUSH);
                entries.add(ModItems.MYSTICSTESS_PLUSH);
                entries.add(ModItems.MARINITE_PICKAXE);
                entries.add(ModItems.ABYSSITE_PICKAXE);
                entries.add(ModItems.FLAMESTONE_PICKAXE);
                entries.add(ModItems.EARTHCORE_PICKAXE);
                entries.add(ModItems.SHADOW_PICKAXE);
                entries.add(ModItems.MARINITE_SHOVEL);
                entries.add(ModItems.ABYSSITE_SHOVEL);
                entries.add(ModItems.FLAMESTONE_SHOVEL);
                entries.add(ModItems.EARTHCORE_SHOVEL);
                entries.add(ModItems.SHADOW_SHOVEL);
                entries.add(ModItems.MARINITE_SWORD);
                entries.add(ModItems.ABYSSITE_SWORD);
                entries.add(ModItems.FLAMESTONE_SWORD);
                entries.add(ModItems.EARTHCORE_SWORD);
                entries.add(ModItems.SHADOW_SWORD);
                entries.add(ModItems.MARINITE_AXE);
                entries.add(ModItems.ABYSSITE_AXE);
                entries.add(ModItems.FLAMESTONE_AXE);
                entries.add(ModItems.EARTHCORE_AXE);
                entries.add(ModItems.SHADOW_AXE);
                entries.add(ModItems.MARINITE_HOE);
                entries.add(ModItems.ABYSSITE_HOE);
                entries.add(ModItems.FLAMESTONE_HOE);
                entries.add(ModItems.EARTHCORE_HOE);
                entries.add(ModItems.SHADOW_HOE);
                entries.add(ModBlocks.FLAMESTONE_ORE_BLOCK);
                entries.add(ModBlocks.SHADOW_ORE_BLOCK);
                entries.add(ModItems.BEER);
                entries.add(ModItems.CHOPE);
                entries.add(ModItems.MARINITE_HELMET);
                entries.add(ModItems.MARINITE_CHESTPLATE);
                entries.add(ModItems.MARINITE_LEGGINGS);
                entries.add(ModItems.MARINITE_BOOTS);
                

            }).build());

    public static void registerModItemsGroups(){
        MysticDeep.LOGGER.info("Registering ModItems for "+MysticDeep.MOD_ID);
    }
}
