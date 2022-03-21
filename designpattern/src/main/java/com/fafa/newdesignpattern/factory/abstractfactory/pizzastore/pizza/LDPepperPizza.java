package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:17
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨正在准备……");
    }
}
