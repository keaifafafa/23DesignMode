package com.fafa.newdesignpattern.facade;

/**
 * 剧光灯
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:44
 */
public class TheaterLight {
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }
}
