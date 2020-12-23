package fr.hybridetv.drunly.init;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.ModConfiguration;
import fr.hybridetv.drunly.References;
import fr.hybridetv.drunly.explosives.EntityDynamite;
import fr.hybridetv.drunly.faucheuse.EntityFaucheuse;
import fr.hybridetv.drunly.licorn.EntityLicorn;
import fr.hybridetv.drunly.serpent.EntitySerpent;
import fr.hybridetv.drunly.tortue.EntityTurtle;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void init() {
	
	}
	
	public static void registerEntities()
	{
		registerEntity("EntityDynamite", EntityDynamite.class, ModConfiguration.ENTITYDYNAMITE, 50, 11437146, 000000);
		registerEntity("EntityHardenedDynamite", EntityDynamite.class, ModConfiguration.ENTITYHARDENEDDYNAMITE, 50, 11437146, 000000);
		registerEntity("turtle", EntityTurtle.class, ModConfiguration.ENTITY_TURTLE, 50, 13310623, 65354);
		registerEntity("faucheuse", EntityFaucheuse.class, ModConfiguration.ENTITY_FAUCHEUSE, 50, 13310623, 65354);
		registerEntity("serpent", EntitySerpent.class, ModConfiguration.ENTITY_SERPENT, 50, 13310623, 65354);
		registerEntity("licorn", EntityLicorn.class, ModConfiguration.ENTITY_LICORN, 50, 13310623, 65354);

	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, Drunly.instance, range, 1, true, color1, color2);
	}
}