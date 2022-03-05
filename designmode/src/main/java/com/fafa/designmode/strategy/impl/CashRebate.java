package com.fafa.designmode.strategy.impl;

import com.fafa.designmode.strategy.CashSuper;

/**
 * 打折收费
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:17
 */
public class CashRebate implements CashSuper {
    /**
     * 折扣数
     */
    private double moneyRebate = 1D;

    /**
     * 初始化
     *
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
