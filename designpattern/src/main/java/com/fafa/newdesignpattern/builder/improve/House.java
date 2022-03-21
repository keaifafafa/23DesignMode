package com.fafa.newdesignpattern.builder.improve;

/**
 * 产品——>房子
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 18:12
 */
public class House {
    private String base;
    private String wall;
    private String roofed;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
