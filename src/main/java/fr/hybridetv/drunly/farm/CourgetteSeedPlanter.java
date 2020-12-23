package fr.hybridetv.drunly.farm;

import com.google.common.collect.Multimap;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CourgetteSeedPlanter extends ItemHoe {
private final float speed;
	
	public CourgetteSeedPlanter (ToolMaterial material) {
		super(material);
        this.speed = material.getAttackDamage() + 1.0F;
        this.setMaxStackSize(1);
        this.setCreativeTab(Drunly.drunlyfarm);
		
	}
	
	
	@SuppressWarnings("incomplete-switch")
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float X, float Y, float Z)
    {
		
		
        ItemStack itemstack = player.getHeldItem(hand);

        if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
        {
            return EnumActionResult.FAIL;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(itemstack, player, worldIn, pos);
            if (hook != 0) return hook > 0 ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (facing != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.FARMLAND || block == Blocks.FARMLAND)
                {
                	this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y + 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                	this.setBlock(itemstack, player, worldIn, pos.add(X, Y + 1, Z), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y + 1 , Z - 1), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y + 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X, Y + 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y + 1, Z), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y + 1, Z), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X, Y + 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y + 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                    this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y + 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());

                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.FARMLAND)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, BlocksMod.courgette_crop.getDefaultState());
                        	this.setBlock(itemstack, player, worldIn, pos.add(X, Y - 1, Z), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y - 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y - 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X, Y - 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y - 1, Z), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y - 1, Z), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X, Y - 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X + 1, Y - 1, Z - 1), BlocksMod.courgette_crop.getDefaultState());
                            this.setBlock(itemstack, player, worldIn, pos.add(X - 1, Y - 1, Z + 1), BlocksMod.courgette_crop.getDefaultState());
                            return EnumActionResult.SUCCESS;
                        case COARSE_DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                            return EnumActionResult.SUCCESS;
                            
                    }
                }
            }

            return EnumActionResult.PASS;
        }
    }

    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }

    protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos f, IBlockState state)
    {
        worldIn.playSound(player, f, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(f, state, 11);
            stack.damageItem(1, player);
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    public String getMaterialName()
    {
        return this.toolMaterial.toString();
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 0.0D, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)(this.speed - 4.0F), 0));
        }

        return multimap;
    }
}