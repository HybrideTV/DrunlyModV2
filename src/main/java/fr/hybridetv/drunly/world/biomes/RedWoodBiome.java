package fr.hybridetv.drunly.world.biomes;

import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.world.biome.Biome;

public class RedWoodBiome extends Biome {
	
	public RedWoodBiome()
	{
		super(new BiomeProperties("RedWoodBiome").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		topBlock = BlocksMod.red_dirt.getDefaultState();
		fillerBlock = BlocksMod.red_dirt.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}
