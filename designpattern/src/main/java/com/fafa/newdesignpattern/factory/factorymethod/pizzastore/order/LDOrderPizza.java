package com.fafa.newdesignpattern.factory.factorymethod.pizzastore.order;

import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 21:18
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        }
        return pizza;
    }
}
