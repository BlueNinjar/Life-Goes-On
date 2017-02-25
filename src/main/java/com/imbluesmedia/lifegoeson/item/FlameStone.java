package com.imbluesmedia.lifegoeson.item;

import com.imbluesmedia.lifegoeson.LifeGoesOn;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Luke on 25/02/2017.
 */
public class FlameStone extends Item {

    public FlameStone(String name) {
        setUnlocalizedName(name);
        setCreativeTab(LifeGoesOn.tabLGO);
        setMaxStackSize(1);

    }
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Fire protection when held");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (entity instanceof EntityPlayer) {
            EntityPlayer Player = (EntityPlayer) entity;
            if(Player.getHeldItemMainhand() != null && Player.getHeldItemMainhand().getItem() instanceof FlameStone) {

                Player.capabilities.disableDamage = true;
                Player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 0, 10 - 1));

            }
        }
        super.onUpdate(itemstack, world, entity, i, flag);
    }

}
