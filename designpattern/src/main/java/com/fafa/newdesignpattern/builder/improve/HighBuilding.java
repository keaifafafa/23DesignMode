package com.fafa.newdesignpattern.builder.improve;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 18:20
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBase("高层房地基");
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        house.setWall("高层房墙");
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        house.setRoofed("高层房屋顶");
        System.out.println(" 高楼的透明屋顶 ");
    }
}
