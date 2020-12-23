package fr.hybridetv.drunly.bases;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood {
	public ItemFoodBase (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlytab); 
	}
	}