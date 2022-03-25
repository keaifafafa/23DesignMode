package com.fafa.newdesignpattern.bridge;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:20
 */
public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机【样式 + 品牌】
        Phone foldedPhone = new FoldedPhone(new HUAWEI());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        System.out.println("==================================");

        // 获取 直立样式手机
        Phone upRightPhone = new UpRightPhone(new iPhone());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }
}
