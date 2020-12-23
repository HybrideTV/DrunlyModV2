package fr.hybridetv.drunly.blocks;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ConcreteBlock extends Block {
	public ConcreteBlock (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(1.0F);
	    setHardness(1.0F);
	    setCreativeTab(Drunly.drunlytab);	    
		
	}

}
