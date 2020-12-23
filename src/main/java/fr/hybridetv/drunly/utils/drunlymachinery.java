package fr.hybridetv.drunly.utils;

import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class drunlymachinery extends CreativeTabs {

	public drunlymachinery(String label) { super("drunlymachinery");
	}

	public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(BlocksMod.SILVER_FURNACE_OFF));
		
	}
}
