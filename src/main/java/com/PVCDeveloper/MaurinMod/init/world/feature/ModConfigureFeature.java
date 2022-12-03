package com.PVCDeveloper.MaurinMod.init.world.feature;

import com.PVCDeveloper.MaurinMod.init.block.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfigureFeature {

    public static final Holder<? extends ConfiguredFeature<TreeConfiguration, ?>> AVOCADO_TREE =
            FeatureUtils.register("avocado_tree", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(BlockInit.AVOCADO_TREE_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(BlockInit.AVOCADO_TREE_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build());


}
