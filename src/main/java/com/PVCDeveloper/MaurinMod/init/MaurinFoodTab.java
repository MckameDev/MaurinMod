package com.PVCDeveloper.MaurinMod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinFoodTab {
    public static final CreativeModeTab MAURINFOOD_TAB = new CreativeModeTab("maurinmodfoodmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(InitItems.CHORRILLANA.get());
        }
    };

}

