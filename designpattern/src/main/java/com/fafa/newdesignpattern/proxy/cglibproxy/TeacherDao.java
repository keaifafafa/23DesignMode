package com.fafa.newdesignpattern.proxy.cglibproxy;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 21:18
 */
public class TeacherDao {

    public String teach() {
        System.out.println("老师授课中，我是Cglib代理，不需要实现接口");
        return "hello";
    }
}
