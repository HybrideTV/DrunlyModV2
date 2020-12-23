package fr.hybridetv.drunly.farm;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;

public class FarmingModifier extends Item {
	
	public FarmingModifier (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlyfarm);
		
	}

}
