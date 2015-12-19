package com.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
	boolean primaryKey() default false;

	boolean allowNull() default true;

	boolean unique() default false;
}