package fr.hybridetv.drunly.food;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SaladeTomate extends ItemFood {
	
	public SaladeTomate (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	}
	
		protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 9400, 0, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 9400, 0, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 9400, 0, false, false)); 

		return ;
	}

}

