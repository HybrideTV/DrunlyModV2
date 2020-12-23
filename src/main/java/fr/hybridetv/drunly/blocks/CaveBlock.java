package fr.hybridetv.drunly.blocks;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CaveBlock extends Block {
	public CaveBlock (String name, Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(1.0F);
	    setHardness(1.0F);
	    setCreativeTab(Drunly.drunlytab);	   
	    
	    }
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return true;
    }
	
	
	@SideOnly(Side.CLIENT) 
	public BlockRenderLayer func_180664_k() {
		return BlockRenderLayer.CUTOUT_MIPPED; 
		}
	
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
	return null;
	}


}
