package com.fafa.newdesignpattern.facade;

/**
 * 爆米花
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:45
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is poping  ");
    }
}
