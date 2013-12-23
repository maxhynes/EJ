package EJ.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

	public class zaniteGem extends Item {
		
		

	        public zaniteGem(int id) {
	                super(id);
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 64;
	                setCreativeTab(CreativeTabs.tabMisc);
	                setCreativeTab(EJ.core.EJ.tabEJ);
	                setUnlocalizedName(ItemInfo.zaniteGem_UNLOCALIZED_NAME);
	                
	                
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.zaniteGem_ICON);
	        }
	    		
	    		@Override
	    		@SideOnly(Side.CLIENT)
	    		public EnumRarity getRarity(ItemStack par1ItemStack){
	    		return EnumRarity.epic;
	    		} 
	    		@Override
	    		public boolean hasEffect(ItemStack par1ItemStack){
	    		return true;
	    		}
	
	}
	
