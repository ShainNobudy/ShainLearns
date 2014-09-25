package com.shainnobudy.shainlearns.init;

import com.shainnobudy.shainlearns.item.ItemBananiumIngot;
import com.shainnobudy.shainlearns.item.ItemShL;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Habib on 9/25/2014.
 */

 public class ModItems
    {
        public static final ItemShL bananiumingot = new ItemBananiumIngot();

        public static void init()
        {
            GameRegistry.registerItem(bananiumingot, "bananiumingot");
        }
    }

