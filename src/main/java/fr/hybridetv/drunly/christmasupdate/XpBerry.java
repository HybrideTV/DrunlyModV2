package fr.hybridetv.drunly.christmasupdate;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class XpBerry extends Item {

	public XpBerry (String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlyfarm);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
	player.addExperience(5);
	return stack;
	}
}
