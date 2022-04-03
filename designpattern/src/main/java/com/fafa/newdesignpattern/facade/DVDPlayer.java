package com.fafa.newdesignpattern.facade;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-03 22:41
 */
public class DVDPlayer {

    /**
     * 使用单例模式[饿汉式]
     */
    public static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" dvd on ");
    }

    public void off() {
        System.out.println(" dvd off ");
    }

    public void play() {
        System.out.println(" dvd is playing ");
    }

    //....
    public void pause() {
        System.out.println(" dvd pause ..");
    }


}
