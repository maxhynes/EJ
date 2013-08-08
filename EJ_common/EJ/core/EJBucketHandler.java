package EJ.core;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import EJ.Fluids.Fluids;
import EJ.Items.Items;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class EJBucketHandler {

	 @ForgeSubscribe
	 public void FillBucket(FillBucketEvent event) {

		 ItemStack result = fillCustomBucket(event.world, event.target);

		 if (result == null)
			 return;

		 event.result = result;
		 event.setResult(Result.ALLOW);
	 }

	 public ItemStack fillCustomBucket(World world, MovingObjectPosition pos) {
		 int id = world.getBlockId(pos.blockX, pos.blockY, pos.blockZ);

		 if ( id == Fluids.BlockemeraldFluid.blockID ) {
		 
			 if ( world.getBlockMetadata( pos.blockX, pos.blockY, pos.blockZ ) == 0 ) { // Check that it is a source block
			
				 world.setBlock( pos.blockX, pos.blockY, pos.blockZ, 0 ); // Remove the fluid block	 
				 
				 return new ItemStack( Items.emeraldBucket ); // Return the filled bucked item here.
			 }
			 
		 }
		 return null;
	 }
}
				 




