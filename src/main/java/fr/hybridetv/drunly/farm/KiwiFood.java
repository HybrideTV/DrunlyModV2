package fr.hybridetv.drunly.farm;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.ItemFood;

public class KiwiFood extends ItemFood {
	
	public KiwiFood (String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlyfarm);
		
	}
}
