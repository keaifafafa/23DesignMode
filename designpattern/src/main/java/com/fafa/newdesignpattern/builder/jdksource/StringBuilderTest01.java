package com.fafa.newdesignpattern.builder.jdksource;

/**
 * 测试 JDK 中的 建造者模式
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-22 22:16
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        /**
         * 需要注意 StringBuilder 是线程不安全的，适合单线程应用
         */
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(stringBuilder);
    }
}
