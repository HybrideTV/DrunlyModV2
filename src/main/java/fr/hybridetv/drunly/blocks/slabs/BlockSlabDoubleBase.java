package fr.hybridetv.drunly.blocks.slabs;

import java.util.List;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockSlabDoubleBase extends BlockSlabBase
{
	public BlockSlabDoubleBase(String name, Material materialIn, CreativeTabs tab, BlockSlab half) 
	{
		super(name, materialIn, tab, half);
	}

	@Override
	public boolean isDouble() 
	{	
		return false;
	}

	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
         super.addInformation(stack, worldIn, tooltip, flagIn);
         tooltip.add("Utilisez le block complet.");
    }
}
