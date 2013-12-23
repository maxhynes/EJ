package EJ.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
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



public class darkgrass extends Block {

	public darkgrass(int id) {
		super(id, Material.iron);
		
		setCreativeTab(EJ.core.EJ.tabEJ);
		setHardness(2F);
		setStepSound(Block.soundGrassFootstep);
		setUnlocalizedName(BlockInfo.blackgrass_UNLOCALIZED_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon sides, bottom, top;

	
		
	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon botIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcons;
	@SideOnly(Side.CLIENT)	
	private Icon disableIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.blackgrass_TOP);
		botIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.blackgrass_BOT);
		sideIcons = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.blackgrass_SIDE);	
	}

				
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0) {
			return botIcon;
		}else if(side == 1) {
			return topIcon;
		}else{
			int type = meta / 2;
			return sideIcons;
		}
	}
}
