package fr.hybridetv.drunly;

import java.io.File;

import fr.hybridetv.drunly.init.BiomeInit;
import fr.hybridetv.drunly.init.BlocksMod;
import fr.hybridetv.drunly.init.EntityInit;
import fr.hybridetv.drunly.init.GuiHandler;
import fr.hybridetv.drunly.init.ItemMod;
import fr.hybridetv.drunly.init.ModRecipes;
import fr.hybridetv.drunly.init.TileEntityHandler;
import fr.hybridetv.drunly.init.drunlytab;
import fr.hybridetv.drunly.proxy.ServerProxy;
import fr.hybridetv.drunly.utils.drunlyfarm;
import fr.hybridetv.drunly.utils.drunlymachinery;
import fr.hybridetv.drunly.world.WorldGenOres;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)

public class Drunly {
		
		@Instance(References.MODID)
		public static Drunly instance;
		public static File config;
		public static int loops = 1;

		@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
		
		public static ServerProxy proxy;
		
		public static final CreativeTabs drunlytab = new drunlytab("drunlytab");
		public static final CreativeTabs drunlymachinery = new drunlymachinery("drunlymachinery");
		public static final CreativeTabs drunlyfarm = new drunlyfarm("drunlyfarm");
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
			BlocksMod.init();
			ItemMod.init();
			EntityInit.registerEntities();
			GameRegistry.registerWorldGenerator(new WorldGenOres(), 3);	
			ModConfiguration.registerConfig(event);
			BiomeInit.registerBiomes();
			TileEntityHandler.registerTileEntities();
			GuiHandler.init();
			proxy.registerRender();
			NetworkRegistry.INSTANCE.registerGuiHandler(Drunly.instance, new GuiHandler());
			
			}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			proxy.register();
			ModRecipes.init();
		}
		
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			
		}
		
		@EventHandler
		public static void serverInit(FMLServerStartingEvent event)
		{
			
		}
		
		
		@SubscribeEvent
		public static void onBlockRegister(RegistryEvent.Register<Block> event)
		{
			TileEntityHandler.registerTileEntities();
		}
}