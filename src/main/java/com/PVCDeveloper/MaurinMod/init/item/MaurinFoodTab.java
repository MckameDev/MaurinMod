package com.PVCDeveloper.MaurinMod.init.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinFoodTab {
    public static final CreativeModeTab MAURINFOOD_TAB = new CreativeModeTab("maurinfoodmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(InitItems.CHORRILLANA.get());
        }
    };

}

