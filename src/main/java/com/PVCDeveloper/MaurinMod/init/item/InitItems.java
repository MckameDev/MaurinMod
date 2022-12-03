package com.PVCDeveloper.MaurinMod.init.item;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import com.PVCDeveloper.MaurinMod.init.ModMaterialTiers;
import com.PVCDeveloper.MaurinMod.init.ModTiers;
import com.PVCDeveloper.MaurinMod.init.item.custom.ModArmorItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
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

    public static final RegistryObject<Item> AVOCADO = ITEMS.register(
            "avocado", () -> new Item(new Item.Properties()
                    .tab(MaurinFoodTab.MAURINFOOD_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build())
                    .stacksTo(64)
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

    public static final RegistryObject<Item> PVC_NUGGET = ITEMS.register("pvc_nugget",
            () -> new Item(new Item.Properties().tab(MaurinMineralsTab.MAURINMINERALS_TAB)));

    private static final FoodProperties CHICHA_PROPS = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 600, 4), 0.6f).build();

    public static final RegistryObject<Item> CHICHA = ITEMS.register(
            "chicha", () -> new Item(new Item.Properties().tab(MaurinFoodTab.MAURINFOOD_TAB).food(CHICHA_PROPS))
    );



    public static final RegistryObject<Item> PVC_SWORD = ITEMS.register("pvc_sword",
            () -> new SwordItem(ModTiers.PVC, 6, -2.4f,
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB)));
    public static final RegistryObject<Item> PVC_PICKAXE = ITEMS.register("pvc_pickaxe",
            () -> new PickaxeItem(ModTiers.PVC, 2, -2.8f,
                    new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB)));
    public static final RegistryObject<Item> PVC_SHOVEL = ITEMS.register("pvc_shovel",
            () -> new ShovelItem(ModTiers.PVC, 3.5f, -3f,
                    new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB)));
    public static final RegistryObject<Item> PVC_AXE = ITEMS.register("pvc_axe",
            () -> new AxeItem(ModTiers.PVC, 9, -2f,
                    new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB)));
    public static final RegistryObject<Item> PVC_HOE = ITEMS.register("pvc_hoe",
            () -> new HoeItem(ModTiers.PVC, 0, 0f,
                    new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB)));

    public static final RegistryObject<Item> PVC_HELMET = ITEMS.register("pvc_helmet",
            () -> new ModArmorItem(ModMaterialTiers.PVC, EquipmentSlot.HEAD,
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB).fireResistant()));
    public static final RegistryObject<Item> PVC_CHESTPLATE = ITEMS.register("pvc_chestplate",
            () -> new ArmorItem(ModMaterialTiers.PVC, EquipmentSlot.CHEST,
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB).fireResistant()));
    public static final RegistryObject<Item> PVC_LEGGINGS = ITEMS.register("pvc_leggings",
            () -> new ArmorItem(ModMaterialTiers.PVC, EquipmentSlot.LEGS,
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB).fireResistant()));
    public static final RegistryObject<Item> PVC_BOOTS = ITEMS.register("pvc_boots",
            () -> new ArmorItem(ModMaterialTiers.PVC, EquipmentSlot.FEET,
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB).fireResistant()));

}
