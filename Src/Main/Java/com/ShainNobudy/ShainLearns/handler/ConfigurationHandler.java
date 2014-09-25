package com.shainnobudy.shainlearns.handler;


import com.shainnobudy.shainlearns.refference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Habib on 9/23/2014.
 */
public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue =false;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if(configuration == null)
        {

            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {

        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }

    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL, false,"Example config value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
