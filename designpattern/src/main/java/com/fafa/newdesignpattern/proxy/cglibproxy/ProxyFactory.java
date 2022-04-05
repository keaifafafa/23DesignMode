package com.fafa.newdesignpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 21:39
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 维护一个目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1、创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2、设置父类
        enhancer.setSuperclass(target.getClass());
        // 3、设置回调函数
        enhancer.setCallback(this);
        // 4、创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写 intercept 方法， 会调用目标对象的方法
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return 与代理方法的签名兼容的任何值。返回void的方法将忽略此值。
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式，开始！！！");
        /*
          target: 调用底层方法的对象
          objects: 用于方法调用的参数
         */
        Object returnVal = method.invoke(target, objects);
        System.out.println("Cglib代理模式，提交！！！");
        return returnVal;
    }
}
