package EJ.Items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import EJ.entity.WitherSpider;
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

public class ItemSpider extends Item {

	public ItemSpider(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMisc);
		setCreativeTab(EJ.core.EJ.tabEJ);
		setUnlocalizedName(ItemInfo.SPIDER_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.SPIDER_ICON);
	}
	
	public boolean onItemUse (ItemStack stack, EntityPlayer player, World world, int posX, int posY, int posZ, int par7, float par8, float par9, float par10)
    {
        if (!world.isRemote)
        {
            activateSpawnEgg(stack, world, posX, posY, posZ, par7);
            if (!player.capabilities.isCreativeMode)
            {
                --stack.stackSize;
            }
        }
        return true;
    }

    public static EntityLiving activateSpawnEgg (ItemStack stack, World world, double posX, double posY, double posZ, int par7)
    {
        int i1 = world.getBlockId((int) posX, (int) posY, (int) posZ);
        posX += Facing.offsetsXForSide[par7];
        posY += Facing.offsetsYForSide[par7];
        posZ += Facing.offsetsZForSide[par7];
        double d0 = 0.0D;

        if (par7 == 1 && Block.blocksList[i1] != null && Block.blocksList[i1].getRenderType() == 11)
        {
            d0 = 0.5D;
        }

        int damage = stack.getItemDamage();
        EntityLiving entity = null;
        switch (damage)
        {
        case 0:
            entity = new WitherSpider(world);
            spawnEntity(posX, posY, posZ, entity, world);
            break;
       
        }
        return entity;
    }

    public static void spawnEntity (double x, double y, double z, EntityLiving entity, World world)
    {
        if (!world.isRemote)
        {
            entity.setPosition(x, y, z);
            world.spawnEntityInWorld(entity);
        }
    }
}
	

