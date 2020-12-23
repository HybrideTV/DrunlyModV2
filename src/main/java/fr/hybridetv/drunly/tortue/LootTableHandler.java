package fr.hybridetv.drunly.tortue;

import fr.hybridetv.drunly.References;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation TURTLE = LootTableList.register(new ResourceLocation(References.MODID + ":loot_tables/entity/turtle/turtle.json"));
}
