package fr.hybridetv.drunly.items;

import java.util.Set;

import com.google.common.collect.Sets;

import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FarmTool extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(BlocksMod.red_dirt,BlocksMod.SILVER_FURNACE_OFF, BlocksMod.SILVER_FURNACE_ON,BlocksMod.rubis_block,BlocksMod.rubis_ore,BlocksMod.drunlyk_block,BlocksMod.quartz_fence,BlocksMod.ICE_MACHINE_OFF, BlocksMod.ICE_MACHINE_ON,BlocksMod.hardened_obsidian, BlocksMod.hematite_block,BlocksMod.cave_block, BlocksMod.cobalt_block, BlocksMod.cobalt_ore,Blocks.COAL_BLOCK, Blocks.EMERALD_BLOCK, Blocks.GOLD_BLOCK,Blocks.COAL_ORE, Blocks.IRON_ORE, Blocks.GOLD_ORE, Blocks.EMERALD_ORE, Blocks.LAPIS_ORE,Blocks.OBSIDIAN,Blocks.SNOW, Blocks.SLIME_BLOCK, Blocks.CHEST, Blocks.ENDER_CHEST, Blocks.TRAPPED_CHEST,Blocks.STICKY_PISTON,Blocks.PISTON,Blocks.BRICK_BLOCK,Blocks.STONEBRICK,Blocks.BED, Blocks.BOOKSHELF,Blocks.TRAPDOOR,Blocks.BIRCH_STAIRS, Blocks.STONE_BUTTON, Blocks.ACACIA_FENCE, Blocks.ACTIVATOR_RAIL, Blocks.WOOL, Blocks.WOODEN_SLAB,Blocks.FURNACE, Blocks.BIRCH_DOOR, Blocks.ACACIA_DOOR,Blocks.GRASS, Blocks.ANVIL, Blocks.DIRT,Blocks.STONE, Blocks.SAND, Blocks.COBBLESTONE,Blocks.PLANKS, Blocks.CRAFTING_TABLE, Blocks.ACACIA_FENCE, Blocks.ACACIA_FENCE_GATE, Blocks.BIRCH_FENCE, Blocks.BIRCH_FENCE_GATE, Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE_GATE, Blocks.JUNGLE_FENCE, Blocks.JUNGLE_FENCE_GATE, Blocks.OAK_FENCE, Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE, Blocks.SPRUCE_FENCE_GATE, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

	public FarmTool(ToolMaterial toolcobalt) {
		super(toolcobalt, EFFECTIVE_ON);
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState state) {
	    return (state.getMaterial() == Material.WOOD || state.getMaterial() == Material.SAND ||state.getMaterial() == Material.GLASS ||state.getMaterial() == Material.IRON || state.getMaterial() == Material.ROCK || state.getMaterial() == Material.ANVIL) ? true : false;
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }
	
	protected void setBlock(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, IBlockState state)
    {
        worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!worldIn.isRemote)
        {
            worldIn.setBlockState(pos, state, 11);
            stack.damageItem(1, player);
        }
    }
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        return true;
    }
	
	@SuppressWarnings("incomplete-switch")
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
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
                if (block == Blocks.GRASS || block == Blocks.GRASS_PATH)
                {
                    this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
                    return EnumActionResult.SUCCESS;
                }

                if (block == Blocks.DIRT)
                {
                    switch ((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT))
                    {
                        case DIRT:
                            this.setBlock(itemstack, player, worldIn, pos, Blocks.FARMLAND.getDefaultState());
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
}
