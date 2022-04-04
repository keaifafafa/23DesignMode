package com.fafa.newdesignpattern.flyweight;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-04 15:19
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
