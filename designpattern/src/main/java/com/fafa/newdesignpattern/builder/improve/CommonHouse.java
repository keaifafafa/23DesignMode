package com.fafa.newdesignpattern.builder.improve;


/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 17:52
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBase("普通房的地基");
        System.out.println("普通房子打地基~");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通的墙");
        System.out.println("普通房子砌墙~");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通房顶");
        System.out.println("普通房子封顶~");
    }
}
