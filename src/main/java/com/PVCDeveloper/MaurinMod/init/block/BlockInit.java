package com.PVCDeveloper.MaurinMod.init.block;

import com.PVCDeveloper.MaurinMod.MaurinMod;
import com.PVCDeveloper.MaurinMod.init.item.InitItems;
import com.PVCDeveloper.MaurinMod.init.item.MaurinBlocksTab;
import com.PVCDeveloper.MaurinMod.init.block.custom.ModFlammableRotatedPillarBlock;
import com.PVCDeveloper.MaurinMod.init.world.feature.tree.AvocadoTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.SpruceTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;


public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaurinMod.MODID);


    public static final RegistryObject<Block> PVC_BLOCK = registerBlock("pvc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> PVC_BLOCK_GOLD = registerBlock("pvc_block_gold",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f).sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> PVC_ORE = registerBlock("pvc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), MaurinBlocksTab.MAURINBLOCKS_TAB);

    public static final RegistryObject<Block> AVOCADO_TREE_LOG = registerBlock("avocado_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(0.1f)),
            MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_LOG = registerBlock("stripped_avocado_tree_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(0.1f)),
            MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_PLANKS = registerBlock("stripped_avocado_tree_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(0.1f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, MaurinBlocksTab.MAURINBLOCKS_TAB);

    public static final RegistryObject<Block> AVOCADO_TREE_PLANKS = registerBlock("avocado_tree_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(0.1f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, MaurinBlocksTab.MAURINBLOCKS_TAB);


    public static final RegistryObject<Block> AVOCADO_TREE_LEAVES = registerBlock("avocado_tree_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, MaurinBlocksTab.MAURINBLOCKS_TAB);


    public static final RegistryObject<Block> AVOCADO_TREE_SAPLING = registerBlock("avocado_tree_sapling",
            () -> new SaplingBlock(new AvocadoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)),
            MaurinBlocksTab.MAURINBLOCKS_TAB);


    public static final RegistryObject<StairBlock> AVOCADO_TREE_STAIRS = registerBlock("avocado_tree_stairs",
            () -> new StairBlock(() -> BlockInit.AVOCADO_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(0.1f).requiresCorrectToolForDrops()),MaurinBlocksTab.MAURINBLOCKS_TAB);

    public static final RegistryObject<Block> AVOCADO_TREE_SLAB = registerBlock("avocado_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_STAIRS = registerBlock("stripped_avocado_tree_stairs",
            () -> new StairBlock(() -> BlockInit.STRIPPED_AVOCADO_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(0.1f).requiresCorrectToolForDrops()),MaurinBlocksTab.MAURINBLOCKS_TAB);

    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_SLAB = registerBlock("stripped_avocado_tree_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);


    public static final RegistryObject<Block> AVOCADO_TREE_FENCE = registerBlock("avocado_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> AVOCADO_TREE_FENCE_GATE = registerBlock("avocado_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_FENCE = registerBlock("stripped_avocado_tree_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);
    public static final RegistryObject<Block> STRIPPED_AVOCADO_TREE_FENCE_GATE = registerBlock("stripped_avocado_tree_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.1f).requiresCorrectToolForDrops()), MaurinBlocksTab.MAURINBLOCKS_TAB);








    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return InitItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.translatable(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return InitItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
