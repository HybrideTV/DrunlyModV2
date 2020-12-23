package fr.hybridetv.drunly.licorn;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelLicorn extends ModelBase {
    public ModelRenderer field_110705_d;
    public ModelRenderer field_110703_f;
    public ModelRenderer field_110709_a;
    public ModelRenderer field_110706_e;
    public ModelRenderer field_110704_g;
    public ModelRenderer field_110690_C;
    public ModelRenderer field_110719_v;
    public ModelRenderer field_110718_w;
    public ModelRenderer field_110688_A;
    public ModelRenderer field_110684_D;
    public ModelRenderer field_110689_B;
    public ModelRenderer field_110685_E;
    public ModelRenderer field_110715_k;
    public ModelRenderer field_110713_m;
    public ModelRenderer field_110711_o;
    public ModelRenderer field_110716_h;
    public ModelRenderer field_110714_j;
    public ModelRenderer field_110712_l;
    public ModelRenderer field_110710_n;
    public ModelRenderer field_110722_x;
    public ModelRenderer field_110721_y;
    public ModelRenderer field_110720_z;
    public ModelRenderer field_110686_F;
    public ModelRenderer shape41;
    public ModelRenderer field_110709_aChild;
    public ModelRenderer field_110709_aChild_1;

    public ModelLicorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.field_110711_o = new ModelRenderer(this, 78, 29);
        this.field_110711_o.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.field_110711_o.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.field_110688_A = new ModelRenderer(this, 44, 29);
        this.field_110688_A.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.field_110688_A.addBox(-1.899999976158142F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.field_110710_n = new ModelRenderer(this, 24, 3);
        this.field_110710_n.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.field_110710_n.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(field_110710_n, -1.570796251296997F, 0.0F, 0.0F);
        this.field_110712_l = new ModelRenderer(this, 44, 0);
        this.field_110712_l.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.field_110712_l.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(field_110712_l, -1.3089969158172607F, 0.0F, 0.0F);
        this.field_110719_v = new ModelRenderer(this, 78, 43);
        this.field_110719_v.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.field_110719_v.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.shape41 = new ModelRenderer(this, 0, 0);
        this.shape41.setRotationPoint(-0.4F, -7.0F, -20.0F);
        this.shape41.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(shape41, 0.45378560551852565F, 0.0F, 0.0F);
        this.field_110703_f = new ModelRenderer(this, 0, 12);
        this.field_110703_f.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110703_f.addBox(-2.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(field_110703_f, 0.5235987901687622F, 0.0F, 0.2617993950843811F);
        this.field_110690_C = new ModelRenderer(this, 44, 51);
        this.field_110690_C.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.field_110690_C.addBox(-2.4000000953674316F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.field_110721_y = new ModelRenderer(this, 96, 43);
        this.field_110721_y.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.field_110721_y.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.field_110709_aChild_1 = new ModelRenderer(this, 24, 27);
        this.field_110709_aChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_110709_aChild_1.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.field_110722_x = new ModelRenderer(this, 96, 29);
        this.field_110722_x.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.field_110722_x.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.field_110685_E = new ModelRenderer(this, 60, 41);
        this.field_110685_E.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.field_110685_E.addBox(-1.100000023841858F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.field_110718_w = new ModelRenderer(this, 78, 51);
        this.field_110718_w.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.field_110718_w.addBox(-2.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.field_110713_m = new ModelRenderer(this, 38, 7);
        this.field_110713_m.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.field_110713_m.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(field_110713_m, -1.3089969158172607F, 0.0F, 0.0F);
        this.field_110709_aChild = new ModelRenderer(this, 24, 18);
        this.field_110709_aChild.setRotationPoint(0.0F, 0.019999999552965164F, 0.019999999552965164F);
        this.field_110709_aChild.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.field_110706_e = new ModelRenderer(this, 0, 0);
        this.field_110706_e.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110706_e.addBox(-2.450000047683716F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(field_110706_e, 0.5235987901687622F, 0.0F, 0.0F);
        this.field_110720_z = new ModelRenderer(this, 96, 51);
        this.field_110720_z.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.field_110720_z.addBox(-1.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.field_110716_h = new ModelRenderer(this, 0, 12);
        this.field_110716_h.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110716_h.addBox(-2.049999952316284F, -9.800000190734863F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(field_110716_h, 0.5235987901687622F, 0.0F, 0.0F);
        this.field_110686_F = new ModelRenderer(this, 60, 51);
        this.field_110686_F.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.field_110686_F.addBox(-1.600000023841858F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.field_110705_d = new ModelRenderer(this, 0, 0);
        this.field_110705_d.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110705_d.addBox(0.44999998807907104F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(field_110705_d, 0.5235987901687622F, 0.0F, 0.0F);
        this.field_110689_B = new ModelRenderer(this, 44, 41);
        this.field_110689_B.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.field_110689_B.addBox(-1.899999976158142F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.field_110684_D = new ModelRenderer(this, 60, 29);
        this.field_110684_D.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.field_110684_D.addBox(-1.100000023841858F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.field_110709_a = new ModelRenderer(this, 0, 0);
        this.field_110709_a.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110709_a.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(field_110709_a, 0.5235987901687622F, 0.0F, 0.0F);
        this.field_110715_k = new ModelRenderer(this, 0, 34);
        this.field_110715_k.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.field_110715_k.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.field_110704_g = new ModelRenderer(this, 0, 12);
        this.field_110704_g.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110704_g.addBox(0.0F, -16.0F, 4.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(field_110704_g, 0.5235987901687622F, 0.0F, -0.2617993950843811F);
        this.field_110714_j = new ModelRenderer(this, 58, 0);
        this.field_110714_j.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.field_110714_j.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(field_110714_j, 0.5235987901687622F, 0.0F, 0.0F);
        this.field_110709_a.addChild(this.field_110709_aChild_1);
        this.field_110709_a.addChild(this.field_110709_aChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_110711_o.render(f5);
        this.field_110688_A.render(f5);
        this.field_110710_n.render(f5);
        this.field_110712_l.render(f5);
        this.field_110719_v.render(f5);
        this.shape41.render(f5);
        this.field_110703_f.render(f5);
        this.field_110690_C.render(f5);
        this.field_110721_y.render(f5);
        this.field_110722_x.render(f5);
        this.field_110685_E.render(f5);
        this.field_110718_w.render(f5);
        this.field_110713_m.render(f5);
        this.field_110706_e.render(f5);
        this.field_110720_z.render(f5);
        this.field_110716_h.render(f5);
        this.field_110686_F.render(f5);
        this.field_110705_d.render(f5);
        this.field_110689_B.render(f5);
        this.field_110684_D.render(f5);
        this.field_110709_a.render(f5);
        this.field_110715_k.render(f5);
        this.field_110704_g.render(f5);
        this.field_110714_j.render(f5);
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
