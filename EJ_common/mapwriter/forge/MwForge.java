package mapwriter.forge;

import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="MapWriter", name="Explorer's Journey Map Writer", version="1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MwForge {
	
	private MwConfig config;
	
	@Instance("MapWriter")
	public static MwForge instance;
	
	@SidedProxy(clientSide="mapwriter.forge.ClientProxy", serverSide="mapwriter.forge.CommonProxy")
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = Logger.getLogger("MapWriter");
		logger.setParent(FMLLog.getLogger());
		logger.info("FML Event: preInit");
		this.config = new MwConfig(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		logger.info("FML Event: load");
		proxy.init(this.config);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("FML Event: postInit");
	}
}
