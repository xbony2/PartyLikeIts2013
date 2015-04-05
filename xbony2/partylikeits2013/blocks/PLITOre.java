package xbony2.partylikeits2013.blocks;

import xbony2.partylikeits2013.PartyLikeIts2013;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PLITOre extends Block{
	private final Item gem;

	public PLITOre(int id, int tID, String name, Item gem) {
		super(id, tID, Material.rock);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockName(name);
		this.setResistance(5.0F);
		this.setStepSound(soundStoneFootstep);
		this.gem = gem;
	}
	
	@Override
	public String getTextureFile(){
		return PartyLikeIts2013.TEXTURES_LOCATION;
	}
}
