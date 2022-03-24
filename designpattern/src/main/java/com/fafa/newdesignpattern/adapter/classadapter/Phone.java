package com.fafa.newdesignpattern.adapter.classadapter;

/**
 * 电话
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 21:56
 */
public class Phone {
    public static int five = 5;

    /**
     * 充电
     *
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == five) {
            System.out.println("电压为5V，可以充电~");
        } else if (iVoltage5V.output5V() > five) {
            System.out.println("电压大于5V,不能充电~");
        }
    }
}
