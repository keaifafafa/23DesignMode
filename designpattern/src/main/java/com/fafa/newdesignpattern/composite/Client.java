package com.fafa.newdesignpattern.composite;

import java.util.HashMap;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-02 18:26
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "顶尖高校");
        // 创建学院
        College college1 = new College("计算机与信息工程学院", "钱途无限");
        // 添加学科
        college1.add(new Department("软件工程", "软件工程很不错！！！"));
        college1.add(new Department("网络工程", "网络工程很不错！！！"));
        // 添加学院
        university.add(college1);
        // 打印
        university.print();

        new HashMap<>();

    }
}
