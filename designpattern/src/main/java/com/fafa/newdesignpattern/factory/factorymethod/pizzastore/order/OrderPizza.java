package com.fafa.newdesignpattern.factory.factorymethod.pizzastore.order;

import com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购披萨
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-19 21:57
 */
public abstract class OrderPizza {
    /**
     * 创建不同披萨的方法
     *
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        // 用户输入的
        String orderType;
        do {
            orderType = getType();
            // 抽象方法，有工厂子类完成
            pizza = createPizza(orderType);
            if (null != pizza) {
                System.out.println(pizza.getName() + "订购成功");
                pizza.bake();
                pizza.cut();
                pizza.pack();
            } else {
                System.out.println(pizza.getName() + "订购失败");
            }
        } while (true);
    }

    /**
     * 获取用户输入的披萨类型
     *
     * @return
     */
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入您需要的披萨类型：");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
