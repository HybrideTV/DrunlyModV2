package fr.hybridetv.drunly.drunlyk;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class DrunlykBoots extends ItemArmor {
	
	public DrunlykBoots (String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}

}
