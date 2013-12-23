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


public class rubyPickaxe extends ItemPickaxe {
	
	

    public rubyPickaxe(int id, EnumToolMaterial toolruby ) {
            super(id, toolruby);
            
            
            
            // Constructor Configuration
            maxStackSize = 1;
            setCreativeTab(CreativeTabs.tabTools);
            setUnlocalizedName(ItemInfo.rubyPickaxe_UNLOCALIZED_NAME);
            setCreativeTab(EJ.core.EJ.tabEJ);
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.rubyPickaxe_ICON);
}
}

