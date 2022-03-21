package com.fafa.newdesignpattern.prototype.improve;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 15:51
 */
public class Client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom", 2, "黑白");
        Sheep cloneSheep1 = (Sheep) prototype.clone();
        Sheep cloneSheep2 = (Sheep) prototype.clone();
        Sheep cloneSheep3 = (Sheep) prototype.clone();
        Sheep cloneSheep4 = (Sheep) prototype.clone();
        System.out.println("cloneSheep1 = " + cloneSheep1);
        System.out.println("cloneSheep2 = " + cloneSheep2);
        System.out.println("cloneSheep3 = " + cloneSheep3);
        System.out.println("cloneSheep4 = " + cloneSheep4);
    }
}
