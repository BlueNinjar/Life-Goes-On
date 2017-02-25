package com.imbluesmedia.lifegoeson.item;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Luke on 24/02/2017.
 */
public class LGOItems {

    public static Item lgoSpeedStone;

    public static void preInit () {

        lgoSpeedStone = new SpeedStone("lgo_speed_stone");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(lgoSpeedStone, new ResourceLocation(LifeGoesOn.MODID, "lgo_speed_stone"));

    }

    public static void registerRenders() {
        registerRender(lgoSpeedStone);

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LifeGoesOn.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }


}
