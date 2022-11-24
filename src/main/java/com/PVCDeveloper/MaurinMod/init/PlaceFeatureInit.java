package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


import java.util.List;

public class PlaceFeatureInit {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MaurinMod.MODID);

    public static final RegistryObject<PlacedFeature> PVC_ORE = PLACED_FEATURE.register(
            "pvc_ore",
            () -> new PlacedFeature(FeatureConfigInit.PVC_ORE.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(80)

            )))
    );

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height){
        return List.of(CountPlacement.of(countPerChunk), InSquarePlacement.spread(),height, BiomeFilter.biome());
    }

}
