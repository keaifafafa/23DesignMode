package com.fafa.designpattern.decorator.clothes;

import com.fafa.designpattern.decorator.Finery;

/**
 * 大T恤
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 23:02
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.println("大T恤");
        super.show();
    }
}
