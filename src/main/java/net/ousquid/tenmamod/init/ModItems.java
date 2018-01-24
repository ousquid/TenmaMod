package net.ousquid.tenmamod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.ousquid.tenmamod.TenmaMod;
import net.ousquid.tenmamod.items.ItemBasic;

@Mod.EventBusSubscriber(modid= TenmaMod.MOD_ID)
public class ModItems {

    static Item tenma;
    static Item hanma;
    static Item starchysauce;


    public static void init() {
        tenma = new ItemBasic("tenma").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(8);
        hanma = new ItemBasic("hanma").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1);
        starchysauce = new ItemBasic("starchysauce").setCreativeTab(CreativeTabs.MISC).setMaxStackSize(64);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(tenma, hanma, starchysauce);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(tenma);
        registerRender(hanma);
        registerRender(starchysauce);

    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
