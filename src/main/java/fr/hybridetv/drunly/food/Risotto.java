package fr.hybridetv.drunly.food;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Risotto extends ItemFood {
	
	public Risotto (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	}
	
		protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2000, 0, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 4500, 0, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 4500, 0, false, false)); 

		return ;
	}

}

