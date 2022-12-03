package com.PVCDeveloper.MaurinMod.init.event;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import com.PVCDeveloper.MaurinMod.init.WoodBlockType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MaurinMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

//        ItemBlockRenderTypes.setRenderLayer(BlockInit.AVOCADO_TREE_LEAVES.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.AVOCADO_TREE_SAPLING.get(), RenderType.cutout());

        WoodType.register(WoodBlockType.AVOCADO_WOODEN);

    }

}
