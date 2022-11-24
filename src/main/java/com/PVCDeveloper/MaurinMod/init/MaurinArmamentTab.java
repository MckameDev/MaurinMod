package com.PVCDeveloper.MaurinMod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinArmamentTab {

    public static final CreativeModeTab MAURINARMAMENT_TAB = new CreativeModeTab("maurinarmamentmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(InitItems.PVC_SWORD.get());
        }
    };
}
