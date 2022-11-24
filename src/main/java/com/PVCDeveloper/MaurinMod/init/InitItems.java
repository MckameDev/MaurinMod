package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, MaurinMod.MODID
    );

    public static final RegistryObject<Item> CHORRILLANA = ITEMS.register(
      "chorrillana", () -> new Item(new Item.Properties()
                    .tab(MaurinFoodTab.MAURINFOOD_TAB)
                    .food(new FoodProperties.Builder().nutrition(12).saturationMod(2.4f).build())
                    .stacksTo(16)
            )

    );

    public static final RegistryObject<Item> ANTICUCHO_RAW = ITEMS.register(
            "anticucho_raw", () -> new Item(new Item.Properties()
                    .tab(MaurinFoodTab.MAURINFOOD_TAB)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.8f).build())
            )
    );

    public static final RegistryObject<Item> ANTICUCHO_COOKED = ITEMS.register(
            "anticucho_cooked", () -> new Item(new Item.Properties()
                    .tab(MaurinFoodTab.MAURINFOOD_TAB)
                    .food(new FoodProperties.Builder().nutrition(10).saturationMod(2).build())
            )
    );

    public static final RegistryObject<Item> RAW_PVC = ITEMS.register(
            "raw_pvc", () -> new Item(new Item.Properties()
                    .tab(MaurinMineralsTab.MAURINMINERALS_TAB)
                    .stacksTo(64)
            )
    );

    public static final RegistryObject<Item> PVC_INGOT = ITEMS.register(
            "pvc_ingot", () -> new Item(new Item.Properties()
                    .tab(MaurinMineralsTab.MAURINMINERALS_TAB)
                    .stacksTo(64)
            )
    );

    private static final FoodProperties CHICHA_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600, 4), 0.6f).build();

    public static final RegistryObject<Item> CHICHA = ITEMS.register(
            "chicha", () -> new Item(new Item.Properties().tab(MaurinFoodTab.MAURINFOOD_TAB).food(CHICHA_PROPS))
    );

    public static final RegistryObject<SwordItem> PVC_SWORD = ITEMS.register(
            "pvc_sword", () -> new SwordItem(
                    Tiers.NETHERITE,
                    5,
                    1.0f,
                     //DAÑO DE LA ESPADA
                     // VELOCIDAD DE ATAQUE
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB))
    );

}
