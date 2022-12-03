package com.PVCDeveloper.MaurinMod.init.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinMineralsTab {

    public static final CreativeModeTab MAURINMINERALS_TAB = new CreativeModeTab("maurinmineralsmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(InitItems.PVC_INGOT.get());
        }
    };

}
