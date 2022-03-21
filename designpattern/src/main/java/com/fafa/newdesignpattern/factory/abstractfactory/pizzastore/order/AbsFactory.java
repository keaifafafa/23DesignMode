package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.order;

import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * 抽象工厂类
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 22:25
 */
public interface AbsFactory {
    /**
     * 创建披萨
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType);
}
