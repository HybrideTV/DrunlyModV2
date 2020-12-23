package fr.hybridetv.drunly.explosives;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class HardenedDynamiteRender extends Render<EntityHardenedDynamite>{

protected HardenedDynamiteRender(RenderManager renderManager) {
		super(renderManager);
	}

@Override
protected ResourceLocation getEntityTexture(EntityHardenedDynamite entity) {
	
	return new ResourceLocation(References.MODID + ":textures/entity/hardened_dynamite.png");
}
}