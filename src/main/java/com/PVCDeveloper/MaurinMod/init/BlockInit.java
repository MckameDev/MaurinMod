package com.PVCDeveloper.MaurinMod.init;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaurinMod.MODID);

    public static final RegistryObject<Block> PVC_ORE = register(
            "pvc_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5).requiresCorrectToolForDrops().sound(SoundType.STONE))
                    , new Item.Properties().tab(MaurinBlocksTab.MAURINBLOCKS_TAB));

    public static final RegistryObject<Block> PVC_BLOCK = register(
            "pvc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS))
            , new Item.Properties().tab(MaurinBlocksTab.MAURINBLOCKS_TAB));

    public static final RegistryObject<Block> PVC_BLOCK_GOLD = register(
            "pvc_block_gold",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10).requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS))
            , new Item.Properties().tab(MaurinBlocksTab.MAURINBLOCKS_TAB));


    private static <T extends Block>RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties){
        RegistryObject<T> block = BLOCKS.register(name,supplier);
        InitItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

}
