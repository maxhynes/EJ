/**
 * Copyright (c) SpaceToad, 2011
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class ItemEJWrench extends Item {
		
		

	        public ItemEJWrench(int id) {
	                super(id);
	                
	                
	                
	                // Constructor Configuration
	                maxStackSize = 1;
	                setCreativeTab(EJ.core.EJ.tabEJ);
	                
	                setUnlocalizedName(ItemInfo.wrench_UNLOCALIZED_NAME);
	        }
	        @Override
	    	@SideOnly(Side.CLIENT)
	    	public void registerIcons(IconRegister register) {
	    		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.wrench_ICON);
	}
	}
