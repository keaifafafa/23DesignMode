package com.fafa.newdesignpattern.facade;

/**
 * 投影仪
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:46
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector  ");
    }

    //...

}
