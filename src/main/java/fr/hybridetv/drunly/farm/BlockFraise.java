package fr.hybridetv.drunly.farm;

import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;

public class BlockFraise extends BlockCrops {
	 public BlockFraise(String name)
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
        return ItemMod.fraise_seed;
    }
 
    @Override
    protected Item getCrop() {
        return ItemMod.fraise;
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
