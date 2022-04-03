package com.fafa.newdesignpattern.facade;

/**
 * 立体声
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:45
 */
public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }

    //...
}
