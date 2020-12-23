package fr.hybridetv.drunly.blocks;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HardenedObsidian extends Block {
	
	public HardenedObsidian (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(20.0F);
	    setHardness(20.5F);
	    setCreativeTab(Drunly.drunlytab);	   
	    
	    }
}
