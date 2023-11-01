package com.mystic.deep;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MysticDeep implements ModInitializer{

    // Marinite Ingot
    public static final Item MARINITE_INGOT = Registry.register(Registries.ITEM, new Identifier("mysticdeep", "marinite_ingot"), new Item(new FabricItemSettings().maxCount(64)));

    
    public static final String MOD_ID = "MysticDeep";

    private static final ItemGroup MYSTICDEE_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(MARINITE_INGOT))
        .displayName(Text.translatable("Mystic Deep"))
            .entries((context, entries) -> {
            entries.add(MARINITE_INGOT);
        })
        .build();


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("mysticdeep", "marinite_ingot"), MYSTICDEE_GROUP);
    }

}