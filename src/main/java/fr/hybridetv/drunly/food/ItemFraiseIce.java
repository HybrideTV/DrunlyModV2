package fr.hybridetv.drunly.food;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFraiseIce extends ItemFood {
		
	public ItemFraiseIce (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	setAlwaysEdible();
	 setMaxStackSize(16);

	}

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 4, false, false)); 
		return ;
	}

}

