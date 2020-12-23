package fr.hybridetv.drunly.init;

import java.util.ArrayList;
import java.util.List;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.References;
import fr.hybridetv.drunly.bases.BlockBase;
import fr.hybridetv.drunly.bases.BlockFenceBase;
import fr.hybridetv.drunly.blocks.BlockArrow;
import fr.hybridetv.drunly.blocks.BlockCannabis;
import fr.hybridetv.drunly.blocks.CaveBlock;
import fr.hybridetv.drunly.blocks.ConcreteBlock;
import fr.hybridetv.drunly.blocks.HardenedObsidian;
import fr.hybridetv.drunly.blocks.RadioactiveDirt;
import fr.hybridetv.drunly.blocks.StoneBrickBlack;
import fr.hybridetv.drunly.blocks.StoneBrickStairs;
import fr.hybridetv.drunly.blocks.slabs.BlockSlabDoubleBase;
import fr.hybridetv.drunly.blocks.slabs.BlockSlabHalfBase;
import fr.hybridetv.drunly.christmasupdate.Bambou;
import fr.hybridetv.drunly.christmasupdate.Gift;
import fr.hybridetv.drunly.christmasupdate.GoldNetherOre;
import fr.hybridetv.drunly.christmasupdate.WhiteTnt;
import fr.hybridetv.drunly.cobalt.CobaltBlock;
import fr.hybridetv.drunly.cobalt.CobaltOre;
import fr.hybridetv.drunly.drunlyk.DrunlykBlock;
import fr.hybridetv.drunly.drunlyk.DrunlykOre;
import fr.hybridetv.drunly.drunlyk.HematiteOre;
import fr.hybridetv.drunly.farm.BlockCitron;
import fr.hybridetv.drunly.farm.BlockCourgette;
import fr.hybridetv.drunly.farm.BlockErable;
import fr.hybridetv.drunly.farm.BlockFraise;
import fr.hybridetv.drunly.farm.BlockKiwi;
import fr.hybridetv.drunly.farm.BlockMyrtille;
import fr.hybridetv.drunly.farm.BlockRiz;
import fr.hybridetv.drunly.farm.BlockSalade;
import fr.hybridetv.drunly.farm.BlockTomato;
import fr.hybridetv.drunly.farm.BlockTrefle;
import fr.hybridetv.drunly.farm.GrenadeBlock;
import fr.hybridetv.drunly.furnace.SilverFurnace;
import fr.hybridetv.drunly.ice.IceMachine;
import fr.hybridetv.drunly.rubis.RubisBlock;
import fr.hybridetv.drunly.rubis.RubisOre;
import fr.hybridetv.drunly.uranium.UraniumBlock;
import fr.hybridetv.drunly.uranium.UraniumOre;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber(modid=References.MODID)

public class BlocksMod {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block hematite_ore;
	public static Block drunlyk_ore;
	public static Block rubis_ore;
	public static Block rubis_block;
	public static Block cobalt_ore;
	public static Block cobalt_block;
	public static Block cave_block;
	public static Block stonebrick_black_stairs;	
	public static Block stonebrick_black;
	public static BlockSlab stonebrick_black_slab_half;
	public static BlockSlab stonebrick_black_slab_double;
	public static Block concrete_block;
	public static BlockSlab concrete_slab_half;
	public static BlockSlab concrete_slab_double;
	public static Block fraisecrop;
	public static Block erablecrop;
	public static Block kiwicrop;
	public static Block treflecrop;
	public static Block hardened_obsidian;
	public static Block drunlyk_block;
	public static Block hematite_block;
	public static Block tomato_crop;
	public static Block quartz_fence;
	public static Block myrtille_crop;
	public static Block grenade_block;
	public static Block citron_crop;
	public static Block salade_crop;
	public static Block riz_crop;
	public static Block cerise_block;
	public static Block courgette_crop;
	public static Block quartzb;
	public static Block up_arrow;
	public static Block down_arrow;
	public static Block left_arrow;
	public static Block right_arrow;
	public static Block red_dirt;
	public static Block uranium_ore;
	public static Block uranium_block;
	public static Block radioactive_dirt;
	public static final Block SILVER_FURNACE_OFF = new SilverFurnace("silver_furnace_off", false).setCreativeTab(Drunly.drunlymachinery);
	public static final Block SILVER_FURNACE_ON = new SilverFurnace("silver_furnace_on", true);
	public static final Block ICE_MACHINE_OFF = new IceMachine("ice_machine_off", false).setCreativeTab(Drunly.drunlymachinery);
	public static final Block ICE_MACHINE_ON = new IceMachine("ice_machine_on", true);
	public static Block cannabis_crop;
	
	//CHRISTMAS UPDATE
	public static Block bambou;
	public static Block blackstone;
	public static Block crimson_planks;
	public static Block warped_planks;
	public static Block gold_nether_ore;
	public static Block white_tnt;
	public static Block gift;
	public static Block bambou_block;
	
	public static void init() 
	{
		gift = new Gift("gift", Material.CARPET);
		bambou_block = new BlockBase("bambou_block", Material.CACTUS);
		white_tnt = new WhiteTnt("white_tnt");
		gold_nether_ore = new GoldNetherOre("gold_nether_ore", Material.ROCK);
		blackstone = new BlockBase("blackstone", Material.ROCK);
		crimson_planks = new BlockBase("crimson_planks", Material.WOOD);
		warped_planks = new BlockBase("warped_planks", Material.WOOD);
		bambou = new Bambou("bambou");
		radioactive_dirt = new RadioactiveDirt("radioactive_dirt", Material.GRASS);
		uranium_block = new UraniumBlock("uranium_block", Material.ROCK);
		uranium_ore = new UraniumOre("uranium_ore", Material.ROCK);
		cannabis_crop = new BlockCannabis("cannabis_crop");
		hematite_ore = new HematiteOre("hematite_ore", Material.ROCK);
		drunlyk_ore = new DrunlykOre("drunlyk_ore", Material.ROCK);
		red_dirt = new BlockBase("red_dirt", Material.GRASS);
		quartzb = new BlockBase("quartzb", Material.ROCK);
		quartz_fence = new BlockFenceBase("quartz_fence");
		up_arrow = new BlockArrow ("up_arrow", Material.ROCK);
		down_arrow = new BlockArrow ("down_arrow", Material.ROCK);
		left_arrow = new BlockArrow ("left_arrow", Material.ROCK);
		right_arrow = new BlockArrow ("right_arrow", Material.ROCK);
		rubis_ore = new RubisOre("rubis_ore", Material.ROCK);
		rubis_block = new RubisBlock("rubis_block", Material.ROCK);
		drunlyk_block = new DrunlykBlock("drunlyk_block", Material.ROCK);
		hematite_block = new DrunlykBlock("hematite_block", Material.ROCK);
		hardened_obsidian = new HardenedObsidian("hardened_obsidian", Material .ROCK);
		grenade_block = new GrenadeBlock("grenade_block", Material.LEAVES);
		myrtille_crop = new BlockMyrtille("myrtille_crop");
		citron_crop = new BlockCitron("citron_crop");
		salade_crop = new BlockSalade("salade_crop");
		riz_crop = new BlockRiz("riz_crop");
		courgette_crop = new BlockCourgette("courgette_crop");
		tomato_crop = new BlockTomato("tomato_crop");
		fraisecrop = new BlockFraise("fraisecrop");
		erablecrop = new BlockErable("erablecrop");
		kiwicrop = new BlockKiwi("kiwicrop");
		treflecrop = new BlockTrefle("treflecrop");
		cave_block = new CaveBlock("cave_block", Material.GLASS);
		cobalt_ore = new CobaltOre("cobalt_ore", Material.ROCK);
		cobalt_block = new CobaltBlock("cobalt_block", Material.ROCK);
		stonebrick_black = new StoneBrickBlack("stonebrick_black", Material.ROCK);
		stonebrick_black_stairs = new StoneBrickStairs("stonebrick_black_stairs", stonebrick_black.getDefaultState() );
		stonebrick_black_slab_half = new BlockSlabHalfBase("stonebrick_black_slab_half", Material.ROCK, Drunly.drunlytab, BlocksMod.stonebrick_black_slab_half, BlocksMod.stonebrick_black_slab_double);
		stonebrick_black_slab_double = new BlockSlabDoubleBase("stonebrick_black_slab_double", Material.ROCK, Drunly.drunlytab, BlocksMod.stonebrick_black_slab_double);
		concrete_block = new ConcreteBlock("concrete_block", Material.ROCK);
		concrete_slab_half = new BlockSlabHalfBase("concrete_slab_half", Material.ROCK, Drunly.drunlytab, BlocksMod.concrete_slab_half, BlocksMod.concrete_slab_double);
		concrete_slab_double = new BlockSlabDoubleBase("concrete_slab_double", Material.ROCK, Drunly.drunlytab, BlocksMod.concrete_slab_double);
	}
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(bambou_block);

		event.getRegistry().registerAll(gift);
		event.getRegistry().registerAll(white_tnt);
		event.getRegistry().registerAll(crimson_planks);
		event.getRegistry().registerAll(warped_planks);
		event.getRegistry().registerAll(blackstone);
		event.getRegistry().registerAll(gold_nether_ore);
		event.getRegistry().registerAll(uranium_ore);
		event.getRegistry().registerAll(uranium_block);
		event.getRegistry().registerAll(radioactive_dirt);
		event.getRegistry().registerAll(bambou);
		event.getRegistry().registerAll(cannabis_crop);
		event.getRegistry().registerAll(drunlyk_ore);
		event.getRegistry().registerAll(hematite_ore);
		event.getRegistry().registerAll(red_dirt);
		event.getRegistry().registerAll(quartzb);
		event.getRegistry().registerAll(quartz_fence);
		event.getRegistry().registerAll(ICE_MACHINE_OFF);
		event.getRegistry().registerAll(ICE_MACHINE_ON);
		event.getRegistry().registerAll(up_arrow);
		event.getRegistry().registerAll(down_arrow);
		event.getRegistry().registerAll(left_arrow);
		event.getRegistry().registerAll(right_arrow);
		event.getRegistry().registerAll(SILVER_FURNACE_OFF);
		event.getRegistry().registerAll(SILVER_FURNACE_ON);
		event.getRegistry().registerAll(courgette_crop);
		event.getRegistry().registerAll(grenade_block);
		event.getRegistry().registerAll(myrtille_crop);
		event.getRegistry().registerAll(salade_crop);
		event.getRegistry().registerAll(riz_crop);
		event.getRegistry().registerAll(citron_crop);
		event.getRegistry().registerAll(tomato_crop);
		event.getRegistry().registerAll(hematite_block);
		event.getRegistry().registerAll(drunlyk_block);
		event.getRegistry().registerAll(rubis_ore);
		event.getRegistry().registerAll(fraisecrop);
		event.getRegistry().registerAll(erablecrop);
		event.getRegistry().registerAll(kiwicrop);
		event.getRegistry().registerAll(treflecrop);
		event.getRegistry().registerAll(rubis_block);	
		event.getRegistry().registerAll(cobalt_ore);
		event.getRegistry().registerAll(hardened_obsidian);
		event.getRegistry().registerAll(cobalt_block);
		event.getRegistry().registerAll(stonebrick_black);
		event.getRegistry().registerAll(cave_block);
		event.getRegistry().registerAll(stonebrick_black_stairs);
		event.getRegistry().registerAll(stonebrick_black_slab_half);
		event.getRegistry().registerAll(stonebrick_black_slab_double);
		event.getRegistry().registerAll(concrete_slab_half);
		event.getRegistry().registerAll(concrete_slab_double);
		event.getRegistry().registerAll(concrete_block);
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(
				new ItemBlock(bambou_block).setRegistryName(bambou_block.getRegistryName()),
				new ItemBlock(gift).setRegistryName(gift.getRegistryName()),
				new ItemBlock(white_tnt).setRegistryName(white_tnt.getRegistryName()),
				new ItemBlock(gold_nether_ore).setRegistryName(gold_nether_ore.getRegistryName()),
				new ItemBlock(bambou).setRegistryName(bambou.getRegistryName()),
				new ItemBlock(radioactive_dirt).setRegistryName(radioactive_dirt.getRegistryName()),
				new ItemBlock(cannabis_crop).setRegistryName(cannabis_crop.getRegistryName()),
				new ItemBlock(crimson_planks).setRegistryName(crimson_planks.getRegistryName()),
				new ItemBlock(warped_planks).setRegistryName(warped_planks.getRegistryName()),
				new ItemBlock(blackstone).setRegistryName(blackstone.getRegistryName()),
				new ItemBlock(uranium_ore).setRegistryName(uranium_ore.getRegistryName()),
				new ItemBlock(uranium_block).setRegistryName(uranium_block.getRegistryName()),
				new ItemBlock(drunlyk_ore).setRegistryName(drunlyk_ore.getRegistryName()),
				new ItemBlock(hematite_ore).setRegistryName(hematite_ore.getRegistryName()),
				new ItemBlock(red_dirt).setRegistryName(red_dirt.getRegistryName()),
				new ItemBlock(quartzb).setRegistryName(quartzb.getRegistryName()),
				new ItemBlock(quartz_fence).setRegistryName(quartz_fence.getRegistryName()),
				new ItemBlock(ICE_MACHINE_ON).setRegistryName(ICE_MACHINE_ON.getRegistryName()),
				new ItemBlock(ICE_MACHINE_OFF).setRegistryName(ICE_MACHINE_OFF.getRegistryName()),
				new ItemBlock(up_arrow).setRegistryName(up_arrow.getRegistryName()),
				new ItemBlock(down_arrow).setRegistryName(down_arrow.getRegistryName()),
				new ItemBlock(left_arrow).setRegistryName(left_arrow.getRegistryName()),
				new ItemBlock(right_arrow).setRegistryName(right_arrow.getRegistryName()),
				new ItemBlock(fraisecrop).setRegistryName(fraisecrop.getRegistryName()),
				new ItemBlock(SILVER_FURNACE_ON).setRegistryName(SILVER_FURNACE_ON.getRegistryName()),
				new ItemBlock(SILVER_FURNACE_OFF).setRegistryName(SILVER_FURNACE_OFF.getRegistryName()),
				new ItemBlock(hematite_block).setRegistryName(hematite_block.getRegistryName()),
				new ItemBlock(tomato_crop).setRegistryName(tomato_crop.getRegistryName()),
				new ItemBlock(citron_crop).setRegistryName(citron_crop.getRegistryName()),
				new ItemBlock(riz_crop).setRegistryName(riz_crop.getRegistryName()),
				new ItemBlock(salade_crop).setRegistryName(salade_crop.getRegistryName()),
				new ItemBlock(myrtille_crop).setRegistryName(myrtille_crop.getRegistryName()),
				new ItemBlock(grenade_block).setRegistryName(grenade_block.getRegistryName()),
				new ItemBlock(courgette_crop).setRegistryName(courgette_crop.getRegistryName()),
				new ItemBlock(drunlyk_block).setRegistryName(drunlyk_block.getRegistryName()),
				new ItemBlock(concrete_slab_half).setRegistryName(concrete_slab_half.getRegistryName()),
				new ItemBlock(concrete_slab_double).setRegistryName(concrete_slab_double.getRegistryName()),
				new ItemBlock(concrete_block).setRegistryName(concrete_block.getRegistryName()),
				new ItemBlock(hardened_obsidian).setRegistryName(hardened_obsidian.getRegistryName()),
				new ItemBlock(treflecrop).setRegistryName(treflecrop.getRegistryName()),
				new ItemBlock(kiwicrop).setRegistryName(kiwicrop.getRegistryName()),
				new ItemBlock(erablecrop).setRegistryName(erablecrop.getRegistryName()),
				new ItemBlock(rubis_ore).setRegistryName(rubis_ore.getRegistryName()),
				new ItemBlock(rubis_block).setRegistryName(rubis_block.getRegistryName()),
				new ItemBlock(cobalt_ore).setRegistryName(cobalt_ore.getRegistryName()),
				new ItemBlock(cobalt_block).setRegistryName(cobalt_block.getRegistryName()),
				new ItemBlock(cave_block).setRegistryName(cave_block.getRegistryName()),
				new ItemBlock(stonebrick_black_stairs).setRegistryName(stonebrick_black_stairs.getRegistryName()),
				new ItemBlock(stonebrick_black).setRegistryName(stonebrick_black.getRegistryName()),
				new ItemBlock(stonebrick_black_slab_half).setRegistryName(stonebrick_black_slab_half.getRegistryName()),
				new ItemBlock(stonebrick_black_slab_double).setRegistryName(stonebrick_black_slab_double.getRegistryName())
				);
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{		
		registerRender(Item.getItemFromBlock(bambou_block));

		registerRender(Item.getItemFromBlock(gift));
		registerRender(Item.getItemFromBlock(white_tnt));
		registerRender(Item.getItemFromBlock(gold_nether_ore));
		registerRender(Item.getItemFromBlock(crimson_planks));
		registerRender(Item.getItemFromBlock(blackstone));
		registerRender(Item.getItemFromBlock(warped_planks));
		registerRender(Item.getItemFromBlock(radioactive_dirt));
		registerRender(Item.getItemFromBlock(bambou));
		registerRender(Item.getItemFromBlock(cannabis_crop));
		registerRender(Item.getItemFromBlock(uranium_ore));
		registerRender(Item.getItemFromBlock(uranium_block));
		registerRender(Item.getItemFromBlock(drunlyk_ore));
		registerRender(Item.getItemFromBlock(hematite_ore));
		registerRender(Item.getItemFromBlock(quartzb));
		registerRender(Item.getItemFromBlock(red_dirt));
		registerRender(Item.getItemFromBlock(quartz_fence));
		registerRender(Item.getItemFromBlock(ICE_MACHINE_OFF));
	    registerRender(Item.getItemFromBlock(ICE_MACHINE_ON));
		registerRender(Item.getItemFromBlock(left_arrow));
		registerRender(Item.getItemFromBlock(right_arrow));
		registerRender(Item.getItemFromBlock(up_arrow));
		registerRender(Item.getItemFromBlock(down_arrow));
		registerRender(Item.getItemFromBlock(SILVER_FURNACE_OFF));
		registerRender(Item.getItemFromBlock(SILVER_FURNACE_ON));
		registerRender(Item.getItemFromBlock(courgette_crop));
		registerRender(Item.getItemFromBlock(citron_crop));
		registerRender(Item.getItemFromBlock(riz_crop));
		registerRender(Item.getItemFromBlock(myrtille_crop));
		registerRender(Item.getItemFromBlock(salade_crop));
		registerRender(Item.getItemFromBlock(grenade_block));
		registerRender(Item.getItemFromBlock(hematite_block));
	    registerRender(Item.getItemFromBlock(drunlyk_block));
		registerRender(Item.getItemFromBlock(rubis_ore));
		registerRender(Item.getItemFromBlock(treflecrop));
		registerRender(Item.getItemFromBlock(concrete_block));
		registerRender(Item.getItemFromBlock(concrete_slab_half));
		registerRender(Item.getItemFromBlock(concrete_slab_double));
		registerRender(Item.getItemFromBlock(tomato_crop));
		registerRender(Item.getItemFromBlock(fraisecrop));
		registerRender(Item.getItemFromBlock(kiwicrop));
		registerRender(Item.getItemFromBlock(erablecrop));
		registerRender(Item.getItemFromBlock(rubis_block));
		registerRender(Item.getItemFromBlock(cobalt_block));
		registerRender(Item.getItemFromBlock(cobalt_ore));
		registerRender(Item.getItemFromBlock(cave_block));
		registerRender(Item.getItemFromBlock(stonebrick_black));
		registerRender(Item.getItemFromBlock(stonebrick_black_stairs));
		registerRender(Item.getItemFromBlock(stonebrick_black_slab_half));
		registerRender(Item.getItemFromBlock(stonebrick_black_slab_double));
		registerRender(Item.getItemFromBlock(hardened_obsidian));
	}

	private static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "Inventory"));
	}
}
