package fr.hybridetv.drunly.uranium;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemUraniumIngot extends Item {
	public ItemUraniumIngot (String name)
	{
        setUnlocalizedName(name); 
        setCreativeTab(Drunly.drunlytab); 
		setRegistryName(name);
    }
	
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) 
	{
		return 10000;
	}
}