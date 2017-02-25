package com.imbluesmedia.lifegoeson.block;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Luke on 25/02/2017.
 */
public class TuskOre extends Block {

    public TuskOre(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(LifeGoesOn.tabLGO);
        this.setHardness(3f);
        this.setResistance(5f);

    }
}
