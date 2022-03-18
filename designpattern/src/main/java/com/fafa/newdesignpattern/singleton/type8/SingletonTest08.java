package com.fafa.newdesignpattern.singleton.type8;

/**
 * 枚举
 * <p>
 * 极其推荐使用
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-18 21:20
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("---使用枚举---");
        Singleton singleton1 = Singleton.SINGLETON;
        Singleton singleton2 = Singleton.SINGLETON;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayOK();
        singleton2.sayOK();
    }

}

/**
 * 不仅能避免多线程问题，还可以防止反序列化重新创建新的对象
 */
enum Singleton {
    // 属性
    SINGLETON;

    public void sayOK() {
        System.out.println("Ok~");
    }
}
