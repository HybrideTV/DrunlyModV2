package fr.hybridetv.drunly.farm;

import java.util.Random;

import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;

public class BlockTrefle extends BlockCrops {
	 public BlockTrefle(String name)
	    {
	        this.setDefaultState(this.blockState.getBaseState().withProperty(this.getAgeProperty(), Integer.valueOf(0)));
	        this.setUnlocalizedName(name);
	        this.setRegistryName(name);
	        this.setHardness(0.0F);
	        this.setSoundType(SoundType.PLANT);
	        this.disableStats();
	    }


	@Override
protected Item getSeed() {
  return ItemMod.trefle_seed;
}

@Override
protected Item getCrop() {
  return ItemMod.trefle;
}


public int quantityDropped(Random random)
{
	int drop = random.nextInt(50);
	if(drop > 48) {
		return 1;
	}
	else
		return 0;
}

protected PropertyInteger getAgeProperty()
{
  return AGE;
}

public int getMaxAge()
{
  return 7;
}
}
