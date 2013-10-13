 package EJ.Items;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import EJ.Fluids.emeraldFluidBucket;
import EJ.proxy.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
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


public class Items {

    public static Item topazGem;
    public static Item rubyGem;
    public static Item opalGem;
    public static Item zaniteGem;
    public static Item Wand;
    public static Item Wand2;
    public static Item spider;
    public static Item emeraldBucket;
    public static Item pouch;
    public static Item obsidianPlate;
    public static Item hammer;
    public static Item chestplatePlating;
    public static Item powerCore;
    public static Item shadowChestplate;
    
    
    public static Item topazSword;
    public static Item rubySword;
    public static Item opalSword;
    public static Item emeraldSword;
    public static Item topazPickaxe;
    public static Item rubyPickaxe;
    public static Item opalPickaxe;
    public static Item emeraldPickaxe;
    public static Item topazShovel;
    public static Item rubyShovel;
    public static Item opalShovel;
    public static Item emeraldShovel;
    public static Item topazAxe;
    public static Item rubyAxe;
    public static Item opalAxe;
    public static Item emeraldAxe;
    public static Item topazHoe;
    public static Item rubyHoe;
    public static Item opalHoe;
    public static Item emeraldHoe;
    public static Item topazHelmet;
    public static Item topazChestplate;
    public static Item topazLeggings;
    public static Item topazBoots;
    public static Item rubyHelmet;
    public static Item rubyChestplate;
    public static Item rubyLeggings;
    public static Item rubyBoots;
    public static Item opalHelmet;
    public static Item opalChestplate;
    public static Item opalLeggings;
    public static Item opalBoots;
    public static Item emeraldHelmet;
    public static Item emeraldChestplate;
    public static Item emeraldLeggings;
    public static Item emeraldBoots;
    public static Item strawberry;
    public static Item miner;
    public static ItemStack rubySwordStack;
    public static Item wrench;
    
    
    
    public static EnumToolMaterial tooltopaz = EnumHelper.addToolMaterial("TOPAZ", 3, 500, 8.0F, 3, 10);
    public static EnumToolMaterial toolruby = EnumHelper.addToolMaterial("RUBY", 3, 500, 8.0F, 3, 10);
    public static EnumToolMaterial toolopal = EnumHelper.addToolMaterial("OPAL", 3, 500, 8.0F, 3, 10);
    public static EnumToolMaterial toolemerald = EnumHelper.addToolMaterial("OPAL", 3, 7805, 40.0F, 15, 50);
    public static EnumToolMaterial toolGravitite = EnumHelper.addToolMaterial("Gravitite", 3, 15610, 50.0F, 30, 100);
    
    public static EnumArmorMaterial Armortopaz = EnumHelper.addArmorMaterial("TOPAZ", 33, new int[]{3, 8, 6, 3}, 10);
    public static EnumArmorMaterial Armorruby = EnumHelper.addArmorMaterial("RUBY", 33, new int[]{3, 8, 6, 3}, 10);
    public static EnumArmorMaterial Armoropal = EnumHelper.addArmorMaterial("OPAL", 33, new int[]{3, 8, 6, 3}, 10);
    public static EnumArmorMaterial Armoremerald = EnumHelper.addArmorMaterial("EMERALD", 165, new int[]{3, 8, 6, 3}, 50);
    
    @SidedProxy(clientSide="EJ.proxy.ClientProxy", serverSide="EJ.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    

    
    
    
    
    
    public static void init() {
        topazGem = new topazGem(ItemInfo.topazGem_ID );
        rubyGem = new rubyGem(ItemInfo.rubyGem_ID);
        opalGem = new opalGem(ItemInfo.opalGem_ID);
        zaniteGem = new zaniteGem(ItemInfo.zaniteGem_ID);
        strawberry = new strawberry(ItemInfo.strawberry_ID, 2 , 0.4F, false);
        spider = new ItemSpider(ItemInfo.SPIDER_ID);
        emeraldBucket = new emeraldFluidBucket(ItemInfo.emeraldBucket_ID);
        //pouch = new pouch(ItemInfo.pouch_ID);
        obsidianPlate = new obsidianPlate(ItemInfo.obsidianPlate_ID);
        hammer = new hammer(ItemInfo.hammer_ID);
        chestplatePlating = new chestplatePlating(ItemInfo.chestplatePlating_ID);
        powerCore = new powerCore(ItemInfo.powerCore_ID);
        wrench = new ItemWrench(ItemInfo.wrench_ID);
        
        
        
        
        //Misc Tools
        //Wand = new Wand(ItemInfo.WAND_ID);
        Wand2 = new Wand2(ItemInfo.WAND2_ID , toolGravitite);
        
        //Swords
        topazSword = new topazSword(ItemInfo.topazSword_ID , tooltopaz);
        rubySword = new rubySword(ItemInfo.rubySword_ID , toolruby);
        opalSword = new opalSword(ItemInfo.opalSword_ID , toolopal);
        emeraldSword = new emeraldSword(ItemInfo.emeraldSword_ID , toolemerald);
        
        //Pickaxes
        topazPickaxe = new topazPickaxe(ItemInfo.topazPickaxe_ID , tooltopaz);
        rubyPickaxe = new rubyPickaxe(ItemInfo.rubyPickaxe_ID , toolruby);
        opalPickaxe = new opalPickaxe(ItemInfo.opalPickaxe_ID , toolopal);
        emeraldPickaxe = new emeraldPickaxe(ItemInfo.emeraldPickaxe_ID , toolemerald);
        
        //Shovels
        topazShovel = new topazShovel(ItemInfo.topazShovel_ID , tooltopaz);
        rubyShovel = new rubyShovel(ItemInfo.rubyShovel_ID , toolruby);
        opalShovel = new opalShovel(ItemInfo.opalShovel_ID , toolopal);
        emeraldShovel = new emeraldShovel(ItemInfo.emeraldShovel_ID , toolemerald);
        
        //Axes
        topazAxe = new topazAxe(ItemInfo.topazAxe_ID , tooltopaz);
        rubyAxe = new rubyAxe(ItemInfo.rubyAxe_ID , toolruby);
        opalAxe = new opalAxe(ItemInfo.opalAxe_ID , toolopal);
        emeraldAxe = new emeraldAxe(ItemInfo.emeraldAxe_ID , toolemerald);
        
        //Hoes
        topazHoe = new topazHoe(ItemInfo.topazHoe_ID , tooltopaz);
        rubyHoe = new rubyHoe(ItemInfo.rubyHoe_ID , toolruby);
        opalHoe = new opalHoe(ItemInfo.opalHoe_ID , toolopal);
        emeraldHoe = new emeraldHoe(ItemInfo.emeraldHoe_ID , toolemerald);
        
        
        miner = new minerArmor(ItemInfo.minerHelmet_ID, Armortopaz, 1, 0, "miner_helmet", "MINER").setUnlocalizedName("minerHelmet").setCreativeTab(EJ.core.EJ.tabEJ);
                 
        topazHelmet = new topazArmor(ItemInfo.topazHelmet_ID, Armortopaz, 1, 0, "topaz_helmet", "TOPAZ").setUnlocalizedName("topazHelmet").setCreativeTab(EJ.core.EJ.tabEJ);
        topazChestplate = new topazArmor(ItemInfo.topazChestplate_ID, Armortopaz, 1, 1, "topaz_body", "TOPAZ").setUnlocalizedName("topazChestplate");
        topazLeggings = new topazArmor(ItemInfo.topazLeggings_ID, Armortopaz, 1, 2, "topaz_leggings", "TOPAZ").setUnlocalizedName("topazLeggings");
        topazBoots = new topazArmor(ItemInfo.topazBoots_ID, Armortopaz, 1, 3, "topaz_boots", "TOPAZ").setUnlocalizedName("topazBoots");
        
        rubyHelmet = new rubyArmor(ItemInfo.rubyHelmet_ID, Armorruby, 1, 0, "ruby_helmet", "RUBY").setUnlocalizedName("rubyHelmet").setCreativeTab(EJ.core.EJ.tabEJ);
        rubyChestplate = new rubyArmor(ItemInfo.rubyChestplate_ID, Armorruby, 1, 1, "ruby_body", "RUBY").setUnlocalizedName("rubyChestplate");
        rubyLeggings = new rubyArmor(ItemInfo.rubyLeggings_ID, Armorruby, 1, 2, "ruby_leggings", "RUBY").setUnlocalizedName("rubyLeggings");
        rubyBoots = new rubyArmor(ItemInfo.rubyBoots_ID, Armorruby, 1, 3, "ruby_boots", "RUBY").setUnlocalizedName("rubyBoots");
        
        opalHelmet = new opalArmor(ItemInfo.opalHelmet_ID, Armoropal, 1, 0, "opal_helmet", "OPAL").setUnlocalizedName("opalHelmet").setCreativeTab(EJ.core.EJ.tabEJ);
        opalChestplate = new opalArmor(ItemInfo.opalChestplate_ID, Armoropal, 1, 1, "opal_body", "OPAL").setUnlocalizedName("opalChestplate");
        opalLeggings = new opalArmor(ItemInfo.opalLeggings_ID, Armoropal, 1, 2, "opal_leggings", "OPAL").setUnlocalizedName("opalLeggings");
        opalBoots = new opalArmor(ItemInfo.opalBoots_ID, Armoropal, 1, 3, "opal_boots", "OPAL").setUnlocalizedName("opalBoots");
        
        emeraldHelmet = new emeraldArmor(ItemInfo.emeraldHelmet_ID, Armoremerald, 1, 0, "emerald_helmet", "EMERALD").setUnlocalizedName("emeraldHelmet").setCreativeTab(EJ.core.EJ.tabEJ);
        emeraldChestplate = new emeraldArmor(ItemInfo.emeraldChestplate_ID, Armoremerald, 1, 1, "emerald_body", "EMERALD").setUnlocalizedName("emeraldChestplate");
        emeraldLeggings = new emeraldArmor(ItemInfo.emeraldLeggings_ID, Armoremerald, 1, 2, "emerald_leggings", "EMERALD").setUnlocalizedName("emeraldLeggings");
        emeraldBoots = new emeraldArmor(ItemInfo.emeraldBoots_ID, Armoremerald, 1, 3, "emerald_boots", "EMERALD").setUnlocalizedName("emeraldBoots");
        
        shadowChestplate = new shadowArmor(ItemInfo.shadowChestplate_ID, Armoremerald, 1, 1, "shadow_body", "SHADOW").setUnlocalizedName("shadowChestplate");
        
        
        /**
        //Armor
        topazHelmet = new topazHelmet(ItemInfo.topazHelmet_ID , Armortopaz , ModLoader.addArmor("TOPAZ"), 0);
        topazChestplate = new topazChestplate(ItemInfo.topazChestplate_ID , Armortopaz , ModLoader.addArmor("TOPAZ"), 1);
        topazLeggings = new topazLeggings(ItemInfo.topazLeggings_ID , Armortopaz , ModLoader.addArmor("TOPAZ"), 2);
        topazBoots = new topazBoots(ItemInfo.topazBoots_ID , Armortopaz , ModLoader.addArmor("TOPAZ"), 3);
        
        
        
        rubyHelmet = new rubyHelmet(ItemInfo.rubyHelmet_ID , Armorruby , ModLoader.addArmor("RUBY"), 0);
        rubyChestplate = new rubyChestplate(ItemInfo.rubyChestplate_ID , Armorruby , ModLoader.addArmor("RUBY"), 1);
        rubyLeggings = new rubyLeggings(ItemInfo.rubyLeggings_ID , Armorruby , ModLoader.addArmor("RUBY"), 2);
        rubyBoots = new rubyBoots(ItemInfo.rubyBoots_ID , Armorruby , ModLoader.addArmor("RUBY"), 3);
        
        opalHelmet = new opalHelmet(ItemInfo.opalHelmet_ID , Armoropal , ModLoader.addArmor("OPAL"), 0);
        opalChestplate = new opalChestplate(ItemInfo.opalChestplate_ID , Armoropal , ModLoader.addArmor("OPAL"), 1);
        opalLeggings = new opalLeggings(ItemInfo.opalLeggings_ID , Armoropal , ModLoader.addArmor("OPAL"), 2);
        opalBoots = new opalBoots(ItemInfo.opalBoots_ID , Armoropal , ModLoader.addArmor("OPAL"), 3);
        
        emeraldHelmet = new emeraldHelmet(ItemInfo.emeraldHelmet_ID , Armoremerald , ModLoader.addArmor("EMERALD"), 0);
        emeraldChestplate = new emeraldChestplate(ItemInfo.emeraldChestplate_ID , Armoremerald , ModLoader.addArmor("EMERALD"), 1);
        emeraldLeggings = new emeraldLeggings(ItemInfo.emeraldLeggings_ID , Armoremerald , ModLoader.addArmor("EMERALD"), 2);
        emeraldBoots = new emeraldBoots(ItemInfo.emeraldBoots_ID , Armoremerald , ModLoader.addArmor("EMERALD"), 3);
        **/
        
        rubySwordStack = new ItemStack(rubySword);        
        rubySwordStack.addEnchantment(Enchantment.fireAspect, 1);
        		


          
        
    }
        

    
    
    
    public static void addNames() {
        LanguageRegistry.addName(topazGem, ItemInfo.topazGem_NAME);
        LanguageRegistry.addName(rubyGem, ItemInfo.rubyGem_NAME); 
        LanguageRegistry.addName(opalGem, ItemInfo.opalGem_NAME); 
        LanguageRegistry.addName(zaniteGem, ItemInfo.zaniteGem_NAME);
        //LanguageRegistry.addName(Wand, ItemInfo.WAND_NAME);
        LanguageRegistry.addName(Wand2, ItemInfo.WAND2_NAME);
        LanguageRegistry.addName(topazSword, ItemInfo.topazSword_NAME);
        LanguageRegistry.addName(rubySword, ItemInfo.rubySword_NAME);
        LanguageRegistry.addName(opalSword, ItemInfo.opalSword_NAME);
        LanguageRegistry.addName(emeraldSword, ItemInfo.emeraldSword_NAME);
        LanguageRegistry.addName(topazPickaxe, ItemInfo.topazPickaxe_NAME);
        LanguageRegistry.addName(rubyPickaxe, ItemInfo.rubyPickaxe_NAME);
        LanguageRegistry.addName(opalPickaxe, ItemInfo.opalPickaxe_NAME);
        LanguageRegistry.addName(emeraldPickaxe, ItemInfo.emeraldPickaxe_NAME);
        LanguageRegistry.addName(topazShovel, ItemInfo.topazShovel_NAME);
        LanguageRegistry.addName(rubyShovel, ItemInfo.rubyShovel_NAME);
        LanguageRegistry.addName(opalShovel, ItemInfo.opalShovel_NAME);
        LanguageRegistry.addName(emeraldShovel, ItemInfo.emeraldShovel_NAME);
        LanguageRegistry.addName(topazAxe, ItemInfo.topazAxe_NAME);
        LanguageRegistry.addName(rubyAxe, ItemInfo.rubyAxe_NAME);
        LanguageRegistry.addName(opalAxe, ItemInfo.opalAxe_NAME);
        LanguageRegistry.addName(emeraldAxe, ItemInfo.emeraldAxe_NAME);
        LanguageRegistry.addName(topazHoe, ItemInfo.topazHoe_NAME);
        LanguageRegistry.addName(rubyHoe, ItemInfo.rubyHoe_NAME);
        LanguageRegistry.addName(opalHoe, ItemInfo.opalHoe_NAME);
        LanguageRegistry.addName(emeraldHoe, ItemInfo.emeraldHoe_NAME);
        LanguageRegistry.addName(strawberry, ItemInfo.strawberry_NAME);
        LanguageRegistry.addName(spider, ItemInfo.SPIDER_NAME);
        LanguageRegistry.addName(emeraldBucket, ItemInfo.emeraldBucket_NAME);
        LanguageRegistry.addName(obsidianPlate, ItemInfo.obsidianPlate_NAME);
        LanguageRegistry.addName(hammer, ItemInfo.hammer_NAME);
        LanguageRegistry.addName(chestplatePlating, ItemInfo.chestplatePlating_NAME);
        LanguageRegistry.addName(powerCore, ItemInfo.powerCore_NAME);
        LanguageRegistry.addName(shadowChestplate, ItemInfo.shadowChestplate_NAME);
        LanguageRegistry.addName(wrench, ItemInfo.wrench_NAME);
        
		

	
        
        
        LanguageRegistry.addName(topazHelmet, ItemInfo.topazHelmet_NAME);
        LanguageRegistry.addName(topazChestplate, ItemInfo.topazChestplate_NAME);
        LanguageRegistry.addName(topazLeggings, ItemInfo.topazLeggings_NAME);
        LanguageRegistry.addName(topazBoots, ItemInfo.topazBoots_NAME);
       
        LanguageRegistry.addName(rubyHelmet, ItemInfo.rubyHelmet_NAME);
        LanguageRegistry.addName(rubyChestplate, ItemInfo.rubyChestplate_NAME);
        LanguageRegistry.addName(rubyLeggings, ItemInfo.rubyLeggings_NAME);
        LanguageRegistry.addName(rubyBoots, ItemInfo.rubyBoots_NAME);
        
        LanguageRegistry.addName(opalHelmet, ItemInfo.opalHelmet_NAME);
        LanguageRegistry.addName(opalChestplate, "Opal Chestplate");
        LanguageRegistry.addName(opalLeggings, "Opal Leggings");
        LanguageRegistry.addName(opalBoots, "Opal Boots");
        
        LanguageRegistry.addName(emeraldHelmet, "Emerald Helmet");
        LanguageRegistry.addName(emeraldChestplate, "Emerald Chestplate");
        LanguageRegistry.addName(emeraldLeggings, "Emerald Leggings");
        LanguageRegistry.addName(emeraldBoots, "Emerald Boots");
        LanguageRegistry.addName(miner, "Miner's Helmet");
        
 
        
        
        
        
        
    }
    
    public static void registerRecipes() {
    	//Misc
    	//GameRegistry.addRecipe(new ItemStack(Wand,1), new Object[]{
        // " T ","TTT"," S ",'T',zaniteGem, 'S', Item.stick });
    	
    	GameRegistry.addRecipe(new ItemStack(Wand2,1), new Object[]{
            " T ","TTT"," S ",'T',zaniteGem, 'S', Item.blazeRod });
    	
    	GameRegistry.addRecipe(new ItemStack(chestplatePlating,1), new Object[]{
            "T T","TST","TTT",'T',obsidianPlate, 'S', emeraldChestplate });
    	
    	GameRegistry.addRecipe(new ItemStack(powerCore,1), new Object[]{
            "T T","TST","STS",'T',obsidianPlate, 'S', zaniteGem });
    	
    	
    	
    	
   
    	
        GameRegistry.addRecipe(new ItemStack(Item.saddle,1), new Object[]{
            "TTT","TST",'T',Item.leather, 'S', Item.silk });
        
        GameRegistry.addRecipe(new ItemStack(Item.netherStar,1), new Object[]{
            "NSN","STS","NSN",'T', Item.emerald, 'S', Item.diamond, 'N', Item.netherrackBrick });
        
        GameRegistry.addRecipe(new ItemStack(hammer,1), new Object[]{
            "SSS"," T ",'T', Item.stick, 'S', Block.stone});
        
        GameRegistry.addRecipe(new ItemStack(wrench,1), new Object[]{
            "S S"," T ",'T', hammer, 'S', Block.stone});
        


    	
        //Axes    
        GameRegistry.addRecipe(new ItemStack(topazAxe,1), new Object[]{"TT ","TS "," S ",'T',topazGem, 'S', Item.stick });
        GameRegistry.addRecipe(new ItemStack(rubyAxe,1), new Object[]{"TT ","TS "," S ",'T',rubyGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(opalAxe,1), new Object[]{"TT ","TS "," S ",'T',opalGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(emeraldAxe,1), new Object[]{"TT ","TS "," S ",'T',Item.emerald, 'S', Item.stick });        
        //Shovels    
        GameRegistry.addRecipe(new ItemStack(topazShovel,1), new Object[]{" T "," S "," S ",'T',topazGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(rubyShovel,1), new Object[]{" T "," S "," S ",'T',rubyGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(opalShovel,1), new Object[]{" T "," S "," S ",'T',opalGem, 'S', Item.stick });       
        GameRegistry.addRecipe(new ItemStack(emeraldShovel,1), new Object[]{" T "," S "," S ",'T',Item.emerald, 'S', Item.stick });        
        //Pickaxes    
        GameRegistry.addRecipe(new ItemStack(topazPickaxe,1), new Object[]{"TTT"," S "," S ",'T',topazGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(rubyPickaxe,1), new Object[]{"TTT"," S "," S ",'T',rubyGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(opalPickaxe,1), new Object[]{"TTT"," S "," S ",'T',opalGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(emeraldPickaxe,1), new Object[]{"TTT"," S "," S ",'T',Item.emerald, 'S', Item.stick });        
        //Swords        
        GameRegistry.addRecipe(new ItemStack(topazSword,1), new Object[]{" T "," T "," S ",'T',topazGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(rubySword,1), new Object[]{" T "," T "," S ",'T',rubyGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(opalSword,1), new Object[]{" T "," T "," S ",'T',opalGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(emeraldSword,1), new Object[]{" T "," T "," S ",'T',Item.emerald, 'S', Item.stick });        
        //Hoes        
        GameRegistry.addRecipe(new ItemStack(topazHoe,1), new Object[]{"TT "," S "," S ",'T',topazGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(rubyHoe,1), new Object[]{"TT "," S "," S ",'T',rubyGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(opalHoe,1), new Object[]{"TT "," S "," S ",'T',opalGem, 'S', Item.stick });        
        GameRegistry.addRecipe(new ItemStack(emeraldHoe,1), new Object[]{"TT "," S "," S ",'T',Item.emerald, 'S', Item.stick });        
              
                 
        //Armor    
        GameRegistry.addRecipe(new ItemStack(topazHelmet,1), new Object[]{"TTT","T T",'T',topazGem });        
        GameRegistry.addRecipe(new ItemStack(topazChestplate,1), new Object[]{"T T","TTT","TTT",'T',topazGem });        
        GameRegistry.addRecipe(new ItemStack(topazLeggings,1), new Object[]{"TTT","T T","T T",'T',topazGem });        
        GameRegistry.addRecipe(new ItemStack(topazBoots,1), new Object[]{"T T","T T",'T',topazGem });        
        GameRegistry.addRecipe(new ItemStack(rubyHelmet,1), new Object[]{"TTT","T T",'T',rubyGem });        
        GameRegistry.addRecipe(new ItemStack(rubyChestplate,1), new Object[]{"T T","TTT","TTT",'T',rubyGem });        
        GameRegistry.addRecipe(new ItemStack(rubyLeggings,1), new Object[]{"TTT","T T","T T",'T',rubyGem });        
        GameRegistry.addRecipe(new ItemStack(rubyBoots,1), new Object[]{"T T","T T",'T',rubyGem });        
        GameRegistry.addRecipe(new ItemStack(opalHelmet,1), new Object[]{"TTT","T T",'T',opalGem });        
        GameRegistry.addRecipe(new ItemStack(opalChestplate,1), new Object[]{"T T","TTT","TTT",'T',opalGem });        
        GameRegistry.addRecipe(new ItemStack(opalLeggings,1), new Object[]{"TTT","T T","T T",'T',opalGem });        
        GameRegistry.addRecipe(new ItemStack(opalBoots,1), new Object[]{"T T","T T",'T',opalGem });        
        GameRegistry.addRecipe(new ItemStack(emeraldHelmet,1), new Object[]{"TTT","T T",'T',Item.emerald });        
        GameRegistry.addRecipe(new ItemStack(emeraldChestplate,1), new Object[]{"T T","TTT","TTT",'T',Item.emerald });        
        GameRegistry.addRecipe(new ItemStack(emeraldLeggings,1), new Object[]{"TTT","T T","T T",'T',Item.emerald });        
        GameRegistry.addRecipe(new ItemStack(emeraldBoots,1), new Object[]{"T T","T T",'T',Item.emerald });
        
        GameRegistry.addRecipe(new ItemStack(miner,1), new Object[]{" T "," S ",'T',Item.glowstone, 'S',Items.topazHelmet });
        
        GameRegistry.addShapelessRecipe(new ItemStack(obsidianPlate,9), new Object[]{hammer, Block.obsidian }); 
        
        


     
    

    }
}

		
