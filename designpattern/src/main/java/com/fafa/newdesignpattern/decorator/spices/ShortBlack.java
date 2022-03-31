package com.fafa.newdesignpattern.decorator.spices;

import com.fafa.newdesignpattern.decorator.Decorator;
import com.fafa.newdesignpattern.decorator.Drink;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 18:00
 */
public class ShortBlack extends Decorator {
    /**
     * 将 咖啡 聚合进来
     *
     * @param obj
     */
    public ShortBlack(Drink obj) {
        super(obj);
        setDes("短黑");
        setPrice(5.0f);
    }
}
