package EJ.client.interfaces;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import EJ.lib.Reference;
import EJ.tileentities.TileEntityDeployer;

public class GuiDeployer extends GuiContainer {
	public GuiDeployer(InventoryPlayer invPlayer, TileEntityDeployer entity) {
		super(new ContainerDeployer(invPlayer, entity));
		
		xSize = 176;
		ySize = 165;
		
	}

	private static final ResourceLocation texture = new ResourceLocation("minecraft", "textures/gui/container/dispenser.png");
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
		GL11.glColor4f(1, 1, 1, 1);
		
		this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

		
		//Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);
		//drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		//Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);
		//drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}
