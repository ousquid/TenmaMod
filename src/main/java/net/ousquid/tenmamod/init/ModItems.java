package net.ousquid.tenmamod.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
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

    public static void init() {
        tenma = new ItemBasic("tenma");
        hanma = new ItemBasic("hanma");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(tenma, hanma);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(tenma);
        registerRender(hanma);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
