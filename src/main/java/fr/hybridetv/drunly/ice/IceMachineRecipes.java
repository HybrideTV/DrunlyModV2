package fr.hybridetv.drunly.ice;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import fr.hybridetv.drunly.init.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IceMachineRecipes
{
	private static final IceMachineRecipes COOKING_BASE = new IceMachineRecipes();
	private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static IceMachineRecipes instance()
    {
        return COOKING_BASE;
    }
	
	private IceMachineRecipes()
	{
		this.addCookingRecipe(new ItemStack(ItemMod.citron), new ItemStack(ItemMod.citron_ice), 2.0F);
		this.addCookingRecipe(new ItemStack(ItemMod.fraise), new ItemStack(ItemMod.fraise_ice), 2.0F);
		this.addCookingRecipe(new ItemStack(ItemMod.myrtille), new ItemStack(ItemMod.myrtille_ice), 2.0F);
		this.addCookingRecipe(new ItemStack(ItemMod.kiwi), new ItemStack(ItemMod.kiwi_ice), 2.0F);
		this.addCookingRecipe(new ItemStack(ItemMod.cerise), new ItemStack(ItemMod.cerise_ice), 2.0F);
	}
	
	public void addCookingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCooking(Item.getItemFromBlock(input), stack, experience);
    }
	
	public void addCooking(Item input, ItemStack stack, float experience)
    {
        this.addCookingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }
	
	public void addCookingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCookingResult(input) != ItemStack.EMPTY) 
        { 
        	net.minecraftforge.fml.common.FMLLog.log.info("Ignored cooking recipe with conflicting input: {} = {}", input, stack); return; 
        }
        this.cookingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }
	
	public ItemStack getCookingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.cookingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getCookingList()
    {
        return this.cookingList;
    }

    public float getCookingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;
        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
