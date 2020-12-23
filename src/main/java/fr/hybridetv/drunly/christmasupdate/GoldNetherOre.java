package fr.hybridetv.drunly.christmasupdate;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class GoldNetherOre extends Block {
	
	public GoldNetherOre (String name, Material materialIn) 
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

	        return Items.GOLD_NUGGET;
	    }
	
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {return 20;}
	
	}