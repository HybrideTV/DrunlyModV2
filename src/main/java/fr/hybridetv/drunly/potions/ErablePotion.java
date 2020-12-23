package fr.hybridetv.drunly.potions;

import java.util.List;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ErablePotion extends ItemFood {
	
	public ErablePotion (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {

		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 0, false, false));
		return;
	}
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
         super.addInformation(stack, worldIn, tooltip, flagIn);
         tooltip.add("Donne regeneration pendant 3 min");

    }
}

