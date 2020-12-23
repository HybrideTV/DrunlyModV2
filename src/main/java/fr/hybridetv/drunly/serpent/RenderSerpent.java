package fr.hybridetv.drunly.serpent;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSerpent extends RenderLiving<EntitySerpent>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/serpent/serpent.png");
	
	public RenderSerpent(RenderManager manager) 
	{
		super(manager, new ModelSerpent(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySerpent entity) 
	{
		return TEXTURE;
	}
}

