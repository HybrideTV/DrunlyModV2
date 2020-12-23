package fr.hybridetv.drunly.tortue;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderTurtle extends RenderLiving<EntityTurtle>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/turtle/turtle.png");
	
	public RenderTurtle(RenderManager manager) 
	{
		super(manager, new ModelTurtle(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTurtle entity) 
	{
		return TEXTURE;
	}
}
