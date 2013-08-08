package EJ.world.Biomes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Biomes {
	public static BiomeGenBase darkwoods;
	
	
	public static void init() {
		//Biomes
	    darkwoods = (new Darkwoods(BiomeInfo.darkwoods_DEFAULT).setBiomeName("Dark Woods").setMinMaxHeight(-0.2F,0.2F).setTemperatureRainfall(0.8F, 0.9F));
	    GameRegistry.addBiome(darkwoods);

	}
	
	
		


}

