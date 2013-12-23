package EJ.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */


public class GenerationHandler implements IWorldGenerator {

	private WorldGenerator topazOre;
	private WorldGenerator rubyOre;
	private WorldGenerator opalOre;
	private WorldGenerator zaniteOre;
	
	public GenerationHandler() {
		GameRegistry.registerWorldGenerator(this);
		topazOre = new WorldGenMinable(EJ.Blocks.BlockInfo.topazOre_ID, 4);
		rubyOre = new WorldGenMinable(EJ.Blocks.BlockInfo.rubyOre_ID, 4);
		opalOre = new WorldGenMinable(EJ.Blocks.BlockInfo.opalOre_ID, 4);
		zaniteOre = new WorldGenMinable(EJ.Blocks.BlockInfo.zaniteOre_ID, 3);
	}
	
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY){
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}
		   
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, 5, topazOre, 0, 70);
	
		generateStandardOre(random, chunkX, chunkZ, world, 5, rubyOre, 0, 70);

		generateStandardOre(random, chunkX, chunkZ, world, 5, opalOre, 0, 70);
		
		generateStandardOre(random, chunkX, chunkZ, world, 3, zaniteOre, 0, 70);
}
}
