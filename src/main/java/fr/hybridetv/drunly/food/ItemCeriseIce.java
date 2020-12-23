package fr.hybridetv.drunly.food;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCeriseIce extends ItemFood {
	
	public ItemCeriseIce (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
		 setMaxStackSize(16);
	setCreativeTab(Drunly.drunlytab); 
	setAlwaysEdible();
	}

	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {   
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 1100, 0, false, false)); 
		return ;
	}

}
