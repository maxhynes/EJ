package EJ.client.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import EJ.tileentities.TileEntityChest;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(EJ.core.EJ.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case 0:
				TileEntity te = world.getBlockTileEntity(x, y, z);
				if (te != null && te instanceof TileEntityChest) {
					return new ContainerChest(player.inventory, (TileEntityChest)te);
				}
				break;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
			case 0:
				TileEntity te = world.getBlockTileEntity(x, y, z);
				if (te != null && te instanceof TileEntityChest) {
					return new GuiChest(player.inventory, (TileEntityChest)te);
				}
			
				break;
		}


		return null;
	}

}
