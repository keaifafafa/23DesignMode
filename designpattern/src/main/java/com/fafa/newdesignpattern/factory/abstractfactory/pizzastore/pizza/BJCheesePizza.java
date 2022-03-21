package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:14
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨正在准备.....");
    }
}
