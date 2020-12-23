package fr.hybridetv.drunly.faucheuse;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelWitch - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class ModelFaucheuse extends ModelBase {
    public ModelRenderer field_78191_a;
    public ModelRenderer field_78190_c0;
    public ModelRenderer field_78190_c1;
    public ModelRenderer field_78188_e;
    public ModelRenderer field_78189_b0;
    public ModelRenderer field_78189_b1;
    public ModelRenderer field_78187_d;
    public ModelRenderer field_78191_aChild;
    public ModelRenderer field_78191_aChild_1;
    public ModelRenderer field_78191_aChild_2;
    public ModelRenderer shape18;
    public ModelRenderer shape18_1;
    public ModelRenderer field_78191_aChild_3;

    public ModelFaucheuse() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.field_78188_e = new ModelRenderer(this, 0, 22);
        this.field_78188_e.mirror = true;
        this.field_78188_e.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.field_78188_e.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78189_b0 = new ModelRenderer(this, 16, 20);
        this.field_78189_b0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78189_b0.addBox(-4.0F, 0.0F, -3.0F, 8, 12, 6, 0.0F);
        this.field_78190_c1 = new ModelRenderer(this, 44, 22);
        this.field_78190_c1.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c1.addBox(4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78190_c1, -0.41887902047863906F, 0.0F, 0.0F);
        this.field_78191_aChild_2 = new ModelRenderer(this, 0, 64);
        this.field_78191_aChild_2.setRotationPoint(-4.0F, -0.1F, 4.0F);
        this.field_78191_aChild_2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        this.setRotateAngle(field_78191_aChild_2, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_78189_b1 = new ModelRenderer(this, 0, 38);
        this.field_78189_b1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78189_b1.addBox(-4.0F, 0.0F, -3.0F, 8, 18, 6, 0.5F);
        this.field_78187_d = new ModelRenderer(this, 0, 22);
        this.field_78187_d.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.field_78187_d.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.field_78191_aChild_1 = new ModelRenderer(this, 0, 64);
        this.field_78191_aChild_1.setRotationPoint(-4.8F, 0.0F, -5.0F);
        this.field_78191_aChild_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F);
        this.setRotateAngle(field_78191_aChild_1, 0.0F, 0.0F, -1.5707963267948966F);
        this.shape18_1 = new ModelRenderer(this, 0, 0);
        this.shape18_1.setRotationPoint(-7.2F, -4.0F, -9.2F);
        this.shape18_1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(shape18_1, -0.8438666933392583F, 0.0F, 0.0F);
        this.field_78191_aChild_3 = new ModelRenderer(this, 0, 64);
        this.field_78191_aChild_3.setRotationPoint(-5.0F, -10.03125F, -5.0F);
        this.field_78191_aChild_3.addBox(0.0F, 0.0F, 0.0F, 10, 2, 10, 0.0F);
        this.field_78191_a = new ModelRenderer(this, 0, 0);
        this.field_78191_a.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78191_a.addBox(-4.0F, -10.0F, -4.0F, 8, 10, 8, 0.0F);
        this.shape18 = new ModelRenderer(this, 0, 0);
        this.shape18.setRotationPoint(-7.3F, 0.0F, -14.0F);
        this.shape18.addBox(0.0F, 0.0F, 0.0F, 2, 20, 2, 0.0F);
        this.setRotateAngle(shape18, 0.7740535232594852F, 0.0F, 0.0F);
        this.field_78191_aChild = new ModelRenderer(this, 0, 64);
        this.field_78191_aChild.setRotationPoint(3.9F, -0.1F, -5.0F);
        this.field_78191_aChild.addBox(0.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F);
        this.setRotateAngle(field_78191_aChild, 0.0F, 0.0F, -1.5707963267948966F);
        this.field_78190_c0 = new ModelRenderer(this, 44, 22);
        this.field_78190_c0.setRotationPoint(0.0F, 3.0F, -1.0F);
        this.field_78190_c0.addBox(-8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_78190_c0, -0.41887902047863906F, 0.0F, 0.0F);
        this.field_78191_a.addChild(this.field_78191_aChild_3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_78188_e.render(f5);
        this.field_78189_b0.render(f5);
        this.field_78190_c1.render(f5);
        this.field_78191_aChild_2.render(f5);
        this.field_78189_b1.render(f5);
        this.field_78187_d.render(f5);
        this.field_78191_aChild_1.render(f5);
        this.shape18_1.render(f5);
        this.field_78191_a.render(f5);
        this.shape18.render(f5);
        this.field_78191_aChild.render(f5);
        this.field_78190_c0.render(f5);
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
