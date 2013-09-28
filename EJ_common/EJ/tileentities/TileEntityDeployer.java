package EJ.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDeployer extends TileEntity implements IInventory  {
	private ItemStack[] inventory;
	
	public TileEntityDeployer() {
		inventory = new ItemStack[1];
		
	}

	@Override
	public int getSizeInventory() {
		
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		
		return inventory[i];
	}

	@Override
	public ItemStack decrStackSize(int slot, int count) {
		ItemStack itemstack = getStackInSlot(slot);if(itemstack != null) {if(itemstack.stackSize <= count) {setInventorySlotContents(slot, null);} else {itemstack = itemstack.splitStack(count);onInventoryChanged();}}return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack itemstack = getStackInSlot(slot);setInventorySlotContents(slot, null);return itemstack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		inventory[slot] = itemstack;if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {itemstack.stackSize = getInventoryStackLimit();}onInventoryChanged();
		
	}

	@Override
	public String getInvName() {
		
		return "Deployer";
	}

	@Override
	public boolean isInvNameLocalized() {
		
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		
		return player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		
		return true;
	}
	

}
