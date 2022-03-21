package com.fafa.newdesignpattern.builder.improve;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 18:12
 */
public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 将构建的流程写好，抽象的方法
     */
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    /**
     * 建造房子后，将产品（房子）返回
     *
     * @return
     */
    public House buildHouse() {
        return house;
    }

}
