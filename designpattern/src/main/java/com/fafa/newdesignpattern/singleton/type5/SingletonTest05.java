package com.fafa.newdesignpattern.singleton.type5;

/**
 * 懒汉式【线程安全，同步代码块】
 * 不能使用【很不安全，本意是好的，但是效果却很差】
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 21:50
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("---懒汉式单例模式03，线程不安全---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 懒汉式【线程不安全，同步代码块】
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // 加入两个线程同时进入了 if 语句，那么就会产生多个实例
        if (null == instance) {
            // 同步代码块 其实这里写了这个基本没有任何作用【不安全】
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
