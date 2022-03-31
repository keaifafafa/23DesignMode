package com.fafa.newdesignpattern.decorator;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:39
 */
public class Coffee extends Drink {
    @Override
    float cost() {
        return super.getPrice();
    }
}
