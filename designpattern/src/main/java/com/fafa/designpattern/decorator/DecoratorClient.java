package com.fafa.designpattern.decorator;

import com.fafa.designpattern.decorator.clothes.BigTrouser;
import com.fafa.designpattern.decorator.clothes.Sneakers;
import com.fafa.designpattern.decorator.clothes.TShirts;
import com.fafa.designpattern.decorator.clothes.Tie;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-08 23:26
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Person person = new Person("可爱发");
        System.out.println("第一种装扮");
        // 装饰对象【这里使用递归实现的】
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        Tie tie = new Tie();

        // 装饰过程【顺序很重要】
        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tShirts.Decorate(bigTrouser);
        tie.Decorate(tShirts);
        // 展示
        tie.show();
    }
}
