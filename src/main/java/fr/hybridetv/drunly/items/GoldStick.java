package fr.hybridetv.drunly.items;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class GoldStick extends Item {
	public GoldStick (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}