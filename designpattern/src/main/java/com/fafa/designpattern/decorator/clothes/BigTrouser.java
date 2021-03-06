package com.fafa.designpattern.decorator.clothes;

import com.fafa.designpattern.decorator.Finery;

/**
 * 垮裤
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 23:06
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.println("垮裤");
        super.show();
    }
}
