package fr.hybridetv.drunly.gui;

import fr.hybridetv.drunly.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
 
public class GuiButtonConnect extends GuiButton
{
    private static final ResourceLocation CONNECT_ICON = new ResourceLocation(References.MODID, "textures/gui/connect.png");
    private static final ResourceLocation CONNECT_HOVER_ICON = new ResourceLocation(References.MODID, "textures/gui/connect_hover.png");
 
    public  GuiButtonConnect(int buttonID, int xPos, int yPos)
    {
        super(buttonID, xPos, yPos, 200, 20, "");
    }
 
    public void playPressSound(SoundHandler soundHandlerIn)
    {
        soundHandlerIn.playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(CONNECT_HOVER_ICON);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean flag = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            
            boolean mouseHover = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            {
                mc.getTextureManager().bindTexture(CONNECT_ICON);
            }
 
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Gui.drawScaledCustomSizeModalRect(this.x, this.y, 0, 0, 128, 128, 200, 20, 128, 128);
        }
    }
}
