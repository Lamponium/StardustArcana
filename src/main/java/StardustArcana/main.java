package stardustarcana;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import stardustarcana.proxy.CommonProxy;
import stardustarcana.utils.Reference;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = true)

public class main
{
    @Mod.Instance
    public static main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void PostPreInit(FMLPostInitializationEvent event)
    {

    }

}
