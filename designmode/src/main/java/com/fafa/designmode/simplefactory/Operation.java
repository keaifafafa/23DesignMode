package com.fafa.designmode.simplefactory;

/**
 * 简易计算器（简单工厂模式）
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:31
 */
public class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
