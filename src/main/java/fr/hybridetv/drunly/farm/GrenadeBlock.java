package fr.hybridetv.drunly.farm;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GrenadeBlock extends Block {
public GrenadeBlock(String name, Material materialIn) 
{
	super(materialIn);
	setUnlocalizedName(name);
	setRegistryName(name);
	setResistance(1.0F);
    setHardness(1.5F);
    setCreativeTab(Drunly.drunlyfarm);	   
    
    }

@Override
public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemMod.grenade;

    }
}