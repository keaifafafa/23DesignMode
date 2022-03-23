package com.fafa.newdesignpattern.builder.improve;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 18:07
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品(普通房子)
        System.out.println(houseDirector.constructHouse());

        // 高层建筑
        HighBuilding highBuilding = new HighBuilding();
        HouseDirector houseDirector1 = new HouseDirector(highBuilding);
        System.out.println(houseDirector1.constructHouse());
    }
}
