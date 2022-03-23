package com.fafa.newdesignpattern.builder;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 17:50
 */
public abstract class AbstractHouse {
    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 创建
     */
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
