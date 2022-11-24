package com.PVCDeveloper.MaurinMod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MaurinBlocksTab {

    public static final CreativeModeTab MAURINBLOCKS_TAB = new CreativeModeTab("maurinblocksmodtab") {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(BlockInit.PVC_BLOCK.get());
        }
    };

}
