package com.fafa.newdesignpattern.bridge;

/**
 * 折叠手机
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:22
 */
public class FoldedPhone extends Phone{
    /**
     * 将品牌聚合进去
     * @param brand
     */
    public FoldedPhone(Brand brand) {
        // 将品牌传给 Phone 类
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
