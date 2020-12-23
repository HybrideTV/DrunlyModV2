package fr.hybridetv.drunly.utils;

import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class drunlyfarm extends CreativeTabs {

	public drunlyfarm(String label) { super("drunlyfarm");
	}

	public ItemStack getTabIconItem() { return new ItemStack(ItemMod.citron_modifier);
		
	}
}
