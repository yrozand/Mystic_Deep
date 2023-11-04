package com.mystic.deep;

import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;

public class MysticDeep implements ModInitializer{

    public static final String MOD_ID = "mysticdeep";
    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModItemsGroups.registerModItemsGroups();
        ModSound.registerSounds();
    }
}