package com.fafa.newdesignpattern.factory.factorymethod.pizzastore.order;

import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.BJPeeperPizza;
import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:11
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new BJPeeperPizza();
            pizza.setName("北京胡椒披萨");
        }
        return pizza;
    }
}
