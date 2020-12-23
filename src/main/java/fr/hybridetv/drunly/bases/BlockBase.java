package fr.hybridetv.drunly.bases;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
	public BlockBase (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(2.0F);
	    setCreativeTab(Drunly.drunlytab);	    
	    }
}