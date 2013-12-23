package EJ.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
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

public class topazOre extends Block {

	public topazOre(int id) {
		super(id, Material.rock);
		
		setCreativeTab(EJ.core.EJ.tabEJ);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.topazOre_UNLOCALIZED_NAME);
	}
	
		
	
	
	@Override
	@SideOnly(Side.CLIENT)public void registerIcons(IconRegister icon) {blockIcon = icon.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.topazOre_UNLOCALIZED_NAME);}
	
	
	public int idDropped(int par1, Random random, int par2) {
        return EJ.Items.Items.topazGem.itemID;
	}
}

	