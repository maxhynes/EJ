package EJ.proxy;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class CommonProxy {

	public void initSounds() {
		
	}

	public void initRenderers() {
		
	}
	
	public void registerServerTickHandler() {
	TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
}
	
		
	public static String TOPAZ_1 = "ej:textures/models/armor/TOPAZ_1.png";
	public static String TOPAZ_2 = "ej:textures/armor/models/TOPAZ_2.png";
	
	
	public void addNames() {
    
        
        LanguageRegistry.instance().addStringLocalization("EJ.entity.WitherSpider", "en_US", "Wither Spider");
        
        

    }


	
	
}
