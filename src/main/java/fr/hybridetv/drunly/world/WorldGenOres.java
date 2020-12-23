package fr.hybridetv.drunly.world;

import java.util.Random;

import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator generator, IChunkProvider provider)
    {
        switch (world.provider.getDimension())
        {
            case 0:
              //runGenerator(BlocksMod.cobalt_ore, Blocks.STONE, 4, 4, 3, 20, random, chunkX, chunkZ, world);
              //runGenerator(BlocksMod.rubis_ore, Blocks.STONE, 5, 7, 3, 20, random, chunkX, chunkZ, world);
              //runGenerator(BlocksMod.drunlyk_ore, Blocks.IRON_ORE, 3, 70, 3, 25, random, chunkX, chunkZ, world);
              runGenerator(BlocksMod.grenade_block, Blocks.LEAVES, 3, 50, 40, 100, random, chunkX, chunkZ, world);
              runGenerator(BlocksMod.grenade_block, Blocks.LEAVES2, 2, 50, 40, 100, random, chunkX, chunkZ, world);
              //runGenerator(BlocksMod.uranium_ore, Blocks.GOLD_ORE, 3, 25, 3, 35, random, chunkX, chunkZ, world);
              runGenerator(BlocksMod.uranium_ore, BlocksMod.radioactive_dirt, 3, 15, 3, 100, random, chunkX, chunkZ, world);
                break;
            case -1:
            	runGenerator(BlocksMod.blackstone, Blocks.NETHERRACK, 40, 10, 3, 100, random, chunkX, chunkZ, world);
            	runGenerator(BlocksMod.gold_nether_ore, Blocks.NETHERRACK, 6, 6, 3, 100, random, chunkX, chunkZ, world);
                break;
        }
    }
 
    private void runGenerator(Block block, Block blockIn, int maxSize, int chance, int minHeight, int maxHeight, Random random, int chunkX, int chunkZ, World world)
    {
        if (minHeight > maxHeight || minHeight < 0 || minHeight > 256)
            throw new IllegalArgumentException("Ore Generated out of bounds");
 
        int heightDiff = maxHeight - minHeight + 1;
 
        for (int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);
 
            WorldGenerator generator = new WorldGenMinable(block.getDefaultState(), maxSize, BlockMatcher.forBlock(blockIn));
            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }
}