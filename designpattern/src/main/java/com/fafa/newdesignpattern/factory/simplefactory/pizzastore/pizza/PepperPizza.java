package com.fafa.newdesignpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-19 21:56
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(getName() + "正在准备材料");
    }
}
