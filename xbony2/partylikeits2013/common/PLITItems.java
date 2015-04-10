package xbony2.partylikeits2013.common;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import xbony2.partylikeits2013.IDs;
import xbony2.partylikeits2013.items.*;
import net.minecraft.item.Item;

public class PLITItems {
	public static Item netherQuartz;
	
	public static void registerItems(){
		netherQuartz = new PLITItem(IDs.NETHER_QUARTZ_ITEM_ID, 1, IDs.NETHER_QUARTZ_ITEM_NAME);
		
		GameRegistry.registerItem(netherQuartz, IDs.NETHER_QUARTZ_ITEM_NAME);
		
		LanguageRegistry.addName(netherQuartz, IDs.NETHER_QUARTZ_ITEM_NAME);
	}
}
