package fr.hybridetv.drunly.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init()
	{
		GameRegistry.addSmelting(BlocksMod.cobalt_ore, new ItemStack(ItemMod.cobalt_ingot), 1.5F);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ItemMod.fried_egg), 1.5F);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ItemMod.acier), 1.0F);
		GameRegistry.addSmelting(ItemMod.cannabis_leaf, new ItemStack(ItemMod.cannabis_cooked_leaf), 1.0F);
		GameRegistry.addSmelting(BlocksMod.uranium_ore, new ItemStack(ItemMod.uranium_ingot), 1.5F);

	}

}
