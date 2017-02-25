package com.imbluesmedia.lifegoeson.tab;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import com.imbluesmedia.lifegoeson.item.LGOItems;
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

    public CreativeTabLGO() {
        super(LifeGoesOn.MODID);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public Item getTabIconItem() {
        return LGOItems.lgoSpeedStone;
    }

    @Override
    public boolean hasSearchBar() {
        return true;

    }


}
