package com.fafa.newdesignpattern.adapter.classadapter;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 22:10
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取 220V电压
        int srcV = output220V();
        // 转成5V
        int dstV = srcV / 44;
        return dstV;
    }
}
