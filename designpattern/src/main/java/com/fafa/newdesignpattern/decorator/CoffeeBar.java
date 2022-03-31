package com.fafa.newdesignpattern.decorator;

import com.fafa.newdesignpattern.decorator.coffee.DefCoffee;
import com.fafa.newdesignpattern.decorator.spices.Chocolate;
import com.fafa.newdesignpattern.decorator.spices.Milk;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:40
 */
public class CoffeeBar {
    public static void main(String[] args) {
        /**
         * 订单一： 2 份巧克力 + 一份牛奶的 DefCoffee
         *
         */
        // 1、点一份 DefCoffee
        Drink order = new DefCoffee();
        System.out.println("费用：" + order.getPrice());
        System.out.println("描述：" + order.getDes());
        // 2、加入一份牛奶
        order = new Milk(order);
        System.out.println("费用：" + order.cost());
        System.out.println("描述：" + order.getDes());
        // 3、加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用：" + order.cost());
        System.out.println("描述：" + order.getDes());
        // 4、在加入一份巧克力
        order = new Chocolate(order);
        System.out.println("费用：" + order.cost());
        System.out.println("描述：" + order.getDes());

        System.out.println("=============================================");
    }
}
