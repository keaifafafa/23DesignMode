package com.fafa.principle.Inversion.improve;

/**
 * 依赖倒置原则
 * 优化的版本
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-15 17:07
 */

public class DependencyInversion1 {
    public static void main(String[] args) {
        new Person().sendMessage(new Email());
        new Person().sendMessage(new WeChat());
    }
}

/**
 * 依赖接口
 */
interface IReceiver {
    /**
     * 分解出一个公用的方法
     *
     * @return
     */
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：hello";
    }
}

class WeChat implements IReceiver {
    @Override
    public String getInfo() {
        return "微信信息：hello";
    }
}

class Person {
    /**
     * 发送信息
     *
     * @param iReceiver
     */
    public void sendMessage(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
