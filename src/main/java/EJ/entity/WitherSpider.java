package EJ.entity;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import EJ.Items.Items;
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

public class WitherSpider extends EntitySpider
{
    public WitherSpider(World par1World)
    {
        super(par1World);
        this.setSize(1.4F, 0.9F);
        this.isImmuneToFire = true;
        this.experienceValue = 25;
    }
    @SideOnly(Side.CLIENT)
    
    public float spiderScaleAmount ()    
    {        
    	return 1.0F;    
    }

    
 
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D); //Health
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(24D); //Detection range
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(1.35); //Movespeed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(4.0); //Base damage
    }


    protected void attackEntity (Entity par1Entity, float par2)
    {
        if (par2 > 2.0F && par2 < 6.0F && this.rand.nextInt(10) == 0)
        {
            if (this.onGround)
            {
                double d0 = par1Entity.posX - this.posX;
                double d1 = par1Entity.posZ - this.posZ;
                float f2 = MathHelper.sqrt_double(d0 * d0 + d1 * d1);
                this.motionX = d0 / (double) f2 * 0.5D + this.motionX * 0.20000000298023224D;
                this.motionZ = d1 / (double) f2 * 0.5D + this.motionZ * 0.20000000298023224D;
                this.motionY = 0.62D;
            }
        }
        else
        {
            super.attackEntity(par1Entity, par2);
        }
    }

        
        


    public boolean attackEntityAsMob(Entity par1Entity)
    {
        if (super.attackEntityAsMob(par1Entity))
        {
            if (par1Entity instanceof EntityLivingBase)
            {
                byte b0 = 0;

                if (this.worldObj.difficultySetting > 1)
                {
                    if (this.worldObj.difficultySetting == 2)
                    {
                        b0 = 7;
                    }
                    else if (this.worldObj.difficultySetting == 3)
                    {
                        b0 = 15;
                    }
                }

                if (b0 > 0)
                {
                    ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.wither.id, b0 * 20, 0));
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
        


    protected void jump ()
    {
        this.motionY = 0.62D;

        if (this.isPotionActive(Potion.jump))
        {
            this.motionY += (double) ((float) (this.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F);
        }

        if (this.isSprinting())
        {
            float f = this.rotationYaw * 0.017453292F;
            this.motionX -= (double) (MathHelper.sin(f) * 0.2F);
            this.motionZ += (double) (MathHelper.cos(f) * 0.2F);
        }

        this.isAirBorne = true;
        ForgeHooks.onLivingJump(this);
    }

    @Override
    protected void fall (float par1)
    {
        par1 = ForgeHooks.onLivingFall(this, par1);
        if (par1 <= 0)
        {
            return;
        }

        super.fall(par1);
        int i = MathHelper.ceiling_float_int(par1 - 5.0F);

        if (i > 0)
        {
            if (i > 4)
            {
                this.playSound("damage.fallbig", 1.0F, 1.0F);
            }
            else
            {
                this.playSound("damage.fallsmall", 1.0F, 1.0F);
            }

            this.attackEntityFrom(DamageSource.fall, i);
            int j = this.worldObj.getBlockId(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 0.20000000298023224D - (double) this.yOffset), MathHelper.floor_double(this.posZ));

            if (j > 0)
            {
                StepSound stepsound = Block.blocksList[j].stepSound;
                this.playSound(stepsound.getStepSound(), stepsound.getVolume() * 0.5F, stepsound.getPitch() * 0.75F);
            }
        }
    }


   
    


    public int getAttackStrength (Entity par1Entity)
    {
        return 4;
    }

    protected int getDropItemId ()
    {
        return Items.strawberry.itemID;
    }

    public EntityItem dropItemWithOffset (int par1, int par2, float par3)
    {
        return this.entityDropItem(new ItemStack(par1, par2, 7), par3);
    }

    protected void dropFewItems(boolean par1, int par2)
    {
        super.dropFewItems(par1, par2);

        if (par1 && (this.rand.nextInt(3) == 0 || this.rand.nextInt(1 + par2) > 0))
        {
            this.dropItem(Items.zaniteGem.itemID, 1);
        }
    }

    public boolean getCanSpawnHere ()
    {
        return this.worldObj.difficultySetting > 0 && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty()
                && !this.worldObj.isAnyLiquid(this.boundingBox);
    }
}
