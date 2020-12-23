package fr.hybridetv.drunly.init;
import fr.hybridetv.drunly.ModConfiguration;
import fr.hybridetv.drunly.furnace.ContainerSilverFurnace;
import fr.hybridetv.drunly.furnace.GuiSilverFurnace;
import fr.hybridetv.drunly.furnace.TileEntitySilverFurnace;
import fr.hybridetv.drunly.ice.ContainerIceMachine;
import fr.hybridetv.drunly.ice.GuiIceMachine;
import fr.hybridetv.drunly.ice.TileEntityIceMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static void init() {
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ModConfiguration.GUI_SILVER_FURNACE)
		{
			return new ContainerSilverFurnace(player.inventory, (TileEntitySilverFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == ModConfiguration.GUI_ICE_MACHINE)
		{
			return new ContainerIceMachine(player.inventory, (TileEntityIceMachine)world.getTileEntity(new BlockPos(x, y, z)));
		}
		
		return null;
		}
	

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == ModConfiguration.GUI_SILVER_FURNACE)
		{
			return new GuiSilverFurnace(player.inventory, (TileEntitySilverFurnace)world.getTileEntity(new BlockPos(x, y, z)));
		}
		if(ID == ModConfiguration.GUI_ICE_MACHINE)
		{
			return new GuiIceMachine(player.inventory, (TileEntityIceMachine)world.getTileEntity(new BlockPos(x, y, z)));
		}

		return null;
	}
}