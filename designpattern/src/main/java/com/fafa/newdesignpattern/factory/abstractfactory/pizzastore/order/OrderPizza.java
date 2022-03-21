package com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.order;

import com.fafa.newdesignpattern.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-20 22:33
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        // 用户输入的
        String orderType;
        do {
            orderType = getType();
            // 抽象方法，有工厂子类完成
            pizza = factory.createPizza(orderType);
            if (null != pizza) {
                pizza.prepare();
                System.out.println(pizza.getName() + "订购成功");
                pizza.bake();
                pizza.cut();
                pizza.pack();
            } else {
                System.out.println("订购失败");
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
