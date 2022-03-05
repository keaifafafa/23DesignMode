package com.fafa.designmode.strategy.impl;

import com.fafa.designmode.strategy.CashSuper;

/**
 * 返利收费
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:23
 */
public class CashReturn implements CashSuper {
    /**
     * 返利需要达到的金额
     */
    private double moneyCondition = 0.0D;
    /**
     * 返利金额
     */
    private double moneyReturn = 0.0D;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            // 注意这里按照倍数进行的返利
            // 【Java Math.floor() 方法可对一个数进行下舍入，返回给定参数最大的整数，简称 地板取整】
            money -= Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
