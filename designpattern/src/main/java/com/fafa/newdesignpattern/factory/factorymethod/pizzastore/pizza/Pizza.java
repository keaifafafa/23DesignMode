package com.fafa.newdesignpattern.factory.factorymethod.pizzastore.pizza;

/**
 * 抽象的披萨类
 * 抽象是对类的抽象，接口是对方法的抽象
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-19 21:45
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking……");
    }

    public void cut() {
        System.out.println(name + "cutting……");
    }

    public void pack() {
        System.out.println(name + "boxing……");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
