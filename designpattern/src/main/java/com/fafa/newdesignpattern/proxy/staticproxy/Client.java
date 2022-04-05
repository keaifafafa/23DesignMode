package com.fafa.newdesignpattern.proxy.staticproxy;

/**
 * 静态代理目标
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 17:18
 */
public class Client {
    /**
     * 优点：在不修改目标对象的功能的前提下，能够通过代理对象目标功能扩展
     * 缺点：由于代理对象与目标对象实现了一样的接口，所以会有很多代理类，一旦接口增加方法，目标对象与代理对象都要维护
     *
     * @param args
     */
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        // 创建代理，同时将代理对象传递给代理对象
        ITeacherDao teacherDaoProxy = new TeacherDaoProxy(target);
        teacherDaoProxy.teach();
    }
}
