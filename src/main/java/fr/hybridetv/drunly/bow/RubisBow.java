package fr.hybridetv.drunly.bow;

import javax.annotation.Nullable;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubisBow extends ItemBow {
	
	public RubisBow (String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		setMaxDamage(750);
		setMaxStackSize(1);
		
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    return entityIn.getActiveItemStack().getItem() != ItemMod.rubis_bow ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
                }
            }
        });
        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
		
		ItemMod.ITEMS.add(this);
	}
	
	@Override
	public int getItemEnchantability() 
	{
		return 10;
	}

}
