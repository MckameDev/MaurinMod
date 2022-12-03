package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.init.item.InitItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PVC = new ForgeTier(5, 3400, 11f,
            3f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(InitItems.PVC_INGOT.get()));
}
