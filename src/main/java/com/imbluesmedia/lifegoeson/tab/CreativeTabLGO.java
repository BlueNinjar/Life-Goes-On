package com.imbluesmedia.lifegoeson.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Luke on 24/02/2017.
 */
public class CreativeTabLGO extends CreativeTabs {

    public CreativeTabLGO(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.WATER_BUCKET;
    }
}
