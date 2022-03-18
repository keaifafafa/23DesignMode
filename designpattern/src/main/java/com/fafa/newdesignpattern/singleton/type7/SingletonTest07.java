package com.fafa.newdesignpattern.singleton.type7;

/**
 * 静态内部类
 * 线程安全，实现了懒加载，效率高
 * 【推荐使用】
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 22:50
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("---静态内部类---");
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
     * 静态内部类
     * 这种方式采用了类装载的机制来保证初始化实例只有一个线程
     * 静态内部类子啊Singleton类被加载时不会被立即实例化，而是在需要实例化时，才去调用getInstance(),才会装载 SingletonInstance
     * 而且静态属性只会在第一次加载类的时候初始化，在这里JVM帮助我们保证了线程的安全【因为类进行初始化时，别的线程进不来】
     */
    private static class SingletonInstance {
        private static Singleton instance = new Singleton();
    }

    /**
     * 调用静态内部类
     *
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}




