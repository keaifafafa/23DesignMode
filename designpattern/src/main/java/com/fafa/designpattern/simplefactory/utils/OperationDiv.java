package com.fafa.designpattern.simplefactory.utils;

import com.fafa.designpattern.simplefactory.Operation;

/**
 * 除法
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:49
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if (0 == this.getNumberB()) {
            throw new RuntimeException("除数不能为0");
        }
        result = this.getNumberA() / this.getNumberB();
        return result;
    }
}
