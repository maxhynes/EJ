package EJ.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


/**
 * Explorer's Journey
 * 
 * Explorer's Journey
 * 
 * @author Brenwwe
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class rubyArmor extends ItemArmor
{
    String itemTexture;
    String armorTexture;

    public rubyArmor(int id, EnumArmorMaterial material, int renderIndex, int slotType, String itemTexture, String armorTexture)
    {
        super(id, material, renderIndex, slotType);
        this.itemTexture = itemTexture;
        this.armorTexture = armorTexture;
        this.setCreativeTab(EJ.core.EJ.tabEJ);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons (IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("ej:armor_" + itemTexture);
    }

    @Override
    public String getArmorTexture (ItemStack stack, Entity entity, int slot, int layer)
    {
        if (slot == 2)
            return "ej:textures/models/armor/" + armorTexture + "_2.png";
        else
            return "ej:textures/models/armor/" + armorTexture + "_1.png";
    }
}