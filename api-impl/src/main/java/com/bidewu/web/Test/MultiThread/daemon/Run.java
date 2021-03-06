package com.bidewu.web.Test.MultiThread.daemon;

import java.lang.management.ManagementFactory;

/**
 * Created by zengqingzhou on 2019/6/14.
 */
public class Run {
    public static void main(String[] args) {
        try {

            String name = ManagementFactory.getRuntimeMXBean().getName();
            System.out.println(name.split("@")[0]);
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不在打印了, 也就是停止了! ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
