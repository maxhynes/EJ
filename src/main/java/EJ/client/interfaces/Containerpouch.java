package EJ.client.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class Containerpouch extends Container {
	
	public Containerpouch(EntityPlayer player) {
		
		
		
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}

}
