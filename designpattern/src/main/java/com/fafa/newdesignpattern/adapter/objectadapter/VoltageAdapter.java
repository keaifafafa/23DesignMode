package com.fafa.newdesignpattern.adapter.objectadapter;


/**
 * 适配器
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-23 22:10
 */
public class VoltageAdapter implements IVoltage5V {

    /**
     * 关联关系——聚合【通过传参获得的】
     */
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        // 判断传入电压是否为空
        if (null != voltage220V) {
            // 获取220V电压
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~");
            // 转成 5V
            dst = srcV / 44;
            System.out.println("适配完成，输出的电压为 = " + dst);
        }
        return dst;
    }
}
