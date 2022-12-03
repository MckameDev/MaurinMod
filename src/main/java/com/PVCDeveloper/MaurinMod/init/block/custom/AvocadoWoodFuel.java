package com.PVCDeveloper.MaurinMod.init.block.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class AvocadoWoodFuel extends Item {
    public AvocadoWoodFuel(Properties pProperties){
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType){
        return 400;
    }
}
