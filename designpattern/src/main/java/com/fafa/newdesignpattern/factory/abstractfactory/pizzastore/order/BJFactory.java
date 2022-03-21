package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.order;

import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.BJPeeperPizza;
import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 22:26
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPeeperPizza();
        }
        return pizza;
    }
}
