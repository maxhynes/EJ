package EJ.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import EJ.Blocks.Blocks;
import EJ.Fluids.Fluids;
import EJ.Items.Items;
import EJ.Network.PacketHandler;
import EJ.client.interfaces.GuiHandler;
import EJ.config.ConfigHandler;
import EJ.entity.Entities;
import EJ.entity.WitherSpider;
import EJ.lib.Reference;
import EJ.proxy.CommonProxy;
import EJ.world.GenerationHandler;
//import com.jadarstudios.developercapes.DevCapesUtil;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
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



@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class EJ {
 
    
    // The instance of your mod that Forge uses.
	@Instance("EJ")
	public static EJ instance;
    
    
  
	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="EJ.proxy.ClientProxy", serverSide="EJ.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    
    public static CreativeTabs tabEJ = new EJCreativeTab(CreativeTabs.getNextID(), "Explorer's Journey");
   
    
    
    
    
	
    
    
    
    
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		
		Items.init();
		Blocks.init();
		Entities.init();
		Fluids.init();
		MinecraftForge.EVENT_BUS.register(new EJBucketHandler());
		//Biomes.init(); //--Biome Gen Broken :(

        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Items.opalGem),1,3,065));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Items.zaniteGem),1,3,065));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Items.rubyGem),1,3,065));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Items.topazGem),1,3,065));
        
        //DevCapesUtil.getInstance().addFileUrl("https://dl.dropboxusercontent.com/u/184750575/capes.txt"); // hooks into cape api


		
		
		
		proxy.initSounds();
		
		proxy.addNames();
		
		
		
		
		
		
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		
		MinecraftForge.setBlockHarvestLevel(Blocks.rubyOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Blocks.topazOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(Blocks.opalOre, "pickaxe", 2); 
		MinecraftForge.setBlockHarvestLevel(Blocks.zaniteOre, "pickaxe", 3);
		Items.addNames(); // Adds Item Names
		Blocks.addNames(); // Adds Block Names
		
		Items.registerRecipes(); // Adds Item Recipes
		Blocks.registerRecipes(); // Adds Block Recipes
		new GenerationHandler(); // Activates Generation Handler
		new GuiHandler();// Activates GUI Handler
		Blocks.registerTileEntities(); // Registers tile entities
		
		
		
		
		proxy.initRenderers();
		proxy.registerServerTickHandler();
		
		
		EntityRegistry.addSpawn(WitherSpider.class, 25, 1, 2, EnumCreatureType.monster, BiomeGenBase.hell); //Adds which biome spider can spawn in
		
		
		
	
		
			
		
		
		
		

       


		
		
		

		
		
  
		
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {
		
	
	}
}
        
    


   
    
    
        

 
