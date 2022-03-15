package com.fafa.designpattern.simplefactory.utils;

import com.fafa.designpattern.simplefactory.Operation;

/**
 * 乘法
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:49
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = this.getNumberA() * this.getNumberB();
        return result;
    }
}
