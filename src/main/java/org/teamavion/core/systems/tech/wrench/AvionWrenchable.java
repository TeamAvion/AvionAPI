package org.teamavion.core.systems.tech.wrench;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * if the player is holding shift (or set in break mode, like in the example) it will call onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
 * Otherwise it should call rotateBlock(World world, BlockPos pos, EnumFacing axis)
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface AvionWrenchable {}
