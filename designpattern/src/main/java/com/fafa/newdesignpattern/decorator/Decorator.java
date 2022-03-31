package com.fafa.newdesignpattern.decorator;

/**
 * 装饰者
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:37
 */
public class Decorator extends Drink {

    private Drink obj;

    /**
     * 将 咖啡 聚合进来
     *
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    float cost() {
        // 自己的价格 + 传入coffee的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被修饰者的信息【这一步是递归的关键】
        return des + " " + super.getPrice() + " && " + obj.getDes();
    }
}
