package xbony2.partylikeits2013.common;

import xbony2.partylikeits2013.blocks.PLITOre;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class PLITBlocks {
	public static Block netherQuartz;
	
	//Available ids: 153-163 + 167-209
	public static final int NETHER_QUARTZ_ID = 153;
	
	public static void registerBlocks(){
		netherQuartz = new PLITOre();
		
		GameRegistry.registerBlock(netherQuartz, "Quartz Ore");
		
		LanguageRegistry.addName(netherQuartz, "Quartz Ore");
	}
}
