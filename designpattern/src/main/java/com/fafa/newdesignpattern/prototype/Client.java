package com.fafa.newdesignpattern.prototype;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 15:39
 */
public class Client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom", 2, "黑白");
        // 复制
        Sheep sheep = new Sheep(prototype.name, prototype.age, prototype.color);
        Sheep sheep1 = new Sheep(prototype.name, prototype.age, prototype.color);
        Sheep sheep2 = new Sheep(prototype.name, prototype.age, prototype.color);
        Sheep sheep3 = new Sheep(prototype.name, prototype.age, prototype.color);
        System.out.println("sheep = " + sheep);
        System.out.println("sheep1 = " + sheep1);
        System.out.println("sheep2 = " + sheep2);
        System.out.println("sheep3 = " + sheep3);
    }
}
