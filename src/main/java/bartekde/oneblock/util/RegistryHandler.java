package bartekde.oneblock.util;

import bartekde.oneblock.OneBlock;
import bartekde.oneblock.block.BlockBasic;
import bartekde.oneblock.init.MyBlocks;
import bartekde.oneblock.item.*;

import bartekde.oneblock.materials.OneBlockMaterials;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemBasic("itemBasic", "basic_item"),
                new ItemOneBlockAxe(OneBlockMaterials.ONE_BLOCK_TOOL, "oneBlockAxe", "one_block_axe"),
                new ItemOneBlockPickaxe(OneBlockMaterials.ONE_BLOCK_TOOL, "oneBlockPickaxe", "one_block_pickaxe"),
                new ItemOneBlockSword(OneBlockMaterials.ONE_BLOCK_TOOL, "oneBlockSword", "one_block_sword"),
                new ItemOneBlockShovel(OneBlockMaterials.ONE_BLOCK_TOOL, "oneBlockShovel", "one_block_shovel"),
                new ItemOneBlockHoe(OneBlockMaterials.ONE_BLOCK_TOOL, "oneBlockHoe", "one_block_hoe")
        };

        final Item[] itemBlocks = {
                new ItemBlock(MyBlocks.BASIC_BLOCK).setRegistryName(MyBlocks.BASIC_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

}
