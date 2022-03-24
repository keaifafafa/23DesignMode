package com.fafa.newdesignpattern.adapter.classadapter;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 21:35
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===类适配器模式===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
