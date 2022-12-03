package com.PVCDeveloper.MaurinMod.init.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinToolsTab {

    public static final CreativeModeTab MAURINTOOLS_TAB = new CreativeModeTab("maurintoolsmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(InitItems.PVC_PICKAXE.get());
        }
    };

}
