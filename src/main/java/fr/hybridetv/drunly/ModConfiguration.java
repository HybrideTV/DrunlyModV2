package fr.hybridetv.drunly;

import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration 
{

	public static Configuration config;
	
	public static int ENTITY_FAUCHEUSE_ID = 203;
	public static int ENTITYDYNAMITE = 201;
	public static int ENTITYHARDENEDDYNAMITE = 202;
	public static int GUI_SILVER_FURNACE = 4;
	public static int GUI_SINTERING_FURNACE = 5;
	public static int ENTITY_TURTLE = 250;
	public static int ENTITY_FAUCHEUSE = 251;
	public static int ENTITY_SERPENT = 252;
	public static int ENTITY_LICORN = 253;
	
	public static int GUI_ICE_MACHINE = 6;
	public static boolean spawnCustomBiomesInOverworld = true;

	public static void init(File file)
	{
		config = new Configuration(file);	
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "MERCI DE NE PAS MODIFIER LES ID DES MOBS. VOTRE JEU RISQUE DE CRASH !");
		ENTITYDYNAMITE = config.getInt("ENTITYDYNAMITE", category, 202, 202, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITYHARDENEDDYNAMITE = config.getInt("ENTITYHARDENEDDYNAMITE", category, 203, 203, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_TURTLE = config.getInt("Entity Turtle", category, 250, 250, 500, "Entity Turtle ID");
		ENTITY_FAUCHEUSE = config.getInt("Entity Faucheuse", category, 251, 251, 500, "Entity Faucheuse ID");
		ENTITY_SERPENT = config.getInt("Entity Serpent", category, 252, 252, 500, "Entity Serpent ID");
		ENTITY_LICORN = config.getInt("Entity Licorn", category, 253, 253, 500, "Entity Licorn ID");


		category = "GUI IDs";
		config.addCustomCategoryComment(category, "MERCI DE NE PAS MODIFIER LES ID DES GUI. VOTRE JEU RISQUE DE CRASH !");
		GUI_SILVER_FURNACE = config.getInt("GUI Silver Furnace", category, 4, 0, 500, "GUI ID for the Silver Furnace");
		GUI_SINTERING_FURNACE = config.getInt("GUI Sintering Furnace", category, 5, 0, 500, "GUI ID for the Sintering Furnace");
		GUI_ICE_MACHINE = config.getInt("GUI Ice Machine", category, 6, 0, 500, "GUI ID for the Ice Machine");
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");	
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Drunly.config = new File(event.getModConfigurationDirectory() + "/" + References.MODID);
		Drunly.config.mkdirs();
		init(new File(Drunly.config.getPath(), References.MODID + ".cfg"));
	}
	

} 
