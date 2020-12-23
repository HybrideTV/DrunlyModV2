package fr.hybridetv.drunly.cobalt;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CobaltBlock extends Block {
	
	public CobaltBlock (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(2.0F);
	    setCreativeTab(Drunly.drunlytab);	    
	    }
}