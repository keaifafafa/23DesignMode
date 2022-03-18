package com.fafa.newdesignpattern.singleton.type3;

/**
 * 懒汉式【线程不安全】
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 20:37
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("---懒汉式单例模式01，线程不安全---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 优点： 起到了懒加载的作用，但是只能在单线程下使用
 * 缺点： 多线程下可能会产生多个对象，因为可能多个线程同时操作 new Singleton
 * 所以实际开发中，不要使用这种
 */
class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    /**
     * 提供一个静态的公有方法，当时用到该方法时，才去创建instance
     * 即懒汉式
     *
     * @return
     */
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}
