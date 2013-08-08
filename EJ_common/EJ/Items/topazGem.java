package EJ.Items;

    import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
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

	public class topazGem extends Item {
		
		

	        public topazGem(int id) {
	                super(id);
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 64;
	                setCreativeTab(CreativeTabs.tabMisc);
	                setCreativeTab(EJ.core.EJ.tabEJ);
	                setUnlocalizedName(ItemInfo.topazGem_UNLOCALIZED_NAME);
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.topazGem_ICON);
	}
	}

    
       