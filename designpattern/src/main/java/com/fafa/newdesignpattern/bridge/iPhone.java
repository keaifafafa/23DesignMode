package com.fafa.newdesignpattern.bridge;

/**
 * 苹果
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:21
 */
public class iPhone implements Brand {

    @Override
    public void open() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关机");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }
}
