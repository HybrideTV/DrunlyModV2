package fr.hybridetv.drunly.blocks;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class StoneBrickStairs extends BlockStairs {
	
	public StoneBrickStairs(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(0.5F);
	    setLightOpacity(0);
	    setCreativeTab(Drunly.drunlytab);
		
	}
}

