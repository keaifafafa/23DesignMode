package com.fafa.designpattern.proxy;

/**
 * 送礼物接口
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-10 18:26
 */
public interface IGiveGift {
    /**
     * 送娃娃
     */
    void GiveDolls();

    /**
     * 送鲜花
     */
    void GiveFlowers();

    /**
     * 送巧克力
     */
    void GiveChocolate();
}
