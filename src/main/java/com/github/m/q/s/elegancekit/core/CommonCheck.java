package com.github.m.q.s.elegancekit.core;

import com.github.m.q.s.elegancekit.core.exception.ServerException;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Function;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class CommonCheck {

    /**
     * common check param method
     * @param t param
     * @param newException The exception class is customizable, allowing for user-defined modifications or extensions as needed.
     * @param function function
     * @param code exception code num
     * @param message exception message for user or other
     * @param <T> generic Parameter
     * @param <E> generic exception
     */
    public static <T, E extends RuntimeException> void check(T t,
                                                             Class<E> newException,
                                                             Function<T, Boolean> function,
                                                             int code,
                                                             String message) {
        try {

            if (!function.apply(t)) {
                throw newException.getConstructor(int.class, String.class).newInstance(code, message);
            }
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            // -1，default exception code
            throw new ServerException(-1, "An exception that is thrown is neither a subclass of RuntimeException nor does it have an available constructor for execution.");
        }
    }
}
