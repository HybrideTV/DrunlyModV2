package fr.hybridetv.drunly.farm;

import java.util.Random;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FertilizedDirtBlock extends Block{

   // private static final AxisAlignedBB COPIED_FARMLAND_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.9375D, 1.0D);

    public FertilizedDirtBlock(String name) {
        super(Material.GROUND);
        setTickRandomly(true);
        setHardness(0.5f);
        setRegistryName(name);
        setUnlocalizedName(name);
        setSoundType(SoundType.GROUND);
        setHarvestLevel("wood", 0);
    }

    /*@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random)
	{
		super.tick(state, worldIn, pos, random);

		for (int i = 0; i < 3; i++)
		{
			BlockState aboveState = worldIn.getBlockState(pos.up());
			Block aboveBlock = aboveState.getBlock();

			if (aboveBlock instanceof IPlantable && aboveState.ticksRandomly())
			{
				aboveState.randomTick(worldIn, pos.up(), random);
			}
			else
			{
				break;
			}
		}
	}*/
    /*@Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand){
    	 if (rand.nextBoolean() && rand.nextInt(8) == 0) {
          	System.out.println("test");

         	 super.randomDisplayTick(state, worldIn, pos, rand);
         }
     System.out.println("test2");
    }
    */
    public void randomTick(World world, BlockPos pos, IBlockState state, Random par5Random)
    {
    	if(!world.isRemote)
        growCropsNearby(world, pos, state);
    }
    /*
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
   	
            if (rand.nextBoolean() && rand.nextInt(8) == 0) {
            	System.out.println("test3");
            	 super.randomDisplayTick(stateIn, worldIn, pos, rand);
            }
        
        super.randomDisplayTick(stateIn, worldIn, pos, rand);
    }*/
      
    private void growCropsNearby(World world, BlockPos pos, IBlockState state) {
        int x0 = pos.getX();
        int y0 = pos.getY();
        int z0 = pos.getZ();
        for (int yD = -1; yD <= 64; yD++) {
          int x = x0;
          int y = y0 + yD;
          int z = z0;
          double distance = Math.sqrt(Math.pow((y - y0), 2.0D));
          distance = Math.min(1.0D, distance);
          IBlockState cropState = world.getBlockState(new BlockPos(x, y, z));
          Block cropBlock = cropState.getBlock();
          if (!(cropBlock instanceof FertilizedDirtBlock) && cropBlock != Blocks.WHEAT && !(cropBlock instanceof net.minecraft.block.IGrowable) && !(cropBlock instanceof net.minecraftforge.common.IPlantable))
            break; 
          if (cropBlock instanceof net.minecraft.block.IGrowable || cropBlock instanceof net.minecraftforge.common.IPlantable)
            for (int i = 0; i < Drunly.loops; i++)
              cropBlock.updateTick(world, new BlockPos(x, y, z), cropState, world.rand);  
        } 
      }

    /*public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
        return true;
    }


    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return COPIED_FARMLAND_AABB;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }*/
}
