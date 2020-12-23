package fr.hybridetv.drunly.serpent;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Serpent - HybrideTV
 * Created using Tabula 7.0.1
 */
public class ModelSerpent extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape1_1;

    public ModelSerpent() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1_1 = new ModelRenderer(this, 0, 0);
        this.shape1_1.setRotationPoint(0.0F, 20.0F, -1.3F);
        this.shape1_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 22.9F, 0.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 2, 30, 2, 0.0F);
        this.setRotateAngle(shape1, 1.5707963267948966F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1_1.render(f5);
        this.shape1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
