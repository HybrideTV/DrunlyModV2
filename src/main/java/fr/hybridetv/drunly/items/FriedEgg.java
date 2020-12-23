package fr.hybridetv.drunly.items;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FriedEgg extends ItemFood{
	
	public FriedEgg (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	}
	
		protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 400, 0, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1000, 0, false, false));
		return ;
	}

}
