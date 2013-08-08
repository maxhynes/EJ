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


public class opalHoe extends ItemHoe {
	
	

    public opalHoe(int id, EnumToolMaterial toolopal ) {
            super(id, toolopal);
            
            
            
            // Constructor Configuration
            maxStackSize = 1;
            setCreativeTab(EJ.core.EJ.tabEJ);
            setCreativeTab(CreativeTabs.tabTools);
            setUnlocalizedName(ItemInfo.opalHoe_UNLOCALIZED_NAME);
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.opalHoe_ICON);
}
}