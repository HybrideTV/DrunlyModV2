package fr.hybridetv.drunly.init;

import fr.hybridetv.drunly.References;
import fr.hybridetv.drunly.furnace.TileEntitySilverFurnace;
import fr.hybridetv.drunly.ice.TileEntityIceMachine;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySilverFurnace.class, new ResourceLocation(References.MODID + ":silver_furnace"));
		GameRegistry.registerTileEntity(TileEntityIceMachine.class, new ResourceLocation(References.MODID + ":ice_machine"));

	}
}
