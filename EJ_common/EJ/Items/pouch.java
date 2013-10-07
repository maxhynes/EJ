package EJ.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
* Explorer's Journey
* 
* Explorer's Journey
* 
* @author Brenwwe
* @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
* 
*/

public class pouch extends Item {
	
	

        public pouch(int id) {
                super(id);
                
                
                
                // Constructor Configuration
                maxStackSize = 1;
                setCreativeTab(CreativeTabs.tabMisc);
                setCreativeTab(EJ.core.EJ.tabEJ);
                setUnlocalizedName(ItemInfo.pouch_UNLOCALIZED_NAME);
        }
        @Override
    	@SideOnly(Side.CLIENT)
    	public void registerIcons(IconRegister register) {
    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.topazGem_ICON);
}
        
        @Override
        public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) 
        {
        	
        	return itemStack;

            
        }
}
            
        


