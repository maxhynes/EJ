package EJ.Fluids;
import EJ.Items.ItemInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.ItemFluidContainer;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class emeraldFluidBucket extends ItemFluidContainer{
	 int isFull;
	 public emeraldFluidBucket(int id){
		 super(id);
		 //func_111206_d("ej:bucketEmerald");
		 setTextureName("ej:bucketEmerald");
		 isFull = 2000;
		 setCreativeTab(EJ.core.EJ.tabEJ);
		 
		 
	 }
	 @Override
	 public ItemStack onItemRightClick(ItemStack item, World world,
			 EntityPlayer player) {
		 // TODO Auto-generated method stub
		 MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, true);

		 if (movingobjectposition == null)
		 {
		 return item;
		 }
		 else
		 {
		 FillBucketEvent event = new FillBucketEvent(player, item, world, movingobjectposition);
		 if (MinecraftForge.EVENT_BUS.post(event))
		 {
		 return item;
		 }

		 if (event.getResult() == Event.Result.ALLOW)
		 {
		 if (player.capabilities.isCreativeMode)
		 {
		 return item;
		 }

		 if (--item.stackSize <= 0)
		 {
		 return event.result;
		 }

		 if (!player.inventory.addItemStackToInventory(event.result))
		 {
		 player.dropPlayerItem(event.result);
		 }

		 return item;
		 }

		 if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
		 {
		 int x = movingobjectposition.blockX;
		 int y = movingobjectposition.blockY;
		 int z = movingobjectposition.blockZ;

		 if (!world.canMineBlock(player, x, y, z))
		 {
		 return item;
		 }


		 if (movingobjectposition.sideHit == 0)
		 {
		 --y;
		 }

		 if (movingobjectposition.sideHit == 1)
		 {
		 ++y;
		 }

		 if (movingobjectposition.sideHit == 2)
		 {
		 --z;
		 }

		 if (movingobjectposition.sideHit == 3)
		 {
		 ++z;
		 }

		 if (movingobjectposition.sideHit == 4)
		 {
		 --x;
		 }

		 if (movingobjectposition.sideHit == 5)
		 {
		 ++x;
		 }

		 if (!player.canPlayerEdit(x, y, z, movingobjectposition.sideHit, item))
		 {
		 return item;
		 }

		 if (this.tryPlaceContainedLiquid(world, x, y, z) && !player.capabilities.isCreativeMode)
		 {
		 return new ItemStack(Item.bucketEmpty);
		 }

		 }

		 return item;
		 }
	 }
	 private boolean tryPlaceContainedLiquid(World world, int x, int y, int z) {
		 if (this.isFull <= 0)
        {
            return false;
        }
        else
        {
            Material material = world.getBlockMaterial(x, y, z);
            boolean flag = !material.isSolid();

            if (!world.isAirBlock(x, y, z) && !flag)
            {
                return false;
            }
            else
            {
                if (world.provider.isHellWorld && this.isFull == Block.waterMoving.blockID)
                {
                    world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

                    for (int l = 0; l < 8; ++l)
                    {
                        world.spawnParticle("largesmoke", (double)x + Math.random(), (double)y + Math.random(), (double)z + Math.random(), 0.0D, 0.0D, 0.0D);
                    }
                }
                else
                {
                    if (!world.isRemote && flag && !material.isLiquid())
                    {
                        world.destroyBlock(x, y, z, true);
                    }

                    world.setBlock(x, y, z, this.isFull, 0, 3);
                }

                return true;
            }
        }
        }
		 @Override
			@SideOnly(Side.CLIENT)
			public void registerIcons(IconRegister register) {
				itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.emeraldBucket_ICON);
	 }
	 
}
