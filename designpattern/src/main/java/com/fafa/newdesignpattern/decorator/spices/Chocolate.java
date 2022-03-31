package com.fafa.newdesignpattern.decorator.spices;

import com.fafa.newdesignpattern.decorator.Decorator;
import com.fafa.newdesignpattern.decorator.Drink;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:37
 */
public class Chocolate extends Decorator {
    /**
     * 将 咖啡 聚合进来
     *
     * @param obj
     */
    public Chocolate(Drink obj) {
        // 传给父类 即 Decorator
        super(obj);
        // 设置属性
        setDes("巧克力");
        setPrice(3.0f);
    }
}
