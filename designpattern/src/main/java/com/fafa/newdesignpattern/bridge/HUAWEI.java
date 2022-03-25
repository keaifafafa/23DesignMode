package com.fafa.newdesignpattern.bridge;

/**
 * 华为
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:20
 */
public class HUAWEI implements Brand {

    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
