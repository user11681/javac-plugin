package user11681.plugin.processing.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Merge {
    boolean nest() default false;

    boolean forceArray() default true;
}
