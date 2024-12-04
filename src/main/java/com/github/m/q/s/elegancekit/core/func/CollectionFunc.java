package com.github.m.q.s.elegancekit.core.func;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.function.Function;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class CollectionFunc {

    /**
     * function as param
     * @param target param
     * @return function
     * @param <E> generic Parameter
     */
    public static <E> Function<Collection<E>, Boolean> checkNotEmpty(Collection<E> target) {
        return input -> CollectionUtils.isNotEmpty(target);
    }

    /**
     * function as param
     * @param target param
     * @return function
     * @param <E> generic Parameter
     */
    public static <E> Function<Collection<E>, Boolean> checkEmpty(Collection<E> target) {
        return input -> CollectionUtils.isEmpty(target);
    }
}
