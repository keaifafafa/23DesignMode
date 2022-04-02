package com.fafa.test;

/**
 * Java是值传递
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-01 22:55
 */
public class ParameterPassingTest {
    int a;

    public static void _swap(ParameterPassingTest test1, ParameterPassingTest test2) {
        // 此种方法 交换两个数 不使用中间变量
        ParameterPassingTest temp = test1;
        test1 = test2;
        test2 = temp;

        System.out.println("_swap  test1.a: " + test1.a + ",test2.a: " + test2.a);
    }

    public static void main(String[] args) {
        ParameterPassingTest test1 = new ParameterPassingTest();
        test1.a = 1;
        ParameterPassingTest test2 = new ParameterPassingTest();
        test2.a = 2;
        _swap(test1, test2);
        System.out.println("main   test1.a: " + test1.a + ",test2.a: " + test2.a);
    }

}