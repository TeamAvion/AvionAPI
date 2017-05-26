package org.teamavion.core.systems.tech.wrench;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * All wrenches should be marked with IAvionWrench for blocks to check (if they want) if the player is using a wrench
 *
 * When wrenching blocks:
 * if the player is holding shift it will call onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
 * Otherwise it should call rotateBlock(World world, BlockPos pos, EnumFacing axis)
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface IAvionWrench {}
