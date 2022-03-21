package com.fafa.newdesignpattern.builder;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 17:54
 */
public class Client {
    public static void main(String[] args) {
        AbstractHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
