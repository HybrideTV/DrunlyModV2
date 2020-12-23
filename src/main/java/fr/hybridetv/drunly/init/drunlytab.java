package fr.hybridetv.drunly.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class drunlytab extends CreativeTabs
{
	public drunlytab(String label) { super("drunlytab");
	}

	public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(BlocksMod.cave_block));
		
	}
}