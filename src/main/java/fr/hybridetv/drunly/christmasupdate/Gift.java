package fr.hybridetv.drunly.christmasupdate;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Gift extends Block {

	public Gift (String name, Material materialIn) 
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

	        return ItemMod.candy_cane;
	    }
	
    public int quantityDropped(Random rand)

    {
        return 2 + rand.nextInt(5);
    }
	
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {return 15;}
	
	}

