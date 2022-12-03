package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


import java.util.List;

public class PlaceFeatureInit {

//    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
//            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MaurinMod.MODID);
//
//    public static final RegistryObject<PlacedFeature> PVC_ORE_PLACED = PLACED_FEATURE.register("pvc_ore_placed",
//            () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
//                    FeatureConfigInit.PVC_ORE, ModOrePlacement
//                    .rareOrePlacement(100, // VeinsPerChunk
//                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
//
//    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height){
//        return List.of(CountPlacement.of(countPerChunk), InSquarePlacement.spread(),height, BiomeFilter.biome());
//    }
//
//    public static void register(IEventBus bus) {
//        PLACED_FEATURE.register(bus);
//    }

}
