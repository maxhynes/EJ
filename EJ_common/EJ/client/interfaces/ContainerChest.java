package EJ.client.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import EJ.tileentities.TileEntityChest;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ContainerChest extends Container {

	private TileEntityChest chest;
	
	public ContainerChest(InventoryPlayer invPlayer, TileEntityChest chest) {
		this.chest = chest;
		
		for (int x = 0; x < 9; x++) {
			addSlotToContainer(new Slot(invPlayer, x, 8 + 18 * x, 130));
		}
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++) {
				addSlotToContainer(new Slot(invPlayer, x + y * 9 + 9, 8 + 18 * x, 72 + y * 18));
			}
		}
		
		for (int x = 0; x < 3; x++) {
			addSlotToContainer(new Slot(chest, x, 8 + 18 * x, 17));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return chest.isUseableByPlayer(entityplayer);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}

}
