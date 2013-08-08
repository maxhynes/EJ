package EJ.Fluids;

import EJ.Items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Fluids {
	public static Fluid emeraldFluid;
	public static Block BlockemeraldFluid;
	
	public static void init() {
		
		emeraldFluid = new emeraldFluid();
		BlockemeraldFluid = new BlockemeraldFluid(2000);
		
		GameRegistry.registerBlock(BlockemeraldFluid, "BlockemeraldFluid");
		GameRegistry.addSmelting(Item.emerald.itemID, new ItemStack(Items.emeraldBucket), 0.3f);

		
		
	}

}

