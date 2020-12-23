package fr.hybridetv.drunly.farm;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.ItemFood;

public class Cerise extends ItemFood {
	
	public Cerise (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);	
		setUnlocalizedName(name); 
		 setRegistryName(name);  
	setCreativeTab(Drunly.drunlyfarm); 
	}
}


