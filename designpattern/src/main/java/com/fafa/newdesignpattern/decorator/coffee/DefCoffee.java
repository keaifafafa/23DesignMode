package com.fafa.newdesignpattern.decorator.coffee;

import com.fafa.newdesignpattern.decorator.Coffee;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:50
 */
public class DefCoffee extends Coffee {
    public DefCoffee() {
        setDes(" 无因咖啡");
        setPrice(15.0f);
    }
}
