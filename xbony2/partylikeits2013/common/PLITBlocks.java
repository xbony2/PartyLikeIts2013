package xbony2.partylikeits2013.common;

import xbony2.partylikeits2013.IDs;
import xbony2.partylikeits2013.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class PLITBlocks {
	public static Block netherQuartz;
	
	public static void registerBlocks(){
		netherQuartz = new PLITOre(IDs.NETHER_QUARTZ_ID, 0, IDs.NETHER_QUARTZ_NAME, PLITItems.netherQuartz);
		
		GameRegistry.registerBlock(netherQuartz, IDs.NETHER_QUARTZ_NAME);
		
		LanguageRegistry.addName(netherQuartz, IDs.NETHER_QUARTZ_NAME);
	}
}
