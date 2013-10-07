package EJ.client.interfaces;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class Guipouch extends GuiScreen{
	
	public final int xSizeTexture = 176;
	public final int ySizeTexture = 165;
	
	public Guipouch(EntityPlayer player) {
		
	}
	
	private static final ResourceLocation texture = new ResourceLocation("minecraft", "textures/gui/container/dispenser.png");
	
	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		int posX = (this.width - xSizeTexture) / 2;
		int posY = (this.height - ySizeTexture) / 2;
		
		drawTexturedModalRect(posX, posY, 0, 0, xSizeTexture, ySizeTexture);
		
		super.drawScreen(x, y, f);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

}
