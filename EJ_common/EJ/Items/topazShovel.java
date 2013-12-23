package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
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


public class topazShovel extends ItemPickaxe {
	
	

    public topazShovel(int id, EnumToolMaterial tooltopaz ) {
            super(id, tooltopaz);
            
            
            
            // Constructor Configuration
            maxStackSize = 1;
            setCreativeTab(CreativeTabs.tabTools);
            setCreativeTab(EJ.core.EJ.tabEJ);
            setUnlocalizedName(ItemInfo.topazShovel_UNLOCALIZED_NAME);
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.topazShovel_ICON);
}
}


