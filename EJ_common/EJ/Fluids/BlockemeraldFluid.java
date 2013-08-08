package EJ.Fluids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
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

public class BlockemeraldFluid extends BlockFluidClassic{
	 public BlockemeraldFluid(int id){
		 super(id, Fluids.emeraldFluid, Material.water);
		 Fluids.emeraldFluid.setBlockID(id);
		 
	 }
	 
	 
	
	 @Override
	 @SideOnly(Side.CLIENT)
	 public Icon getIcon(int side, int meta){
		 return Block.waterMoving.getIcon(side, meta);
	 }
	
	 @Override
	 public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z){
		 //return 0xFF0099;
		 return 0x66FF00;
	 }
	 
	 @Override
		public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
		{
			int meta = world.getBlockMetadata(x, y, z);

			
			if (!world.isRemote)
			{
				if (entity instanceof EntityLivingBase) 
				{
					((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.regeneration.id, 30, 3));
				}

				if (entity instanceof EntityPlayer) 
				{
					if (world.rand.nextInt(150) == 0)
					{
						EntityPlayer player = (EntityPlayer)entity;

						if (player.getFoodStats().needFood())
						{
							((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.field_76443_y.id, 1));
						}
					}
				}
			}
		}
}

