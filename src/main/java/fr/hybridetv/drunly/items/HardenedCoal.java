package fr.hybridetv.drunly.items;


import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HardenedCoal extends Item {
	public HardenedCoal (String name)
	{
        setUnlocalizedName(name); 
        setCreativeTab(Drunly.drunlytab); 
		setRegistryName(name);
    }
	
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 2400;
	}
}
