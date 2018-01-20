package net.ousquid.tenmamod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.ousquid.tenmamod.init.ModItems;

@Mod(
        modid = TenmaMod.MOD_ID,
        name = TenmaMod.MOD_NAME,
        version = TenmaMod.VERSION,
        acceptedMinecraftVersions=TenmaMod.ACCEPTED_MINECRAFT_VERSIONS
)
public class TenmaMod {

    public static final String MOD_ID = "tenmamod";
    public static final String MOD_NAME = "TenmaMod";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12]";

    @Mod.Instance(MOD_ID)
    public static TenmaMod INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(MOD_ID + ":preInit");
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(MOD_ID + ":init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(MOD_ID + ":postInit");
    }

}
