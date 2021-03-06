package com.fafa.designpattern.simplefactory;

import com.fafa.designpattern.simplefactory.utils.OperationAdd;
import com.fafa.designpattern.simplefactory.utils.OperationDiv;
import com.fafa.designpattern.simplefactory.utils.OperationMul;
import com.fafa.designpattern.simplefactory.utils.OperationSub;

/**
 * 工厂类
 *
 * @author Sire
 * @version 1.0
 * @date 2022-02-28 23:42
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}