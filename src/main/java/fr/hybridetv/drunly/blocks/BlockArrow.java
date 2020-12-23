package fr.hybridetv.drunly.blocks;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockArrow extends Block {
	
	public BlockArrow (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(0.5F);
	    setCreativeTab(Drunly.drunlytab);	    
		
	}
}
