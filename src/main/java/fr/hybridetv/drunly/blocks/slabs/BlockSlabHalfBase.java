package fr.hybridetv.drunly.blocks.slabs;


import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import fr.hybridetv.drunly.utils.IHasModel;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class BlockSlabHalfBase extends BlockSlabBase implements IHasModel
{
	public BlockSlabHalfBase(String name, Material materialIn, CreativeTabs tab, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, materialIn, tab, half);
		
		ItemMod.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	public void registerModels() 
	{
		Drunly.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}