package fr.hybridetv.drunly.drunlyk;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class DrunlykPowder extends Item {
	
	public DrunlykPowder (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}
