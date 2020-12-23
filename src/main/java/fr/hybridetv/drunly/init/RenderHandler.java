package fr.hybridetv.drunly.init;

import fr.hybridetv.drunly.faucheuse.EntityFaucheuse;
import fr.hybridetv.drunly.faucheuse.RenderFaucheuse;
import fr.hybridetv.drunly.licorn.EntityLicorn;
import fr.hybridetv.drunly.licorn.RenderLicorn;
import fr.hybridetv.drunly.serpent.EntitySerpent;
import fr.hybridetv.drunly.serpent.RenderSerpent;
import fr.hybridetv.drunly.tortue.EntityTurtle;
import fr.hybridetv.drunly.tortue.RenderTurtle;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new IRenderFactory<EntityTurtle>()
		{
			@Override
			public Render<? super EntityTurtle> createRenderFor(RenderManager manager) 
			{
				return new RenderTurtle(manager);		
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFaucheuse.class, new IRenderFactory<EntityFaucheuse>()
		{
			@Override
			public Render<? super EntityFaucheuse> createRenderFor(RenderManager manager) 
			{
				return new RenderFaucheuse(manager);		
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySerpent.class, new IRenderFactory<EntitySerpent>()
		{
			@Override
			public Render<? super EntitySerpent> createRenderFor(RenderManager manager) 
			{
				return new RenderSerpent(manager);		
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLicorn.class, new IRenderFactory<EntityLicorn>()
		{
			@Override
			public Render<? super EntityLicorn> createRenderFor(RenderManager manager) 
			{
				return new RenderLicorn(manager);		
			}
		});
		
		
	}
	
	public static void registerCustomMeshesAndStates()
	{
		
	}
	
}
