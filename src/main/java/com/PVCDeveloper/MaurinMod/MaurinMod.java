package com.PVCDeveloper.MaurinMod;

import com.PVCDeveloper.MaurinMod.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MaurinMod.MODID)
public class MaurinMod {
    public static final String MODID = "maurinmod";

    public MaurinMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);

    }
}
