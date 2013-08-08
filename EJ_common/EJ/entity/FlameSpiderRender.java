package EJ.entity;

import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class FlameSpiderRender extends RenderSpider
{

    public FlameSpiderRender()
    {
        super();
    }

    @Override
    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return texture;
    }
    
    static final ResourceLocation texture = new ResourceLocation("ej", "textures/mob/flamespider.png");

}
