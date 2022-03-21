package com.fafa.newdesignpattern.builder;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 17:52
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基~");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙~");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶~");
    }
}
