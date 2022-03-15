package com.fafa.designpattern.strategy;

/**
 * 金额接口
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:13
 */
public interface CashSuper {
    /**
     * 收取金额
     *
     * @param money
     * @return
     */
    double acceptCash(double money);
}
