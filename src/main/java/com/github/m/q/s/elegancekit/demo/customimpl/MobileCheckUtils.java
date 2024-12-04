package com.github.m.q.s.elegancekit.demo.customimpl;

import com.github.m.q.s.elegancekit.core.CommonCheck;
import com.github.m.q.s.elegancekit.core.exception.ServerException;
import com.github.m.q.s.elegancekit.demo.customfunc.MobileFunc;

public class MobileCheckUtils {

    public static void checkMobile(String mobile, int code, String message) {
        CommonCheck.check(mobile, ServerException.class, MobileFunc.checkMobile(mobile), code, message);
    }
}
