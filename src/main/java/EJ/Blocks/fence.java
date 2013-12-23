package EJ.Blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class fence extends BlockFence {

	
		
		public fence(int par1, String par2Str, Material par3Material) {
		super(par1, par2Str, par3Material);
		



		setCreativeTab(EJ.core.EJ.tabEJ);
		setHardness(2F);
		setStepSound(Block.soundWoodFootstep);
		setUnlocalizedName(BlockInfo.fence_UNLOCALIZED_NAME);
		
		
	}
	
	
	public int idDropped(int par1, Random random, int par2) {
        return EJ.Blocks.Blocks.fence.blockID;
	}
	
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
                return null;
    }

}
