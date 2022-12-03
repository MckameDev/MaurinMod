package com.PVCDeveloper.MaurinMod.init.world.feature.tree;

import com.PVCDeveloper.MaurinMod.init.world.feature.ModConfigureFeature;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class AvocadoTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pLargeHive) {
        return ModConfigureFeature.AVOCADO_TREE;
    }
}
