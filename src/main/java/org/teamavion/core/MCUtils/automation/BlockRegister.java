package org.teamavion.core.MCUtils.automation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Deprecated
public @interface BlockRegister {
    Class<? extends net.minecraft.block.Block> value() default net.minecraft.block.Block.class;
    String name() default "";
    String material() default "";
}