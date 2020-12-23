package fr.hybridetv.drunly.explosives;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
 
public class DynamiteRender extends Render<EntityDynamite>{

public DynamiteRender(RenderManager renderManager) {
		super(renderManager);
	}

@Override
protected ResourceLocation getEntityTexture(EntityDynamite entity) {
	
	return new ResourceLocation(References.MODID + ":textures/entity/dynamite.png");
}
}