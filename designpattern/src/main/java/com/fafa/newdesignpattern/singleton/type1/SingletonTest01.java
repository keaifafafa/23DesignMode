package com.fafa.newdesignpattern.singleton.type1;

/**
 * 饿汉式【静态常量】
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 20:18
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("---饿汉式单例模式01，线程安全---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 优点： 在类装载的时候就已经完成实例化了，避免了线程同步的问题
 * 缺点： 这种虽然可用，但是会造成资源的浪费，因为没有实现 ==懒加载==
 */
class Singleton {
    /**
     * 不允许外部new
     */
    private Singleton() {
    }

    /**
     * 本类内部创建对象实例
     */
    public final static Singleton instance = new Singleton();

    /**
     * 提供一个公用的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
