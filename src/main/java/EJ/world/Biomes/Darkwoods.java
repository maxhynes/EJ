package EJ.world.Biomes;

import EJ.Blocks.Blocks;
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

public class Darkwoods extends BiomeGenBase
{
    public Darkwoods(int par1)
    {
        super(par1);
        this.topBlock = (byte)Blocks.darkgrass.blockID;
        this.fillerBlock = (byte)Blocks.darkdirt.blockID;
        
        this.theBiomeDecorator.treesPerChunk = 5;
        
        
        
    }
}

