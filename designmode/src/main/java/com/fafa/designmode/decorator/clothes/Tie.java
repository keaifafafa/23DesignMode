package com.fafa.designmode.decorator.clothes;

import com.fafa.designmode.decorator.Finery;


/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-09 0:16
 */
public class Tie extends Finery {
    @Override
    public void show() {
        System.out.println("打领带");
        super.show();
    }
}
