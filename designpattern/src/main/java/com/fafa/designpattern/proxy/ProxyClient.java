package com.fafa.designpattern.proxy;

import com.fafa.designpattern.proxy.impl.Proxy;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-10 18:37
 */
public class ProxyClient {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("娇娇");

        Proxy proxy = new Proxy(mm);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();
    }
}
