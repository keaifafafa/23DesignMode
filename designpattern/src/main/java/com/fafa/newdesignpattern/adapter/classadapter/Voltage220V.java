package com.fafa.newdesignpattern.adapter.classadapter;

/**
 * 被适配的类
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 22:05
 */
public class Voltage220V {
    /**
     * 输出220V电压
     *
     * @return
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压 = " + src + "伏");
        return src;
    }
}
