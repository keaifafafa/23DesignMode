package com.fafa.newdesignpattern.flyweight.jdk;

/**
 * 分析Integer中用到的享元模式
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-04 16:32
 */
public class TestInteger {
    public static void main(String[] args) {
        /**
         * 1、Integer.valueOf 支持的取值范围为 【-128 ~ 127】，不在此区间就不会用享元模式
         * 2、在valueOf方法中，先判断值是否在IntegerCache 中，如果不在，就创建新的 Integer(new)，否则，就直接从缓存池返回
         * 3、如果使用valueOf方法得到一个Integer实例，范围在-128- 127，执行速度比 new 快
         */
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);

        // true 这里是单纯的值对比
        System.out.println(x.equals(y));
        // false 没用享元模式，是两个对象【两个不同的内存空间】
        System.out.println(x == y);
        // true 这里就用到了享元模式
        System.out.println(x == z);
        // false 没用享元模式，是两个对象【两个不同的内存空间】
        System.out.println(w == x);
        // false 没用享元模式，是两个对象【两个不同的内存空间】
        System.out.println(w == y);

        // 超过取值区间
        Integer integer1 = Integer.valueOf(128);
        Integer integer2 = Integer.valueOf(128);
        // false , 因为不在享元模式的作用区间
        System.out.println("integer1 == integer2 : " + (integer1 == integer2));

    }
}
