package EJ.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
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

public class rubyTorch extends BlockTorch {

	public rubyTorch(int par1) {
		super(par1);
        this.setTickRandomly(true);
		
		setCreativeTab(CreativeTabs.tabDecorations);
		setHardness(2F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.torch_UNLOCALIZED_NAME);
	}
	
		
	
	
	@Override
	@SideOnly(Side.CLIENT)public void registerIcons(IconRegister icon) {blockIcon = icon.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.torch_UNLOCALIZED_NAME);}
	
	
	public int idDropped(int par1, Random random, int par2) {
        return EJ.Blocks.Blocks.rubyTorch.blockID;
}

	}

