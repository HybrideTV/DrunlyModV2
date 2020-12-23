package fr.hybridetv.drunly.init;

import fr.hybridetv.drunly.ModConfiguration;
import fr.hybridetv.drunly.biomes.RadioactiveBiome;
import fr.hybridetv.drunly.world.biomes.RedWoodBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;


public class BiomeInit {
	
	public static final Biome REDWOOD = new RedWoodBiome();
	public static final Biome RADIOACTIVE = new RadioactiveBiome();
	
	public static void registerBiomes() {
		initBiome(REDWOOD, "Redwood", BiomeType.WARM);
		initBiome(RADIOACTIVE, "Radioactove", BiomeType.DESERT);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
		
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		
		if(ModConfiguration.spawnCustomBiomesInOverworld) {
			BiomeManager.addSpawnBiome(biome);
		}
		return biome;
	}

}
