package fr.hybridetv.drunly.food;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemJoin extends ItemFood {

	public ItemJoin(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	 setMaxStackSize(16);
	setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 400, 0, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 650, 1, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 100, 0, false, false)); 
		return ;
	}

}

