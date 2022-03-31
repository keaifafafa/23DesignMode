package com.fafa.newdesignpattern.decorator.spices;

import com.fafa.newdesignpattern.decorator.Decorator;
import com.fafa.newdesignpattern.decorator.Drink;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 18:01
 */
public class Soy extends Decorator {
    /**
     * 将 咖啡 聚合进来
     *
     * @param obj
     */
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(2.0f);
    }
}
