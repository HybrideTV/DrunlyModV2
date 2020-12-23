package fr.hybridetv.drunly.boost;

import fr.hybridetv.drunly.Drunly;
import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BoostLeggings extends ItemArmor {

	public BoostLeggings(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Drunly.drunlytab);
		
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{

		if( player.inventory.armorInventory.get(0) != null && player.inventory.armorInventory.get(1) != null && player.inventory.armorInventory.get(2) != null && player.inventory.armorInventory.get(3) != null )
		{

			ItemStack leggings = player.inventory.armorInventory.get(1);

			if( leggings.getItem() == ItemMod.boost_leggings )
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("regeneration"), 400, 1));
			}
		}
	}


}