package EJ.client.interfaces;

import EJ.tileentities.TileEntityDeployer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerDeployer extends Container {
	private TileEntityDeployer deployer;
	
	public ContainerDeployer(InventoryPlayer invPlayer, TileEntityDeployer entity) {
		this.deployer = entity;
		
		
		}
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return deployer.isUseableByPlayer(player);
	}

}
