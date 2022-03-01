package com.fafa.designmode.simplefactory;

import java.util.Scanner;

/**
 * 计算器客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:51
 */
public class CalculatorClient {
    public static void main(String[] args) {
        Operation operation = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A:");
        Double numA = sc.nextDouble();
        System.out.println("请输入运算符:");
        String operate = sc.next();
        System.out.println("请输入数字B:");
        Double numB = sc.nextDouble();
        operation = OperationFactory.createOperate(operate);
        operation.setNumberA(numA);
        operation.setNumberB(numB);
        try {
            System.out.println("运算结果为：" + operation.getResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
