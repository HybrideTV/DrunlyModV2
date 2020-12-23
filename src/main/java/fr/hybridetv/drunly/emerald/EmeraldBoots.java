package fr.hybridetv.drunly.emerald;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EmeraldBoots extends ItemArmor {
	public EmeraldBoots (String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}

	
	 public boolean getIsRepairable(ItemStack input, ItemStack repair)
	    {
	        if(repair.getItem() == Items.EMERALD)
	        {
	            return true;
	        }
	        return false;
	    }
}