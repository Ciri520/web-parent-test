package com.bidewu.web.Test.MultiThread.ThreadLocal.threadLocal;

/**
 * Created by zengqingzhou on 2019/6/21.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }
}
