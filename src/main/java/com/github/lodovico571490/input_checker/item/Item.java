package com.github.lodovico571490.input_checker.item;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(ElementType.FIELD)
public @interface Item {
}
