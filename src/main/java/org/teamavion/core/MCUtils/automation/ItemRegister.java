package org.teamavion.core.MCUtils.automation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Deprecated
public @interface ItemRegister {
    Class<? extends net.minecraft.item.Item> value() default net.minecraft.item.Item.class;
    String name() default "";
}