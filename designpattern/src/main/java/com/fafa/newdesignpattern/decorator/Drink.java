package com.fafa.newdesignpattern.decorator;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-30 17:38
 */
public abstract class Drink {
    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用的抽象方法
     *
     * @return
     */
    abstract float cost();
}
