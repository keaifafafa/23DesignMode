package com.fafa.newdesignpattern.singleton.type4;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 20:53
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("---懒汉式单例模式02，线程安全---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 懒汉式【线程安全，同步方法】
 * 但是这种效率太低了，执行 getInstance() 方法都要进行同步，而其实这个方法只执行一次实例化就够了
 * 后面的想要获得该类实例，直接return就行了，方法进行同步效率太低
 * 所以在实际开发中，也不建议使用这种
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 添加一个同步锁
     *
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}