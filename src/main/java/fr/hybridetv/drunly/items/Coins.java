package fr.hybridetv.drunly.items;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class Coins extends Item {
	public Coins (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}
