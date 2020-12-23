package fr.hybridetv.drunly.hematite;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class HematiteIngot extends Item {
	public HematiteIngot (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
}
