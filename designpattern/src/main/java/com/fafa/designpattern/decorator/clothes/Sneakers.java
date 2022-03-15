package com.fafa.designpattern.decorator.clothes;

import com.fafa.designpattern.decorator.Finery;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 23:22
 */
public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.println("破球鞋");
        super.show();
    }
}
