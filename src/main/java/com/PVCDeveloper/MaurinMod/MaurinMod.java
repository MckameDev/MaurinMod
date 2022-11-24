package com.PVCDeveloper.MaurinMod;

import com.PVCDeveloper.MaurinMod.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MaurinMod.MODID)
public class MaurinMod {
    public static final String MODID = "maurinmod";

    public MaurinMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        FeatureConfigInit.CONFIGURED_FEATURE.register(bus);
        PlaceFeatureInit.PLACED_FEATURE.register(bus);
        MaurinFoodTab.MAURINFOOD_TAB.canScroll();
        MaurinBlocksTab.MAURINBLOCKS_TAB.canScroll();
        MaurinArmamentTab.MAURINARMAMENT_TAB.canScroll();
        MaurinMineralsTab.MAURINMINERALS_TAB.canScroll();
    }
}
