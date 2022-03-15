package com.fafa.designpattern.proxy;

/**
 * 被追求者
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-10 18:29
 */
public class SchoolGirl {
    private String name;

    public SchoolGirl() {
    }

    public SchoolGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
