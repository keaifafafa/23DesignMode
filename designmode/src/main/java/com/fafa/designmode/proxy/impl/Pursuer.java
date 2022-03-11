package com.fafa.designmode.proxy.impl;

import com.fafa.designmode.proxy.IGiveGift;
import com.fafa.designmode.proxy.SchoolGirl;

/**
 * 追求者
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-10 18:28
 */
public class Pursuer implements IGiveGift {
    /**
     * 被追求者
     */
    SchoolGirl mm;

    public Pursuer(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println("送给" + mm.getName() + "洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("送给" + mm.getName() + "鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("送给" + mm.getName() + "巧克力");
    }
}
