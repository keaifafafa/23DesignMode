package com.fafa.newdesignpattern.bridge;

/**
 * 手机抽象类
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:23
 */
public abstract class Phone {
    /**
     * 品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }

}
