package org.teamavion.core.MCUtils.automation;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Auto {
    Class<?> value() default Infer.class;
    String name() default "";
}
