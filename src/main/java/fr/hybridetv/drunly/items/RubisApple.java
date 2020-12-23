package fr.hybridetv.drunly.items;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RubisApple extends ItemFood{
	
	public RubisApple (String name, int amount, float saturation, boolean isWolfFood) 
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
	
	public void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5000, 1, false, false)); 
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5000, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3500, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 6000, 1, false, false));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5000, 1, false, false));

		return;
	} 
}