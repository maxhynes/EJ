package EJ.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class furnace extends BlockContainer {
	
	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private Icon iconFront;

	public furnace(int id, boolean isActive) {
		super(id, Material.rock);
		
		this.isActive = isActive;
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.furnaceActive_SIDE);
		this.iconFront = iconRegister.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + (this.isActive ? BlockInfo.furnaceActive_FRONT : BlockInfo.furnaceIdle_SIDE));
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		return side == metadata ? this.iconFront : this.blockIcon;
	}
}


