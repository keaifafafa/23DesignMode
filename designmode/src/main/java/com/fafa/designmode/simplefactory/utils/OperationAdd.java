package com.fafa.designmode.simplefactory.utils;

import com.fafa.designmode.simplefactory.Operation;

/**
 * 加法
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:35
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() + this.getNumberB();
        return result;
    }
}
