package EJ.proxy;

import EJ.entity.FlameSpiderRender;
import EJ.entity.WitherSpider;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ClientProxy extends CommonProxy {

	@Override
	public void initSounds() {
		//init all the sounds
	}

	@Override
	public void initRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(WitherSpider.class, new FlameSpiderRender());
	}
}
	
	

	
	 
