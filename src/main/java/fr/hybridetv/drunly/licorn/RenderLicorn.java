package fr.hybridetv.drunly.licorn;

import fr.hybridetv.drunly.References;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLicorn extends RenderLiving<EntityLicorn>
{
	public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/licorn/licorn.png");
	
	public RenderLicorn(RenderManager manager) 
	{
		super(manager, new ModelLicorn(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityLicorn entity) 
	{
		return TEXTURE;
	}
}

