package com.github.m.q.s.elegancekit.core.impl;

import com.github.m.q.s.elegancekit.core.CommonCheck;
import com.github.m.q.s.elegancekit.core.exception.ServerException;
import com.github.m.q.s.elegancekit.core.func.StringFunc;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class StringCheckUtils {

    /**
     * collection check impl class
     * @param target param
     * @param code this exception code
     * @param message this exception message
     */
    public static void checkEmpty(String target,
                             int code,
                             String message) {
        CommonCheck.check(target, ServerException.class, StringFunc.checkEmpty(target), code, message);
    }

    /**
     * collection check impl class
     * @param target param
     * @param code this exception code
     * @param message this exception message
     */
    public static void checkNotEmpty(String target,
                                  int code,
                                  String message) {
        CommonCheck.check(target, ServerException.class, StringFunc.checkNotEmpty(target), code, message);
    }
}
