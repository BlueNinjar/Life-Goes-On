package com.imbluesmedia.lifegoeson.recipe;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import com.imbluesmedia.lifegoeson.block.LGOBlock;
import com.imbluesmedia.lifegoeson.item.LGOItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Luke on 25/02/2017.
 */
public class LGORecipe {

    public static void Init() {

        //Speed Stone
        GameRegistry.addShapedRecipe(new ItemStack(LGOItems.lgoSpeedStone), "SIS", "IDI", "SIS", 'S', Items.SUGAR, 'I', Items.IRON_INGOT, 'D', Items.DIAMOND);
        //Fire Stone
        GameRegistry.addShapedRecipe(new ItemStack(LGOItems.lgoFlameStone), "LOL", "ODO", "LOL", 'L', Items.LAVA_BUCKET, 'O', Blocks.OBSIDIAN, 'D', Items.DIAMOND);
        //Tusk Ore
        GameRegistry.addSmelting(LGOBlock.lgoTuskOre, new ItemStack(Items.DIAMOND, 2), 1F);
    }
}
