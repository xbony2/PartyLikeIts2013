package xbony2.partylikeits2013;

import xbony2.partylikeits2013.common.ClientProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "PartyLikeIts2013", name = "Party like it's 2013!", version = "1.0.0a")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class PartyLikeIts2013 {
	public static final String CLIENT_PROXY_LOCATION = "xbony2.partylikeits2013.common.ClientProxy";
	public static final String COMMON_PROXY_LOCATION = "xbony2.partylikeits2013.common.CommonProxy";
	
	public static final String TEXTURES_LOCATION = "xbony2/partylikeits2013/textures.png";
	
	@SidedProxy(clientSide = CLIENT_PROXY_LOCATION, serverSide = COMMON_PROXY_LOCATION)
	public static ClientProxy proxy = new ClientProxy();
	
	@Init
	public void load(FMLInitializationEvent event){
		
	}
}
