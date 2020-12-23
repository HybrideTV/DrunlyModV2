package fr.hybridetv.drunly.rubis;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubisBlock extends Block {
	public RubisBlock (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(2.0F);
	    setHardness(2.0F);
	    setCreativeTab(Drunly.drunlytab);	    
	    }
}
