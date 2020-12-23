package fr.hybridetv.drunly.proxy;

import org.lwjgl.opengl.Display;

import fr.hybridetv.drunly.gui.GuiCustomIngameMenu;
import fr.hybridetv.drunly.gui.GuiCustomMainMenu;
import fr.hybridetv.drunly.init.RenderHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends ServerProxy {
	public ClientProxy()
	{
	MinecraftForge.EVENT_BUS.register(this);
	
	}
	
	public void register()
	{
		Display.setTitle("Connecte en tant que " + Minecraft.getMinecraft().getSession().getUsername() + " - Drunly V2.1");
	}

    public void registerRender() {
		RenderHandler.registerEntityRenders();
		RenderHandler.registerCustomMeshesAndStates();
    }  

	@SubscribeEvent
    public void onOpenGui(GuiOpenEvent event)
    {
        if(event.getGui() != null && event.getGui().getClass() == GuiMainMenu.class)
        {
            event.setGui(new GuiCustomMainMenu());
        }
        
        
        if(event.getGui() != null && event.getGui().getClass() == GuiIngameMenu.class)
        {
            event.setGui(new GuiCustomIngameMenu());
        }
        
    }
	
	
    /////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////    F3      ////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderPre(RenderGameOverlayEvent.Pre event) {
		
		{
		if(event.getType() == RenderGameOverlayEvent.ElementType.DEBUG)
		{
		Minecraft mc = Minecraft.getMinecraft();
		event.setCanceled(true);
		 
	    //COORDS
		Entity entity = mc.getRenderViewEntity();
		EnumFacing enumfacing = entity.getHorizontalFacing();
		
		BlockPos blockpos = new BlockPos(mc.getRenderViewEntity().posX, mc.getRenderViewEntity().getEntityBoundingBox().minY, mc.getRenderViewEntity().posZ);
		Chunk chunk = mc.world.getChunkFromBlockCoords(blockpos);
		    
		    
	    int x = (int) mc.player.posX;
	    int y = (int) mc.player.posY;
	    int z = (int) mc.player.posZ;
	    long i = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long k = Runtime.getRuntime().freeMemory();
        long l = j - k;
        
	    String var2 = TextFormatting.LIGHT_PURPLE + "Drunly V2 > " + TextFormatting.YELLOW + Minecraft.getMinecraft().getSession().getUsername();
	    String var3 = "    ";
	    String var4 = TextFormatting.BOLD + "X : " + x;
	    String var5 = TextFormatting.BOLD + "Y : " + y;
	    String var6 = TextFormatting.BOLD + "Z : " + z;
	    String var7 = TextFormatting.BOLD + "Biome : " +chunk.getBiome(blockpos, mc.world.getBiomeProvider()).getBiomeName();
	    @SuppressWarnings("static-access")
		String varfps = TextFormatting.BOLD + "FPS : " + Minecraft.getMinecraft().getDebugFPS();
	    String vardir = TextFormatting.BOLD + "Direction : " + entity.getHorizontalFacing();
	    
	    this.drawString(mc.fontRenderer, var2, 10, 10, 16777215);//DRUNLY + PSEUDO
	    this.drawString(mc.fontRenderer, var3, 10, 15, 16777215);//ESPACE
	    this.drawString(mc.fontRenderer, varfps, 10, 25, 16777215);//FPS
	    this.drawString(mc.fontRenderer, vardir, 10, 35, 16777215);//DIRECTION
	    this.drawString(mc.fontRenderer, var3, 10, 45, 16777215);//ESPACE
	    this.drawString(mc.fontRenderer, var4, 10, 55, 16777215);//X
	    this.drawString(mc.fontRenderer, var5, 10, 65, 16777215);//Y
	    this.drawString(mc.fontRenderer, var6, 10, 75, 16777215);//Z
	    this.drawString(mc.fontRenderer, var7, 10, 85, 16777215);//BIOME
		}
		}
		}
		 
		@SideOnly(Side.CLIENT)
		   public void drawString(FontRenderer fontRenderer, String str, int x, int y, int color)
		   {
		       fontRenderer.drawStringWithShadow(str, x, y, color);
	}
	
	

}
