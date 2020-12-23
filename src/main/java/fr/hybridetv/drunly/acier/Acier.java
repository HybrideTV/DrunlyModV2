package fr.hybridetv.drunly.acier;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class Acier extends Item {
	
	public Acier (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}

