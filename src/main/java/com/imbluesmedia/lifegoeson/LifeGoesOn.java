package com.imbluesmedia.lifegoeson;

import com.imbluesmedia.lifegoeson.item.LGOItems;
import com.imbluesmedia.lifegoeson.proxy.CommonProxy;
import com.imbluesmedia.lifegoeson.recipe.LGORecipe;
import com.imbluesmedia.lifegoeson.tab.CreativeTabLGO;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LifeGoesOn.MODID, name = LifeGoesOn.NAME, version = LifeGoesOn.VERSION)
public class LifeGoesOn {

    public static final String MODID = "lifegoeson";
    public static final String VERSION = "Beta 1.0";
    public static final String NAME = "Life Goes On";

    @SidedProxy(clientSide = "com.imbluesmedia.lifegoeson.proxy.ClientProxy", serverSide = "com.imbluesmedia.lifegoeson.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LifeGoesOn instance;

    public static CreativeTabLGO tabLGO;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabLGO = new CreativeTabLGO(CreativeTabs.getNextID(),"tab_lgo");
        LGOItems.preInit();
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        LGORecipe.Init();
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }
}
