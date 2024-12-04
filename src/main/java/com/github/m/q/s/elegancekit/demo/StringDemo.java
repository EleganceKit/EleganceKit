package com.github.m.q.s.elegancekit.demo;

import com.github.m.q.s.elegancekit.core.impl.StringCheckUtils;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */

public class StringDemo {

    // demo
    public static void main(String[] args) {
        String str = "";
        StringCheckUtils.checkNotEmpty(str, -200, "The param is not empty.");
    }
}
