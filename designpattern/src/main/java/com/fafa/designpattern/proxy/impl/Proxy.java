package com.fafa.designpattern.proxy.impl;

import com.fafa.designpattern.proxy.IGiveGift;
import com.fafa.designpattern.proxy.SchoolGirl;

/**
 * 代理
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-10 18:31
 */
public class Proxy implements IGiveGift {
    Pursuer pursuer;

    public Proxy(SchoolGirl mm) {
        // 这里很精妙
        pursuer = new Pursuer(mm);
    }

    @Override
    public void GiveDolls() {
        pursuer.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuer.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuer.GiveChocolate();
    }
}
