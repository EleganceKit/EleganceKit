package com.github.m.q.s.elegancekit.core.func;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class StringFunc {

    /**
     * function as param
     * @param target param
     * @return function
     */
    public static Function<String, Boolean> checkNotEmpty(String target) {
        return input -> StringUtils.isNotEmpty(target);
    }

    /**
     * function as param
     * @param target param
     * @return function
     */
    public static Function<String, Boolean> checkEmpty(String target) {
        return input -> StringUtils.isEmpty(target);
    }
}
