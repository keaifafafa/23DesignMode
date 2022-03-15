package com.fafa.designpattern.strategy;

/**
 * 收费客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:21
 */
public class CashClient {
    public static void main(String[] args) {
        double money = 1900D;
//        String type = "正常收费";
//        String type = "打8折";
        String type = "满300返100";
        CashContext cashContext = new CashContext(type);
        double result = cashContext.GetResult(money);
        System.out.println("应收：" + result);
    }
}
