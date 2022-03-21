package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:15
 */
public class BJPeeperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨正在准备……");
    }
}
