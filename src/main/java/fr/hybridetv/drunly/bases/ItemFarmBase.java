package fr.hybridetv.drunly.bases;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.ItemFood;

public class ItemFarmBase extends ItemFood {
	public ItemFarmBase (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlyfarm); 
	}
	}