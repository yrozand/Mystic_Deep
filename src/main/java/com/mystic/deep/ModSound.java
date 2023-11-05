package com.mystic.deep;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSound { 
    public static final SoundEvent GEAR_FIVE = registerSoundEvent("gear_five");
    public static final SoundEvent BOYZ_PARIS = registerSoundEvent("boyz_in_paris");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = new Identifier(MysticDeep.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    };
    

    public static void registerSounds(){
        MysticDeep.LOGGER.info("Registering Sounds for "+ MysticDeep.MOD_ID);

    }
}
