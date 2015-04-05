package xbony2.partylikeits2013.common;

import xbony2.partylikeits2013.PartyLikeIts2013;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	
	//@Override eclipse is being retarded...
	public static void registerRenders(){
		MinecraftForgeClient.preloadTexture(PartyLikeIts2013.TEXTURES_LOCATION);
	}
}
