package fr.hybridetv.drunly.items;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CobaltApple extends ItemFood{
	
	public CobaltApple (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		 setUnlocalizedName(name); 
		 setRegistryName(name);  
		 setCreativeTab(Drunly.drunlytab); 
		 setAlwaysEdible();
		 setMaxStackSize(16);

	}
	
	@Override
	public boolean hasEffect(ItemStack stack) 
	{
		return true;
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
     
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 7500, 2, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 7500, 2, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 4500, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 10000, 2, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5000, 2, false, false));

		return ;
	}
}