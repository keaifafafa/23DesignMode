package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.order;

import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 22:30
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("peeper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
