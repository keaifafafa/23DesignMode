package com.fafa.designmode.decorator;

/**
 * 装饰类
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 23:00
 */
public class Finery extends Person {

    protected Person component;

    /**
     * 打扮
     *
     * @param component
     */
    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (null != component) {
            component.show();
        }
    }
}
