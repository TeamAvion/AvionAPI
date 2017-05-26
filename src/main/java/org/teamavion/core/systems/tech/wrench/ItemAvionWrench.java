package org.teamavion.core.systems.tech.wrench;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.teamavion.core.MCUtils.automation.Auto;

/**
 * Created by Thor Johansson on 5/25/2017.
 */
@IAvionWrench
public class ItemAvionWrench extends Item{
    public static final @Auto ItemAvionWrench wrench;
    public ItemAvionWrench(){
        super();
        this.setRegistryName("ItemAvionWrench");
        this.setUnlocalizedName("avionwrench");
    }
    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        if (!worldIn.isRemote) {
            Block block = worldIn.getBlockState(pos).getBlock();
            if(block.getClass().isAnnotationPresent(IAvionWrenchable.class)){
                if(player.isSneaking())
                    block.onBlockDestroyedByPlayer(worldIn, pos, worldIn.getBlockState(pos));
                else
                    block.rotateBlock(worldIn, pos, player.getAdjustedHorizontalFacing());
                    return EnumActionResult.SUCCESS;
            }
            return EnumActionResult.FAIL;
        }
        return EnumActionResult.FAIL;
    }
}
