package com.fafa.newdesignpattern.prototype;

/**
 * įžįåå
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 15:38
 */
public class Sheep {
    String name;
    int age;
    String color;

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
