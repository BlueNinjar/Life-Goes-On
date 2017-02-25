package com.imbluesmedia.lifegoeson.block;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import com.imbluesmedia.lifegoeson.item.FlameStone;
import com.imbluesmedia.lifegoeson.item.SpeedStone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Luke on 24/02/2017.
 */
public class LGOBlock {

    public static Block lgoTuskOre;

    public static void preInit () {

        lgoTuskOre = new TuskOre(Material.ROCK, "lgo_tusk_ore");

        registerBlocks();

    }

    public static void registerBlocks() {
    registerBlock(lgoTuskOre, "lgo_tusk_ore");

    }

    public static void registerBlock(Block block, String name) {
        GameRegistry.register(block, new ResourceLocation(LifeGoesOn.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(LifeGoesOn.MODID, name));
    }

    public static void registerRenders() {
        registerRender(lgoTuskOre);

    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(LifeGoesOn.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }


}
