package fr.hybridetv.drunly.biomes;

import fr.hybridetv.drunly.init.BlocksMod;
import net.minecraft.world.biome.Biome;

public class RadioactiveBiome extends Biome {
	
	public RadioactiveBiome()
	{
		super(new BiomeProperties("RadioactiveBiome").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		topBlock = BlocksMod.radioactive_dirt.getDefaultState();
		fillerBlock = BlocksMod.radioactive_dirt.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}
