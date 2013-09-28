package EJ.core;

import EJ.Items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public final class EJCreativeTab extends CreativeTabs {        
	public EJCreativeTab(int par1, String par2Str) {                
		super(par1, par2Str);        
		}        
	
	@SideOnly(Side.CLIENT)        
	public int getTabIconItemIndex()        
	{        
		return Items.zaniteGem.itemID;//items       
	}
		
		public String getTranslatedTabLabel()        
		{        
			return "Explorer's Journey";             
		}
	}





