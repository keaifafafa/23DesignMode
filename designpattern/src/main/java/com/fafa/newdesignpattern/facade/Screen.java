package com.fafa.newdesignpattern.facade;

/**
 * 屏幕
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:46
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }


    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
