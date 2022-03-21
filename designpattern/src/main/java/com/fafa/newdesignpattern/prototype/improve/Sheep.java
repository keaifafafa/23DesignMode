package com.fafa.newdesignpattern.prototype.improve;

/**
 * 羊的原型
 * 需要实现 Cloneable 接口
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 15:38
 */
public class Sheep implements Cloneable {
    String name;
    int age;
    String color;
    String address = "非洲羊";

    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            // 克隆对象
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

}
