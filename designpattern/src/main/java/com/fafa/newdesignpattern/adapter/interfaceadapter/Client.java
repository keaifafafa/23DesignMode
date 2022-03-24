package com.fafa.newdesignpattern.adapter.interfaceadapter;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 23:50
 */
public class Client {
    public static void main(String[] args) {
        // 只需要去覆盖我们 需要使用的接口方法
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m2() {
                System.out.println("重写了m2方法！");
            }
        };
        absAdapter.m2();
    }
}
