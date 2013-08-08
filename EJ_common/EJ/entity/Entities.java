package EJ.entity;

import cpw.mods.fml.common.registry.EntityRegistry;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */


public class Entities {
	
	

	public static void init() {
		//EntityRegistry.registerModEntity(EntityDroid.class, "EntityDroid", 2, EJ.core.EJ.instance, 80, 3, true);
		EntityRegistry.registerModEntity(WitherSpider.class, "WitherSpider", 10, EJ.core.EJ.instance, 80, 3, true);
		
	}
}
	

	

