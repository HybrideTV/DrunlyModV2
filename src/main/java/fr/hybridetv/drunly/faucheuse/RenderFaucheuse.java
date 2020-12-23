package fr.hybridetv.drunly.faucheuse;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderFaucheuse extends RenderLiving<EntityFaucheuse>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/faucheuse/faucheuse.png");
	
	public RenderFaucheuse(RenderManager manager) 
	{
		super(manager, new ModelFaucheuse(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityFaucheuse entity) 
	{
		return TEXTURE;
	}
}
