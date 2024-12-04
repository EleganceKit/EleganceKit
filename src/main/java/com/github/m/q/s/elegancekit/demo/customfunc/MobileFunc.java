package com.github.m.q.s.elegancekit.demo.customfunc;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

public class MobileFunc {

    public static Function<String, Boolean> checkMobile(String mobile) {
        return input -> StringUtils.isNotEmpty(mobile) && mobile.matches("^1[3|4|5|7|8][0-9]{9}$");
    }
}
