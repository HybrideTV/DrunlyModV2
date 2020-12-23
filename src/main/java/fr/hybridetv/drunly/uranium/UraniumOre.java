package fr.hybridetv.drunly.uranium;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UraniumOre extends Block {
public UraniumOre (String name, Material materialIn) 
{
	super(materialIn);
	setUnlocalizedName(name);
	setRegistryName(name);
	setResistance(2.0F);
    setHardness(2.0F);
    setCreativeTab(Drunly.drunlytab);	    
    }
}
