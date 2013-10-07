package EJ.proxy;

import java.util.EnumSet;

import EJ.Items.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class ServerTickHandler implements ITickHandler {
	
	private void onPlayerTick(EntityPlayer player) {
		
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			
			//if (helmet.getItem() == Items.rubyHelmet) {
				//player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5, 0));
			//}
				
			if (helmet.getItem() == Items.miner) {
					player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 5, 0));	
			}
			
			//if (helmet.getItem() == Items.opalHelmet) {
				//player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 5, 0));	
		//}
		}
		
		if (player.getCurrentItemOrArmor(3) != null) {
			ItemStack chestplate = player.getCurrentItemOrArmor(3);
			
			if (chestplate.getItem() == Items.shadowChestplate) {
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 4, 2));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 2, 2));
				
				
				
			}
			
			/**if (chestplate.getItem() == Items.opalChestplate) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 5, 0));
			}**/
			
			
		}
		/**if (player.getCurrentItemOrArmor(2) != null) {
			ItemStack leggings = player.getCurrentItemOrArmor(2);
			
			if (leggings.getItem() == Items.rubyLeggings) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5, 0));
		}
			if (leggings.getItem() == Items.opalLeggings) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 5, 0));
		}

}
		if (player.getCurrentItemOrArmor(1) != null) {
			ItemStack boots = player.getCurrentItemOrArmor(1);
			
			if (boots.getItem() == Items.rubyBoots) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5, 0));
	}
			if (boots.getItem() == Items.opalBoots) {
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 5, 0));
	}
}**/
		
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.PLAYER))) {
			onPlayerTick((EntityPlayer) tickData[0]);
		}
		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER, TickType.SERVER);
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
}
