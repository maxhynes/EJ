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


public class rubyShovel extends ItemPickaxe {
	
	

    public rubyShovel(int id, EnumToolMaterial toolruby ) {
            super(id, toolruby);
            
            
            
            // Constructor Configuration
            maxStackSize = 1;
            setCreativeTab(CreativeTabs.tabTools);
            setCreativeTab(EJ.core.EJ.tabEJ);
            setUnlocalizedName(ItemInfo.rubyShovel_UNLOCALIZED_NAME);
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.rubyShovel_ICON);
}
}

