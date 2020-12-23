package fr.hybridetv.drunly.rubis;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubisOre extends Block {
	public RubisOre (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(2.0F);
	    setCreativeTab(Drunly.drunlytab);	    
	    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)

	    {

	        return ItemMod.rubis_ingot;

	    }
}
