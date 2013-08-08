package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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

public class topazChestplate extends ItemArmor {

	public topazChestplate(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
		// Constructor Configuration
        maxStackSize = 1;
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(ItemInfo.topazChestplate_UNLOCALIZED_NAME);
		
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.topazChestplate_ICON);
}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return "ej:textures/models/armor/TOPAZ_1";
	}
}

