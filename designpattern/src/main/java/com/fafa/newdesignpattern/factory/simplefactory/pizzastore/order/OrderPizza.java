package com.fafa.newdesignpattern.factory.simplefactory.pizzastore.order;

import com.fafa.newdesignpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.awt.image.BufferedImage;
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
public class OrderPizza {
    SimpleFactory simpleFactory = null;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setType(simpleFactory);
    }

    public void setType(SimpleFactory simpleFactory) {
        // 用户输入的
        String orderType;
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (null != pizza) {
                System.out.println(pizza.getName() + "订购成功");
                pizza.prepare();
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
