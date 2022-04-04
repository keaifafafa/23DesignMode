package com.fafa.newdesignpattern.flyweight;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-04 15:19
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        // 需求一： 客户需要一个以新闻形式发布的网站
        WebSite news = webSiteFactory.getWebSiteCategory("新闻");
        news.use(new User("Alan"));

        // 需求二： 客户需要一个以博客形式发布的网站
        WebSite blog1 = webSiteFactory.getWebSiteCategory("博客");
        blog1.use(new User("Bob"));

        // 需求三： 客户需要一个以博客形式发布的网站
        WebSite blog2 = webSiteFactory.getWebSiteCategory("博客");
        blog2.use(new User("Smith"));

        System.out.println("网站类型总数为：" + webSiteFactory.getWebSiteCount());
    }
}
