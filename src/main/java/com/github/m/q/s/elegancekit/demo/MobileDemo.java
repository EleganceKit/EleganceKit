package com.github.m.q.s.elegancekit.demo;

import com.github.m.q.s.elegancekit.demo.customimpl.MobileCheckUtils;

public class MobileDemo {

    // Phone number format validation is the process of checking
    // whether a phone number conforms to the expected format or pattern,
    // ensuring it is correctly structured and potentially valid for use.
    public static void main(String[] args) {
        String mobileWrong = "10930";
        String mobileRight = "13000001111";

        MobileCheckUtils.checkMobile(mobileRight, -200, "The mobile format is warong.");
        MobileCheckUtils.checkMobile(mobileWrong, -200, "The mobile format is warong.");

    }
}
