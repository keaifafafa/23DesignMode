package com.fafa.newdesignpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂，根据需要返回一个网站
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-04 15:23
 */
public class WebSiteFactory {
    /**
     * 缓冲池
     */
    private Map<String, WebSite> cachePool = new HashMap<String, WebSite>();

    /**
     * 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入缓冲池中，并返回
     */
    public WebSite getWebSiteCategory(String type) {
        // 如果不存在相同类型的网站
        if (!cachePool.containsKey(type)) {
            cachePool.put(type, new ConcreteWebSite(type));
        }
        // 如果存在的话，就直接更改用户即可！
        // 返回，注意转型
        return (WebSite) cachePool.get(type);
    }

    /**
     * 获取网站分类的总数【池中有多少个网站类型】
     * @return
     */
    public int getWebSiteCount () {
        return cachePool.size();
    }
}
