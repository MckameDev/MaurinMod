package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class FeatureConfigInit {

    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURE =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MaurinMod.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> EXAMPLE_OVERWORLD_REPLACE =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.PVC_ORE.get().defaultBlockState()),
                    OreConfiguration.target(new BlockMatchTest(Blocks.DIAMOND_ORE), BlockInit.PVC_ORE.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.PVC_ORE.get().defaultBlockState())
            ));

    public static final RegistryObject<ConfiguredFeature<?, ?>> PVC_ORE = CONFIGURED_FEATURE.register(
            "pvc_ore",
            () -> new ConfiguredFeature<>(
                    Feature.ORE,
                    new OreConfiguration(EXAMPLE_OVERWORLD_REPLACE.get(), 4)
            )
    );
}
