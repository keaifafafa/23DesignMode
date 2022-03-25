package com.fafa.newdesignpattern.bridge;

/**
 * 品牌
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-25 21:06
 */
public interface Brand {
    /**
     * 打开方法
     */
    void open();

    /**
     * 关闭方式
     */
    void close();

    /**
     * 呼叫方式
     */
    void call();

}
