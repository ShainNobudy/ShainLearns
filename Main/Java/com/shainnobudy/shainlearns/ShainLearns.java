package com.shainnobudy.shainlearns;


import com.shainnobudy.shainlearns.handler.ConfigurationHandler;
import com.shainnobudy.shainlearns.init.ModItems;
import com.shainnobudy.shainlearns.proxy.IProxy;
import com.shainnobudy.shainlearns.refference.Reference;
import com.shainnobudy.shainlearns.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Habib on 9/22/2014.
 */

@Mod(modid= Reference.MOD_ID,name= Reference.MOD_NAME,version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ShainLearns
{

    @Mod.Instance(Reference.MOD_ID)
    public static ShainLearns instance;

    @SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS,serverSide =Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

   @Mod.EventHandler

   public void preInit(FMLPreInitializationEvent event)
   {
       ConfigurationHandler.init(event.getSuggestedConfigurationFile());
       FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
       LogHelper.info("Banana chockolate Tart!!!");

       ModItems.init();
   }

   @Mod.EventHandler

   public void Init(FMLInitializationEvent event)
   {
       LogHelper.info("Banana chockolate pie!!!!");
   }

   @Mod.EventHandler

   public void postInit(FMLPostInitializationEvent event)
   {
       LogHelper.info("Banana chockolate cake!!!");
   }


}
