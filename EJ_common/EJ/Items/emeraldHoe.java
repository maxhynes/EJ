package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
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


public class emeraldHoe extends ItemHoe {
	
	

    public emeraldHoe(int id, EnumToolMaterial toolemerald ) {
            super(id, toolemerald);
            
            
            
            // Constructor Configuration
            maxStackSize = 1;
            setCreativeTab(CreativeTabs.tabTools);
            setCreativeTab(EJ.core.EJ.tabEJ);
            setUnlocalizedName(ItemInfo.emeraldHoe_UNLOCALIZED_NAME);
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.emeraldHoe_ICON);
}
}

