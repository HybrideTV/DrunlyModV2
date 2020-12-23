package fr.hybridetv.drunly.rubis;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class RubisIngot extends Item {
	
	public RubisIngot(String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}

}
