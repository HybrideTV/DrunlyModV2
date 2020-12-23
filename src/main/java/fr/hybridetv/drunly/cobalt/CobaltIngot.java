package fr.hybridetv.drunly.cobalt;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class CobaltIngot extends Item {
	
	public CobaltIngot (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}

}
