package fr.hybridetv.drunly.bases;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class BlockFenceBase extends BlockFence {

	public BlockFenceBase(String name) {
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2);
		setResistance(2);
		setCreativeTab(Drunly.drunlytab);
	}

}