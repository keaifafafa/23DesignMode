package com.fafa.principle.Inversion;

/**
 * 依赖倒置原则
 * 未优化的版本
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-15 17:07
 */

public class DependencyInversion1 {
    public static void main(String[] args) {
        new Person().sendMessage(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello";
    }
}

class Person {
    public void sendMessage(Email email) {
        System.out.println(email.getInfo());
    }
}
