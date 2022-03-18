package com.fafa.newdesignpattern.singleton.type2;

/**
 * 饿汉式【静态代码块】
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-17 20:30
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println("---饿汉式单例模式02，线程安全---");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 结果返回 true， 说明两个对象是同一个【地址相同】
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

/**
 * 其实和静态常量的方式很类似
 * 同样可能造成内存的浪费
 */
class Singleton {
    /**
     * 不允许外部new
     */
    private Singleton() {
    }

    public final static Singleton instance;

    static {
        instance = new Singleton();
    }

    /**
     * 提供一个公用的静态方法，返回实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
