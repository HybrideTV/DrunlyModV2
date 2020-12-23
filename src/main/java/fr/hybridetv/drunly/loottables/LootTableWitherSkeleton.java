package fr.hybridetv.drunly.loottables;

import java.util.Random;

import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableWitherSkeleton {
	
		@SubscribeEvent
		public void customLootTableDrop(LivingDropsEvent event)
		{
			Random rand = new Random();
			if(event.getEntityLiving() instanceof EntityWitherSkeleton)
			{
				if(rand.nextInt(2) == 0)
				{
					event.getEntityLiving().entityDropItem(new ItemStack(Items.ARROW), 0.0f);
				}
			}
		}
	}
