package com.fafa.designpattern.decorator;

/**
 * 被装饰者
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 22:51
 */
public class Person {

    public Person() {
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
