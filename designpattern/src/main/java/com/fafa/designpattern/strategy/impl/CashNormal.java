package com.fafa.designpattern.strategy.impl;

import com.fafa.designpattern.strategy.CashSuper;

/**
 * 正常收取
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:16
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
