package com.stardustnaeku.stardustarcana;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import com.stardustnaeku.stardustarcana.utils.Reference;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, useMetadata = true)
public class StardustArcana
{

    @Mod.Instance("StardustArcana")
    public static StardustArcana instance;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        //Network handling
        //Mod Configuratuins

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event)
    {
        // General Event Handlers
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {
        //Everything to run after other mods
    }
}
