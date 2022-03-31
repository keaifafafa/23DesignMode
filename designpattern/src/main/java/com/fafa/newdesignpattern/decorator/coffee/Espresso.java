package com.fafa.newdesignpattern.decorator.coffee;

import com.fafa.newdesignpattern.decorator.Coffee;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:54
 */
public class Espresso extends Coffee {
    public Espresso() {
        setDes("意大利咖啡");
        setPrice(18.5f);
    }
}
