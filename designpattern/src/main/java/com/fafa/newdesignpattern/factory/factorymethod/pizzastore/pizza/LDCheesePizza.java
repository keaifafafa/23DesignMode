package com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:16
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("伦敦奶酪披萨正在准备……");
    }
}
