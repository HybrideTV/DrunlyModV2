package fr.hybridetv.drunly.explosives;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class HardenedDynamite extends Item {
	public HardenedDynamite(String name) {
	    this.setMaxStackSize(64);
	    this.setCreativeTab(Drunly.drunlytab);
	    this.setUnlocalizedName(name);
	    this.setRegistryName(name);
	    
	}
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
        	
        	Vec3d look = playerIn.getLookVec();

            EntityHardenedDynamite entityegg = new EntityHardenedDynamite(worldIn, playerIn);
            entityegg.setPosition(playerIn.posX + look.x * 6.0D, playerIn.posY + look.y * 1.0D, playerIn.posZ + look.z * 6.0D);
            worldIn.spawnEntity(entityegg);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
	
	protected ResourceLocation getTexture(Dynamite dynamite) {
		return new ResourceLocation(References.MODID + ":textures/items/hardened_dynamite.png");
	}
}

