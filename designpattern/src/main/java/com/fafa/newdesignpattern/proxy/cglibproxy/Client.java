package com.fafa.newdesignpattern.proxy.cglibproxy;

/**
 * Cglib代理模式
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 21:10
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        String res = proxyInstance.teach();
        System.out.println("res = " + res);
    }
}
