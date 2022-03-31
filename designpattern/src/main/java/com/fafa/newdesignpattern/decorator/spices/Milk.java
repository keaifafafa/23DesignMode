package com.fafa.newdesignpattern.decorator.spices;

import com.fafa.newdesignpattern.decorator.Decorator;
import com.fafa.newdesignpattern.decorator.Drink;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:58
 */
public class Milk extends Decorator {
    /**
     * 将 咖啡 聚合进来
     *
     * @param obj
     */
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(3.5f);
    }
}
