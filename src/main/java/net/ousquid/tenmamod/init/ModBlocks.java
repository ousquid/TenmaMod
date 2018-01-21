package net.ousquid.tenmamod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.ousquid.tenmamod.TenmaMod;
import net.ousquid.tenmamod.blocks.BlockBasic;

@Mod.EventBusSubscriber(modid= TenmaMod.MOD_ID)
public class ModBlocks {

    static Block sekihidaiBlock;
    static Block sekihihanBlock;
    static Block sekihigakuBlock;
    static Block sekihiBlock;

    public static void init() {
        sekihidaiBlock = new BlockBasic("sekihidai", Material.ROCK).setHardness(1.5f)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(1.0f);
        sekihidaiBlock.setHarvestLevel("pickaxe", 2);

        sekihihanBlock = new BlockBasic("sekihihan", Material.ROCK).setHardness(1.5f)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(1.0f);
        sekihihanBlock.setHarvestLevel("pickaxe", 2);

        sekihigakuBlock = new BlockBasic("sekihigaku", Material.ROCK).setHardness(1.5f)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(1.0f);
        sekihigakuBlock.setHarvestLevel("pickaxe", 2);

        sekihiBlock = new BlockBasic("sekihi", Material.ROCK).setHardness(1.5f)
                .setCreativeTab(CreativeTabs.BUILDING_BLOCKS).setLightLevel(0.0f);
        sekihiBlock.setHarvestLevel("pickaxe", 2);
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(sekihidaiBlock, sekihihanBlock, sekihigakuBlock, sekihiBlock);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new ItemBlock(sekihidaiBlock).setRegistryName(sekihidaiBlock.getRegistryName()),
                new ItemBlock(sekihihanBlock).setRegistryName(sekihihanBlock.getRegistryName()),
                new ItemBlock(sekihigakuBlock).setRegistryName(sekihigakuBlock.getRegistryName()),
                new ItemBlock(sekihiBlock).setRegistryName(sekihiBlock.getRegistryName())
        );

    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(sekihidaiBlock));
        registerRender(Item.getItemFromBlock(sekihihanBlock));
        registerRender(Item.getItemFromBlock(sekihigakuBlock));
        registerRender(Item.getItemFromBlock(sekihiBlock));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}

