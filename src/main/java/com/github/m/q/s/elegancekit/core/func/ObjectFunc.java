package com.github.m.q.s.elegancekit.core.func;

import java.util.Objects;
import java.util.function.Function;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class ObjectFunc {

    /**
     * function as param
     * @param target param
     * @return function
     */
    public static Function<Object, Boolean> checkNoNull(Object target) {
        return input -> Objects.nonNull(target);
    }

    /**
     * function as param
     * @param target param
     * @return function
     */
    public static Function<Object, Boolean> checkNull(Object target) {
        return input -> Objects.isNull(target);
    }
}
