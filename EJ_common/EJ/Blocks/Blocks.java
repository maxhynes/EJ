package EJ.Blocks;


import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import EJ.Items.Items;
import EJ.tileentities.TileEntityDeployer;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */



public class Blocks {

	public static Block topazOre;
	public static Block rubyOre;
	public static Block opalOre;
	public static Block topazBlock;
	public static Block rubyBlock;
	public static Block opalBlock;
	public static Block zaniteBlock;
	public static Block zaniteOre;
	public static Block aluminite;
	public static Block Machine;
	public static Block darkgrass;
	public static Block darkdirt;
	public static Block rubyTorch;
	public static Block deployer;
	public static Block furnaceIdle;
	public static Block furnaceActive;


	

	
	

	
	
	public static void init() {
		topazOre = new topazOre(BlockInfo.topazOre_ID);
		rubyOre = new rubyOre(BlockInfo.rubyOre_ID);
		opalOre = new opalOre(BlockInfo.opalOre_ID);
		topazBlock = new topazBlock(BlockInfo.topazBlock_ID);
		rubyBlock = new rubyBlock(BlockInfo.rubyBlock_ID);
		opalBlock = new opalBlock(BlockInfo.opalBlock_ID);
		zaniteBlock = new zaniteBlock(BlockInfo.zaniteBlock_ID);
		zaniteOre = new zaniteOre(BlockInfo.zaniteOre_ID);
		aluminite = new aluminite(BlockInfo.aluminite_ID);
		darkgrass = new darkgrass(BlockInfo.blackgrass_ID);
		darkdirt = new darkdirt(BlockInfo.blackdirt_ID);
		deployer = new deployer(BlockInfo.deployer_ID);
		furnaceIdle = new furnace(BlockInfo.furnaceIdle_ID, false).setUnlocalizedName("furnaceIdle").setCreativeTab(EJ.core.EJ.tabEJ);
		furnaceActive = new furnace(BlockInfo.furnaceActive_ID, true).setUnlocalizedName("furnaceActive").setLightValue(1.0F).setCreativeTab(EJ.core.EJ.tabEJ);
		
		

		
		
		
		GameRegistry.registerBlock(topazOre, "topazOre");
		GameRegistry.registerBlock(rubyOre, "rubyOre");
		GameRegistry.registerBlock(opalOre, "opalOre");
		GameRegistry.registerBlock(topazBlock, "topazBlock");
		GameRegistry.registerBlock(rubyBlock, "rubyBlock");
		GameRegistry.registerBlock(opalBlock, "opalBlock");
		GameRegistry.registerBlock(zaniteBlock, "zaniteBlock");
		GameRegistry.registerBlock(zaniteOre, "zaniteOre");
		GameRegistry.registerBlock(aluminite, "aluminite");
		GameRegistry.registerBlock(darkdirt, "darkdirt");
		GameRegistry.registerBlock(darkgrass, "darkgrass");
		GameRegistry.registerBlock(deployer, "deployer");
		GameRegistry.registerBlock(furnaceIdle, "furnaceIdle");
		GameRegistry.registerBlock(furnaceActive, "furnaceActive");
		

		

		
		

		
		

	}
	
	public static void registerRecipes() {
		
		
		GameRegistry.addRecipe(new ItemStack(topazBlock,1), new Object[]{"TTT","TTT","TTT",'T',Items.topazGem, });        
	    GameRegistry.addRecipe(new ItemStack(rubyBlock,1), new Object[]{"TTT","TTT","TTT",'T',Items.rubyGem, });       
	    GameRegistry.addRecipe(new ItemStack(opalBlock,1), new Object[]{"TTT","TTT","TTT",'T',Items.opalGem, });        
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.topazGem,9), new Object[]{topazBlock });        
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.rubyGem,9), new Object[]{rubyBlock });        
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.opalGem,9), new Object[]{opalBlock }); 
	    
	    GameRegistry.addRecipe(new ItemStack(aluminite,1), new Object[]{"TGT","GLG","TGT",'T',Block.obsidian, 'G',Block.glass, 'L',Block.torchWood }); 

	}
	
	public static void addNames() {
		LanguageRegistry.addName(topazOre, BlockInfo.topazOre_NAME);
		LanguageRegistry.addName(rubyOre, BlockInfo.rubyOre_NAME);
		LanguageRegistry.addName(opalOre, BlockInfo.opalOre_NAME);
		LanguageRegistry.addName(topazBlock, BlockInfo.topazBlock_NAME);
		LanguageRegistry.addName(rubyBlock, BlockInfo.rubyBlock_NAME);
		LanguageRegistry.addName(opalBlock, BlockInfo.opalBlock_NAME);
		LanguageRegistry.addName(zaniteBlock, BlockInfo.zaniteBlock_NAME);
		LanguageRegistry.addName(zaniteOre, BlockInfo.zaniteOre_NAME);
		LanguageRegistry.addName(aluminite, BlockInfo.aluminite_NAME);
		LanguageRegistry.addName(deployer, BlockInfo.deployer_NAME);
		LanguageRegistry.addName(darkgrass, BlockInfo.blackgrass_NAME);
		LanguageRegistry.addName(darkdirt, BlockInfo.blackdirt_NAME);
	


	}
	
	public static void registerTileEntities() {
		
	
		GameRegistry.registerTileEntity(TileEntityDeployer.class, "DeployerEJ");
		
		
	}
	
}