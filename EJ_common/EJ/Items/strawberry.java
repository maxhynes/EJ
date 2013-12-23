package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
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

	public class strawberry extends ItemFood {
        public strawberry(int id, int hunger, float saturation, boolean wolfFood) {
		super(id, hunger, saturation, wolfFood);
		
	
	
			
		
		

	        
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 64;
	  
					setCreativeTab(CreativeTabs.tabFood);
					setCreativeTab(EJ.core.EJ.tabEJ);
	                setUnlocalizedName(ItemInfo.strawberry_UNLOCALIZED_NAME);
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.strawberry_ICON);
	}
	}