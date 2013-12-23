package EJ.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

	public class obsidianPlate extends Item {
		
		

	        public obsidianPlate(int id) {
	                super(id);
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 64;
	                setCreativeTab(EJ.core.EJ.tabEJ);
	                
	                setUnlocalizedName(ItemInfo.obsidianPlate_UNLOCALIZED_NAME);
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.obsidianPlate_ICON);
	}
	}