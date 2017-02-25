package com.imbluesmedia.lifegoeson.recipe;

import com.imbluesmedia.lifegoeson.item.LGOItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Luke on 25/02/2017.
 */
public class LGORecipe {

    public static void Init() {

        GameRegistry.addShapedRecipe(new ItemStack(LGOItems.lgoSpeedStone), "SIS", "IDI", "SIS", 'S', Items.SUGAR, 'I', Items.IRON_INGOT, 'D', Items.DIAMOND);

    }
}
