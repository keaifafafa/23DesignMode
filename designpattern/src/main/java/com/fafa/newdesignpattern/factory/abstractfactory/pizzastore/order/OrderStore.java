package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.order;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 22:39
 */
public class OrderStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
