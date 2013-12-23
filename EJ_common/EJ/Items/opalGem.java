package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

	public class opalGem extends Item {
		
		

	        public opalGem(int id) {
	                super(id);
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 64;
	                setCreativeTab(EJ.core.EJ.tabEJ);
	                
	                setUnlocalizedName(ItemInfo.opalGem_UNLOCALIZED_NAME);
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.opalGem_ICON);
	}
	}
