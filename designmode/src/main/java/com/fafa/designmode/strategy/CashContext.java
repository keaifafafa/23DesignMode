package com.fafa.designmode.strategy;

import com.fafa.designmode.strategy.impl.CashNormal;
import com.fafa.designmode.strategy.impl.CashRebate;
import com.fafa.designmode.strategy.impl.CashReturn;

/**
 * 策略配置
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-05 18:29
 */
public class CashContext {

    private CashSuper cashSuper;

    /**
     * 注意这里是 策略模式 和 简单工厂模式的结合使用
     * 其实这一层原来是写在了客户端的，所以运用结合的方式，将其降低到这一层
     *
     * @param type 收费类型
     */
    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }

    /**
     * 获取结果
     *
     * @param money
     * @return
     */
    public double GetResult(double money) {
        double result = cashSuper.acceptCash(money);
        return result;
    }
}
