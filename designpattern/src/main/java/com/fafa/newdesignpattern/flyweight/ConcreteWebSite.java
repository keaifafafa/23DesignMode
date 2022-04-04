package com.fafa.newdesignpattern.flyweight;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-04 15:20
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 共享部分，内部状态
     *
     * @paramter type 网站发布的类型
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的类型是：" + type +
                " 在使用中…… 使用者是：" + user.getName());
    }
}
