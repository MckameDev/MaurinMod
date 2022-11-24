package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, MaurinMod.MODID
    );

    public static final RegistryObject<Item> CHORRILLANA = ITEMS.register(
      "chorrillana", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build())
            )
    );

    public static final RegistryObject<Item> ANTICUCHO_RAW = ITEMS.register(
            "anticucho_raw", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build())
            )
    );

    public static final RegistryObject<Item> ANTICUCHO_COOKED = ITEMS.register(
            "anticucho_cooked", () -> new Item(new Item.Properties()
                    .tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().alwaysEat().build())
            )
    );

}
