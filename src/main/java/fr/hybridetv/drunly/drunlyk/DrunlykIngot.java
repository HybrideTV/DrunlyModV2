package fr.hybridetv.drunly.drunlyk;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class DrunlykIngot extends Item {

	public DrunlykIngot (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}
