package EJ.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import EJ.tileentities.TileEntityDeployer;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class deployer extends BlockContainer {
	public deployer(int id) {
		super(id, Material.iron);
		setUnlocalizedName(BlockInfo.deployer_UNLOCALIZED_NAME);
		setCreativeTab(EJ.core.EJ.tabEJ);
		setHardness(5F);
		setResistance(10F);
		}
	
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	@SideOnly(Side.CLIENT)
	public static Icon frontIcon;
	public void registerIcons(IconRegister register) {
	topIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + "deployer_top");
	sideIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + "deployer_side");
	frontIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + "deployer_front");}
	

@SideOnly(Side.CLIENT)
@Override
public Icon getIcon(int side, int meta) {
	if(side == 0 || side == 1) {return topIcon;} else if(side != meta) {return sideIcon;} else {return frontIcon;}}
@Override public void onBlockAdded(World world, int x, int y, int z) {
	super.onBlockAdded(world, x, y, z);
	setDefaultDirection(world, x, y, z);
	
	}

private void setDefaultDirection(World world, int x, int y, int z) {
	if(!world.isRemote) {
		int zNeg = world.getBlockId(x, y, z - 1);
		int zPos = world.getBlockId(x, y, z + 1);
		int xNeg = world.getBlockId(x - 1, y, z);
		int xPos = world.getBlockId(x + 1, y, z);
		byte meta = 3;
		if(Block.opaqueCubeLookup[xNeg] && !Block.opaqueCubeLookup[xPos]) meta = 5;
		if(Block.opaqueCubeLookup[xPos] && !Block.opaqueCubeLookup[xNeg]) meta = 4;
		if(Block.opaqueCubeLookup[zNeg] && !Block.opaqueCubeLookup[zPos]) meta = 3;
		if(Block.opaqueCubeLookup[zPos] && !Block.opaqueCubeLookup[zNeg]) meta = 2;
		world.setBlockMetadataWithNotify(x, y, z, meta, 2);
	}
}

@Override public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack) {
	int rotation = MathHelper.floor_double((double)(entity.rotationYaw * 4F / 360F) + 0.5D) & 3;if(rotation == 0) {world.setBlockMetadataWithNotify(x, y, z, 2, 2);}if(rotation == 1) {world.setBlockMetadataWithNotify(x, y, z, 5, 2);}if(rotation == 2) {world.setBlockMetadataWithNotify(x, y, z, 3, 2);}if(rotation == 3) {world.setBlockMetadataWithNotify(x, y, z, 4, 2);}}


public TileEntity createNewTileEntity(World world) {return new TileEntityDeployer();}


@Override
public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
	if (!world.isRemote) {
		FMLNetworkHandler.openGui(player, EJ.core.EJ.instance, 0, world, x, y, z);
	}
	return true;
}
}









