package fr.hybridetv.drunly.explosives;

import fr.hybridetv.drunly.References;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
 
public class EntityDynamite extends EntityThrowable implements IEntityAdditionalSpawnData {
	
	private int fuseTime = 20;
 
	public EntityDynamite(World worldIn)
    {
        super(worldIn);
    }
	
	protected ResourceLocation getEntityTexture(EntityDynamite entity) {
		return new ResourceLocation(References.MODID + ":textures/entities/dynamite.png");
	}
    public EntityDynamite(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntityDynamite(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }
	
	protected void onImpact(RayTraceResult result) {
		this.motionX = 0;
		this.motionY = 0;
		this.motionZ = 0;
	}
	@SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 3)
        {
            for (int i = 0; i < 8; ++i)
            {
                this.world.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            }
        }
    }
	public void onUpdate() {
	super.onUpdate();
	if(fuseTime > 0) {
		this.fuseTime --;
	}
	else if (!this.world.isRemote) {
		this.world.newExplosion(this, this.posX, this.posY, this.posZ, 2.0F, false, true);
		this.setDead();
	}
 
}
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeInt(this.fuseTime);
		buffer.writeDouble(this.motionX);
		buffer.writeDouble(this.motionY);
		buffer.writeDouble(this.motionZ);
		
	}
	public void readSpawnData(ByteBuf additionalData) {
		this.fuseTime = additionalData.readInt();
		
		this.motionX = additionalData.readDouble();
		this.motionY = additionalData.readDouble();
		this.motionZ = additionalData.readDouble();	
	}
 
}