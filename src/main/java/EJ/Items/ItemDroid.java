package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import EJ.entity.EntityDroid;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ItemDroid extends Item {

	public ItemDroid(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
		//setCreativeTab(EJ.core.EJ.tabEJ);
		setUnlocalizedName(ItemInfo.DROID_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DROID_ICON);
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			world.spawnEntityInWorld(new EntityDroid(world, x + 0.5, y + 1.5, z + 0.5));
			
			stack.stackSize--;
			
			return true;
		}else{
			return false;
		}
	}
		
	
}
