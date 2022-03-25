package com.fafa.newdesignpattern.bridge;

/**
 * 直立样式手机
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:26
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
