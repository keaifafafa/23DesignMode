package com.fafa.newdesignpattern.singleton.type6;

/**
 * 双重检查【推荐使用】
 * 延迟加载：效率较高
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 22:13
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("---双重检查---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private Singleton() {

    }

    /**
     * 重点
     * 被volatile修饰的变量能够保证每个线程能够获取该变量的最新值，从而避免出现数据脏读的现象。
     */
    private static volatile Singleton instance;

    /**
     * 加入双重代码检查，解决线程安全问题，同时解决懒加载问题
     * 同时保证了效率，推荐使用
     *
     * @return
     */
    public static Singleton getInstance() {
        if (null == instance) {
            // 同步代码块
            synchronized (Singleton.class) {
                // 由于 volatile 的作用，一旦有一个现成的instance被创建，那么 就不满足下面的 if 条件了
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

