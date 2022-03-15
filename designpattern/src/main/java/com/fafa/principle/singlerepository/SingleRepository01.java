package com.fafa.principle.singlerepository;

/**
 * 单椅职责原则
 * 一个类只负责一个功能
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-14 17:05
 */
public class SingleRepository01 {

    public static void main(String[] args) {
        Vehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        Vehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

}

class Vehicle {

    public void run(String vehicleName) {
        System.out.println(vehicleName + "正在运行");
    }
}

/**
 * 在陆地上运行
 */
class RoadVehicle extends Vehicle {
    @Override
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在公路上运行");
    }
}

/**
 * 在水中上运行
 */
class WaterVehicle extends Vehicle {
    @Override
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在水中运行");
    }
}

/**
 * 在空中上运行
 */
class AirVehicle extends Vehicle {
    @Override
    public void run(String vehicleName) {
        System.out.println(vehicleName + " 正在空中运行");
    }
}
