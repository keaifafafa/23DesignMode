package com.fafa.newdesignpattern.proxy.dynamicproxy;

/**
 * 动态代理目标
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 17:18
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        // 记得转型
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance = " + proxyInstance.getClass());
        proxyInstance.teach();
        proxyInstance.say();
    }
}
