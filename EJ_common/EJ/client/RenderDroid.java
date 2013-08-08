package EJ.client;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import EJ.entity.EntityDroid;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class RenderDroid extends Render {

	private ModelDroid model;
	
	public RenderDroid() {
		model = new ModelDroid();
		shadowSize = 0.5F;
	}

	
	private static final ResourceLocation texture = new ResourceLocation("ej", "textures/models/droid.png");
	
	public void renderDroid(EntityDroid droid, double x, double y, double z, float yaw, float partialTickTime) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1, -1, 1);
		
		func_110777_b(droid);
		
		model.render(droid, 0, 0, 0, 0, 0, 0.0625F);
		
		GL11.glPopMatrix();
	}
	


	@Override
	protected ResourceLocation func_110775_a(Entity entity) {

		return texture;
	}
	
	
	
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
		renderDroid((EntityDroid)entity, x, y, z, yaw, partialTickTime);
	}
}
