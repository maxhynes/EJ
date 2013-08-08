package EJ.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import EJ.Blocks.BlockInfo;
import EJ.Items.ItemInfo;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ConfigHandler {

	

	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		BlockInfo.topazOre_ID = config.getBlock(BlockInfo.topazOre_KEY, BlockInfo.topazOre_DEFAULT).getInt();
		BlockInfo.rubyOre_ID = config.getBlock(BlockInfo.rubyOre_KEY, BlockInfo.rubyOre_DEFAULT).getInt();
		BlockInfo.opalOre_ID = config.getBlock(BlockInfo.opalOre_KEY, BlockInfo.opalOre_DEFAULT).getInt();
		BlockInfo.topazBlock_ID = config.getBlock(BlockInfo.topazBlock_KEY, BlockInfo.topazBlock_DEFAULT).getInt();
		BlockInfo.rubyBlock_ID = config.getBlock(BlockInfo.rubyBlock_KEY, BlockInfo.rubyBlock_DEFAULT).getInt();
		BlockInfo.opalBlock_ID = config.getBlock(BlockInfo.opalBlock_KEY, BlockInfo.opalBlock_DEFAULT).getInt();
		BlockInfo.zaniteBlock_ID = config.getBlock(BlockInfo.zaniteBlock_KEY, BlockInfo.zaniteBlock_DEFAULT).getInt();
		BlockInfo.zaniteOre_ID = config.getBlock(BlockInfo.zaniteOre_KEY, BlockInfo.zaniteOre_DEFAULT).getInt();
		BlockInfo.aluminite_ID = config.getBlock(BlockInfo.aluminite_KEY, BlockInfo.aluminite_DEFAULT).getInt();
		BlockInfo.MACHINE_ID = config.getBlock(BlockInfo.MACHINE_KEY, BlockInfo.MACHINE_DEFAULT).getInt();
		BlockInfo.blackgrass_ID = config.getBlock(BlockInfo.blackgrass_KEY, BlockInfo.blackgrass_DEFAULT).getInt();
		BlockInfo.blackdirt_ID = config.getBlock(BlockInfo.blackdirt_KEY, BlockInfo.blackdirt_DEFAULT).getInt();
		
		
		
		
		ItemInfo.topazGem_ID = config.getItem(ItemInfo.topazGem_KEY, ItemInfo.topazGem_DEFAULT).getInt();
		ItemInfo.rubyGem_ID = config.getItem(ItemInfo.rubyGem_KEY, ItemInfo.rubyGem_DEFAULT).getInt();
		ItemInfo.opalGem_ID = config.getItem(ItemInfo.opalGem_KEY, ItemInfo.opalGem_DEFAULT).getInt();
		ItemInfo.zaniteGem_ID = config.getItem(ItemInfo.zaniteGem_KEY, ItemInfo.zaniteGem_DEFAULT).getInt();
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt();
		ItemInfo.WAND2_ID = config.getItem(ItemInfo.WAND2_KEY, ItemInfo.WAND2_DEFAULT).getInt();
		
		ItemInfo.topazSword_ID = config.getItem(ItemInfo.topazSword_KEY, ItemInfo.topazSword_DEFAULT).getInt();
		ItemInfo.rubySword_ID = config.getItem(ItemInfo.rubySword_KEY, ItemInfo.rubySword_DEFAULT).getInt();
		ItemInfo.opalSword_ID = config.getItem(ItemInfo.opalSword_KEY, ItemInfo.opalSword_DEFAULT).getInt();
		ItemInfo.emeraldSword_ID = config.getItem(ItemInfo.emeraldSword_KEY, ItemInfo.emeraldSword_DEFAULT).getInt();
		
		ItemInfo.topazPickaxe_ID = config.getItem(ItemInfo.topazPickaxe_KEY, ItemInfo.topazPickaxe_DEFAULT).getInt();
		ItemInfo.rubyPickaxe_ID = config.getItem(ItemInfo.rubyPickaxe_KEY, ItemInfo.rubyPickaxe_DEFAULT).getInt();
		ItemInfo.opalPickaxe_ID = config.getItem(ItemInfo.opalPickaxe_KEY, ItemInfo.opalPickaxe_DEFAULT).getInt();
		ItemInfo.emeraldPickaxe_ID = config.getItem(ItemInfo.emeraldPickaxe_KEY, ItemInfo.emeraldPickaxe_DEFAULT).getInt();
		
		ItemInfo.topazShovel_ID = config.getItem(ItemInfo.topazShovel_KEY, ItemInfo.topazShovel_DEFAULT).getInt();
		ItemInfo.rubyShovel_ID = config.getItem(ItemInfo.rubyShovel_KEY, ItemInfo.rubyShovel_DEFAULT).getInt();
		ItemInfo.opalShovel_ID = config.getItem(ItemInfo.opalShovel_KEY, ItemInfo.opalShovel_DEFAULT).getInt();
		ItemInfo.emeraldShovel_ID = config.getItem(ItemInfo.emeraldShovel_KEY, ItemInfo.emeraldShovel_DEFAULT).getInt();
		
		ItemInfo.topazAxe_ID = config.getItem(ItemInfo.topazAxe_KEY, ItemInfo.topazAxe_DEFAULT).getInt();
		ItemInfo.rubyAxe_ID = config.getItem(ItemInfo.rubyAxe_KEY, ItemInfo.rubyAxe_DEFAULT).getInt();
		ItemInfo.opalAxe_ID = config.getItem(ItemInfo.opalAxe_KEY, ItemInfo.opalAxe_DEFAULT).getInt();
		ItemInfo.emeraldAxe_ID = config.getItem(ItemInfo.emeraldAxe_KEY, ItemInfo.emeraldAxe_DEFAULT).getInt();
		
		ItemInfo.topazHoe_ID = config.getItem(ItemInfo.topazHoe_KEY, ItemInfo.topazHoe_DEFAULT).getInt();
		ItemInfo.rubyHoe_ID = config.getItem(ItemInfo.rubyHoe_KEY, ItemInfo.rubyHoe_DEFAULT).getInt();
		ItemInfo.opalHoe_ID = config.getItem(ItemInfo.opalHoe_KEY, ItemInfo.opalHoe_DEFAULT).getInt();
		ItemInfo.emeraldHoe_ID = config.getItem(ItemInfo.emeraldHoe_KEY, ItemInfo.emeraldHoe_DEFAULT).getInt();
		
		ItemInfo.topazHelmet_ID = config.getItem(ItemInfo.topazHelmet_KEY, ItemInfo.topazHelmet_DEFAULT).getInt();
		ItemInfo.topazLeggings_ID = config.getItem(ItemInfo.topazLeggings_KEY, ItemInfo.topazLeggings_DEFAULT).getInt();
		ItemInfo.topazChestplate_ID = config.getItem(ItemInfo.topazChestplate_KEY, ItemInfo.topazChestplate_DEFAULT).getInt();
		ItemInfo.topazBoots_ID = config.getItem(ItemInfo.topazBoots_KEY, ItemInfo.topazBoots_DEFAULT).getInt();
		
		ItemInfo.rubyHelmet_ID = config.getItem(ItemInfo.rubyHelmet_KEY, ItemInfo.rubyHelmet_DEFAULT).getInt();
		ItemInfo.rubyLeggings_ID = config.getItem(ItemInfo.rubyLeggings_KEY, ItemInfo.rubyLeggings_DEFAULT).getInt();
		ItemInfo.rubyChestplate_ID = config.getItem(ItemInfo.rubyChestplate_KEY, ItemInfo.rubyChestplate_DEFAULT).getInt();
		ItemInfo.rubyBoots_ID = config.getItem(ItemInfo.rubyBoots_KEY, ItemInfo.rubyBoots_DEFAULT).getInt();
		
		ItemInfo.opalHelmet_ID = config.getItem(ItemInfo.opalHelmet_KEY, ItemInfo.opalHelmet_DEFAULT).getInt();
		ItemInfo.opalLeggings_ID = config.getItem(ItemInfo.opalLeggings_KEY, ItemInfo.opalLeggings_DEFAULT).getInt();
		ItemInfo.opalChestplate_ID = config.getItem(ItemInfo.opalChestplate_KEY, ItemInfo.opalChestplate_DEFAULT).getInt();
		ItemInfo.opalBoots_ID = config.getItem(ItemInfo.opalBoots_KEY, ItemInfo.opalBoots_DEFAULT).getInt();
		
		ItemInfo.emeraldHelmet_ID = config.getItem(ItemInfo.emeraldHelmet_KEY, ItemInfo.emeraldHelmet_DEFAULT).getInt();
		ItemInfo.emeraldLeggings_ID = config.getItem(ItemInfo.emeraldLeggings_KEY, ItemInfo.emeraldLeggings_DEFAULT).getInt();
		ItemInfo.emeraldChestplate_ID = config.getItem(ItemInfo.emeraldChestplate_KEY, ItemInfo.emeraldChestplate_DEFAULT).getInt();
		ItemInfo.emeraldBoots_ID = config.getItem(ItemInfo.emeraldBoots_KEY, ItemInfo.emeraldBoots_DEFAULT).getInt();
		
		ItemInfo.strawberry_ID = config.getItem(ItemInfo.strawberry_KEY, ItemInfo.strawberry_DEFAULT).getInt();
		ItemInfo.DROID_ID = config.getItem(ItemInfo.DROID_KEY, ItemInfo.DROID_DEFAULT).getInt();
		ItemInfo.SPIDER_ID = config.getItem(ItemInfo.SPIDER_KEY, ItemInfo.SPIDER_DEFAULT).getInt();
		ItemInfo.emeraldBucket_ID = config.getItem(ItemInfo.emeraldBucket_KEY, ItemInfo.emeraldBucket_DEFAULT).getInt();
		ItemInfo.minerHelmet_ID = config.getItem(ItemInfo.minerHelmet_KEY, ItemInfo.minerHelmet_DEFAULT).getInt();
		
		
		
	
		
		
		
		
		
		config.save();
		
	}
	
}
