package com.github.m.q.s.elegancekit.core.impl;

import com.github.m.q.s.elegancekit.core.CommonCheck;
import com.github.m.q.s.elegancekit.core.exception.ServerException;
import com.github.m.q.s.elegancekit.core.func.CollectionFunc;

import java.util.Collection;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class CollectionCheckUtils {

    /**
     * collection check impl class
     * @param target param
     * @param code this exception code
     * @param message this exception message
     * @param <E> E
     */
    public static <E> void checkNotEmpty(Collection<E> target,
                                         int code,
                                         String message) {
        CommonCheck.check(target, ServerException.class, CollectionFunc.checkNotEmpty(target), code, message);
    }

    /**
     * collection check impl class
     * @param target param
     * @param code this exception code
     * @param message this exception message
     * @param <E> E
     */
    public static <E> void checkEmpty(Collection<E> target,
                                      int code,
                                      String message) {
        CommonCheck.check(target, ServerException.class, CollectionFunc.checkNotEmpty(target), code, message);
    }
}
