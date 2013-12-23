package EJ.client.interfaces;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import EJ.tileentities.TileEntityDeployer;
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
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		switch(id) {
		default:return null;
			case 0:if(entity != null && entity instanceof TileEntityDeployer) {return new ContainerDeployer(player.inventory, (TileEntityDeployer) entity);}else {return null;}
			case 1: return new Containerpouch(player);
			}
		}
	
	    
		
		
		
		
	
		
		
	

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);
		
		switch(id) {
			default:return null;
			case 0:if(entity != null && entity instanceof TileEntityDeployer) {return new GuiDeployer(player.inventory, (TileEntityDeployer) entity);}else {return null;}
			case 1: return new Guipouch(player);}}}
		

	



	
	
		
	

	
