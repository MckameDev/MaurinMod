package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.A;

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
            "pvc_sword", () -> new SwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 3400;
                }

                @Override
                public float getSpeed() {
                    return 1.6f;
                }

                @Override
                public float getAttackDamageBonus() {
                    return 2;
                }

                @Override
                public int getLevel() {
                    return 5;
                }

                @Override
                public int getEnchantmentValue() {
                    return 15;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(PVC_INGOT.get());
                }
            },
                    7,
                    -2.4f,
                    //DAÑO DE LA ESPADA
                    // VELOCIDAD DE ATAQUE
                    new Item.Properties().tab(MaurinArmamentTab.MAURINARMAMENT_TAB))
    );


    public static final RegistryObject<HoeItem> PVC_HOE = ITEMS.register(
            "pvc_hoe", () -> new HoeItem(new Tier() {
                @Override
                public int getUses() {
                    return 3400;
                }

                @Override
                public float getSpeed() {
                    return 11.0f;
                }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() {
                    return 0;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(PVC_INGOT.get());
                }
            },2,-2.8f,new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB))
    );

    public static final RegistryObject<ShovelItem> PVC_SHOVEL = ITEMS.register(
            "pvc_shovel", () -> new ShovelItem(new Tier() {
                @Override
                public int getUses() {
                    return 3400;
                }

                @Override
                public float getSpeed() {
                    return 11.0f;
                }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() {
                    return 5;
                }

                @Override
                public int getEnchantmentValue() {
                    return 15;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(PVC_INGOT.get());
                }
            },3,-2.8f,new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB))
    );

    public static final RegistryObject<AxeItem> PVC_AXE = ITEMS.register(
            "pvc_axe", () -> new AxeItem(new Tier() {
                @Override
                public int getUses() {
                    return 3400;
                }

                @Override
                public float getSpeed() {
                    return 11.0f;
                }

                @Override
                public float getAttackDamageBonus() {
                    return 2;
                }

                @Override
                public int getLevel() {
                    return 5;
                }

                @Override
                public int getEnchantmentValue() {
                    return 15;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(PVC_INGOT.get());
                }
            },8,-3.0f,new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB))

            );

    public static final RegistryObject<PickaxeItem> PVC_PICKAXE = ITEMS.register(
            "pvc_pickaxe", () -> new PickaxeItem(new Tier() {
                @Override
                public int getUses() {
                    return 3400;
                }
                @Override
                public float getSpeed() {
                    return 11.0f;
                }
                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }
                @Override
                public int getLevel() {
                    return 5;
                }
                @Override
                public int getEnchantmentValue() {
                    return 15;
                }
                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(PVC_INGOT.get());
                }
            },
                3,-2.8f,
                    //DAÑO DE LA PICOTA
                    // VELOCIDAD DE ATAQUE
                    new Item.Properties().tab(MaurinToolsTab.MAURINTOOLS_TAB))
    );

}
