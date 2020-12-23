package fr.hybridetv.drunly.gui;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GLContext;

import com.google.common.collect.Lists;
import fr.hybridetv.drunly.References;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.client.FMLClientHandler;
 

public class GuiCustomMainMenu extends GuiScreen {
	
	
	  private static final Logger LOGGER = LogManager.getLogger();
	    private static final Random RANDOM = new Random();
	    private final float minceraftRoll;
	    private String splashText;
	    private GuiButton buttonResetDemo;
	    private float panoramaTimer;
	    private DynamicTexture viewportTexture;
	    private final Object threadLock = new Object();
	    public static final String MORE_INFO_TEXT = "Please click " + TextFormatting.UNDERLINE + "here" + TextFormatting.RESET + " for more information.";
	    private int openGLWarning2Width;
	    private int openGLWarning1Width;
	    private int openGLWarningX1;    
	    private int openGLWarningY1;
	    private int openGLWarningX2;
	    private int openGLWarningY2;
	    private String openGLWarning1;
	    private String openGLWarning2;
	    private String openGLWarningLink;
	    private static final ResourceLocation SPLASH_TEXTS = new ResourceLocation(References.MODID + ":texts/splashes.txt");
	    private static final ResourceLocation MINECRAFT_TITLE_TEXTURES = new ResourceLocation(References.MODID + ":textures/gui/title/minecraft.png");
	    private static final ResourceLocation field_194400_H = new ResourceLocation(References.MODID + ":textures/gui/title/edition.png");
	    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(References.MODID, "textures/gui/background.png");
	    private static final ResourceLocation DRUNLY_TITLE = new ResourceLocation(References.MODID, "textures/gui/drunly.png");
	    private static final ResourceLocation[] TITLE_PANORAMA_PATHS = new ResourceLocation[] {new ResourceLocation(References.MODID + ":textures/gui/title/background/panorama_0.png"), new ResourceLocation(References.MODID +":textures/gui/title/background/panorama_1.png"), new ResourceLocation(References.MODID +":textures:textures/gui/title/background/panorama_2.png"), new ResourceLocation(References.MODID +"::textures:textures/gui/title/background/panorama_3.png"), new ResourceLocation(References.MODID +":textures:textures/gui/title/background/panorama_4.png"),  new ResourceLocation(References.MODID +"::textures:textures/gui/title/background/panorama_5.png")};
	    private ResourceLocation backgroundTexture;
	    private int widthCopyright;
	    private int widthCopyrightRest;

	    public GuiCustomMainMenu()
	    {
	    	FMLClientHandler.instance().setupServerList();
	    	GlStateManager.enableAlpha();

	        this.openGLWarning2 = MORE_INFO_TEXT;
	        this.splashText = "Bienvenue sur Drunly V2 !";
	        IResource iresource = null;

	        try
	        {
	            List<String> list = Lists.<String>newArrayList();
	            iresource = Minecraft.getMinecraft().getResourceManager().getResource(SPLASH_TEXTS);
	            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(iresource.getInputStream(), StandardCharsets.UTF_8));
	            String s;
	            while ((s = bufferedreader.readLine()) != null)
	            {
	                s = s.trim();

	                if (!s.isEmpty())
	                {
	                    list.add(s);
	                }
	            }
	            if (!list.isEmpty())
	            {
	                while (true)
	                {
	                    this.splashText = list.get(RANDOM.nextInt(list.size()));

	                    if (this.splashText.hashCode() != 125780783)
	                    {
	                        break;
	                    }
	                }
	            }
	        }
	        catch (IOException var8)
	        {
	            ;
	        }
	        finally
	        {
	            IOUtils.closeQuietly((Closeable)iresource);
	        }
	        this.minceraftRoll = RANDOM.nextFloat();
	        this.openGLWarning1 = "";
	        if (!GLContext.getCapabilities().OpenGL20 && !OpenGlHelper.areShadersSupported())
	        {
	            this.openGLWarning1 = I18n.format("title.oldgl1");
	            this.openGLWarning2 = I18n.format("title.oldgl2");
	            this.openGLWarningLink = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
	        }
	    }

	    public void updateScreen()
	    {
	      
	    }

	    public boolean doesGuiPauseGame()
	    {
	        return false;
	    }
	    protected void keyTyped(char typedChar, int keyCode) throws IOException
	    {
	    }
	    public void initGui()
	    {
	        this.viewportTexture = new DynamicTexture(256, 256);
	        this.backgroundTexture = this.mc.getTextureManager().getDynamicTextureLocation("background", this.viewportTexture);
	        this.widthCopyright = this.fontRenderer.getStringWidth("Copyright Mojang & Drunly V2");
	        this.widthCopyrightRest = this.width - this.widthCopyright - 2;
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(new Date());

	        if (calendar.get(2) + 1 == 12 && calendar.get(5) == 24)
	        {
	            this.splashText = "Joyeux noel!";
	        }
	        else if (calendar.get(2) + 1 == 1 && calendar.get(5) == 1)
	        {
	            this.splashText = "Bonne annee!";
	        }
	        else if (calendar.get(2) + 1 == 10 && calendar.get(5) == 31)
	        {
	            this.splashText = "OOoooOOOoooo! Spooky!";
	        }

	        int i = 24;
	        int j = this.height / 4 + 48;

	        
	  
	        {
	            this.addSingleplayerMultiplayerButtons(j, 24);
	        }

	        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, j + 50 + 12, 98, 20, I18n.format("menu.options")));
	        this.buttonList.add(new GuiButton(4, this.width / 2 + 2, j + 50 + 12, 98, 20, I18n.format("menu.quit")));

	        synchronized (this.threadLock)
	        {
	            this.openGLWarning1Width = this.fontRenderer.getStringWidth(this.openGLWarning1);
	            this.openGLWarning2Width = this.fontRenderer.getStringWidth(this.openGLWarning2);
	            int k = Math.max(this.openGLWarning1Width, this.openGLWarning2Width);
	            this.openGLWarningX1 = (this.width - k) / 2;
	            this.openGLWarningY1 = (this.buttonList.get(0)).y - 24;
	            this.openGLWarningX2 = this.openGLWarningX1 + k;
	            this.openGLWarningY2 = this.openGLWarningY1 + 24;
	        }

	    }
	     	private void addSingleplayerMultiplayerButtons(int yPos, int yInterval)
	    {
	     		//SUPPRIMER LE BOUTON SOLO LORS DE L'EXPORT !!!!!!//
	       this.buttonList.add(new GuiButton(1, this.width / 2 - 150, yPos, I18n.format("menu.singleplayer")));
	            //SUPPRIMER LE BOUTON SOLO LORS DE L'EXPORT !!!!!!//
	        
	        this.buttonList.add(new GuiButtonConnect(22, this.width / 2 - 100, yPos - 20 * 1));

	       
	    }

	    protected void actionPerformed(GuiButton button) throws IOException
	    {
	        if (button.id == 0)
	        {
	            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
	        }

	        if (button.id == 1)
	        {
	            this.mc.displayGuiScreen(new GuiWorldSelection(this));
	        }

	        if (button.id == 2)
	        {
	            this.mc.displayGuiScreen(new GuiMultiplayer(this));
	        }

	        if(button.id == 22)
	        {
	            FMLClientHandler.instance().connectToServer(this, new ServerData("serveur", "185.142.55.50:25565", false));

	        }

	        if (button.id == 4)
	        {
	            this.mc.shutdown();
	        }
	    } 
	    public void drawScreen(int mouseX, int mouseY, float partialTicks)
	    {
	    	mc.getTextureManager().bindTexture(BACKGROUND_TEXTURE);
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	        Gui.drawScaledCustomSizeModalRect(0, 0, 0, 0, 1, 1, this.width, this.height, 1, 1);
	        GlStateManager.enableAlpha();
	        this.mc.getTextureManager().bindTexture(MINECRAFT_TITLE_TEXTURES);
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);


	        this.mc.getTextureManager().bindTexture(DRUNLY_TITLE);
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	        GlStateManager.enableBlend();
	        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
	        Gui.drawScaledCustomSizeModalRect(this.width / 2 - 150, 25, 0, 0, 1, 1, 300, 60, 1, 1);
	        GlStateManager.disableBlend();

	        this.drawString(this.fontRenderer, "Copyright Mojang AB & Drunly V2", this.widthCopyrightRest, this.height - 10, -1);
	        if (mouseX > this.widthCopyrightRest && mouseX < this.widthCopyrightRest + this.widthCopyright && mouseY > this.height - 10 && mouseY < this.height && Mouse.isInsideWindow())
	        {
	            drawRect(this.widthCopyrightRest, this.height - 1, this.widthCopyrightRest + this.widthCopyright, this.height, -1);
	        }

	        if (this.openGLWarning1 != null && !this.openGLWarning1.isEmpty())
	        {
	            drawRect(this.openGLWarningX1 - 2, this.openGLWarningY1 - 2, this.openGLWarningX2 + 2, this.openGLWarningY2 - 1, 1428160512);
	            this.drawString(this.fontRenderer, this.openGLWarning1, this.openGLWarningX1, this.openGLWarningY1, -1);
	            this.drawString(this.fontRenderer, this.openGLWarning2, (this.width - this.openGLWarning2Width) / 2, (this.buttonList.get(0)).y - 12, -1);
	        }

	        super.drawScreen(mouseX, mouseY, partialTicks);
	       
	    }   
}

