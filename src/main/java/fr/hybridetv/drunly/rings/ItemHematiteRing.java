package fr.hybridetv.drunly.rings;

import fr.hybridetv.drunly.Drunly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemHematiteRing extends Item {
	public ItemHematiteRing(String name)
	{
        setMaxStackSize(1);
        setMaxDamage(1600);
        setUnlocalizedName(name); 
        setCreativeTab(Drunly.drunlytab); 
		setRegistryName(name);
    }
	
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if ((entity instanceof EntityPlayer)) { 
            EntityPlayer player = (EntityPlayer) entity;
            for (int i = 0; i < 4; i++) { 
                                ItemStack armor = player.inventory.armorInventory.get(i);
                if ((armor != null) && (armor.getItemDamage() > 0) && (stack.getItemDamage() < stack.getMaxDamage())) { 
                    stack.setItemDamage(stack.getItemDamage() + 1); 
                    armor.setItemDamage(armor.getItemDamage() - 1);
                }
            }
        }
    }
}
