package xbony2.partylikeits2013.items;

import xbony2.partylikeits2013.PartyLikeIts2013;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PLITItem extends Item{

	public PLITItem(int id, int tID, String name) {
		super(id);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setIconIndex(tID);
		this.setItemName(name);
	}

	@Override
	public String getTextureFile(){
		return PartyLikeIts2013.TEXTURES_LOCATION;
	}
}
