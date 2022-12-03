package com.PVCDeveloper.MaurinMod;

import com.PVCDeveloper.MaurinMod.init.WoodBlockType;
import com.PVCDeveloper.MaurinMod.init.block.BlockInit;
import com.PVCDeveloper.MaurinMod.init.item.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MaurinMod.MODID)
public class MaurinMod {
    public static final String MODID = "maurinmod";
    private static final Logger LOGGER = LogManager.getLogger();
    public MaurinMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
//        PlaceFeatureInit.PLACED_FEATURE.register(bus);
        MaurinFoodTab.MAURINFOOD_TAB.canScroll();
        MaurinBlocksTab.MAURINBLOCKS_TAB.canScroll();
        MaurinArmamentTab.MAURINARMAMENT_TAB.canScroll();
        MaurinToolsTab.MAURINTOOLS_TAB.canScroll();
        MaurinMineralsTab.MAURINMINERALS_TAB.canScroll();
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {


            Sheets.addWoodType(WoodBlockType.AVOCADO_WOODEN);
        });
    }
}

