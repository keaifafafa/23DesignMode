package com.fafa.newdesignpattern.prototype.deepclone;

/**
 * 客户端
 *
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 16:51
 */
public class Client {
    public static void main(String[] args) {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneAbleTarget = new DeepCloneAbleTarget("大牛", "小牛");
        /** 方式一：重写Cloneable接口的clone方法 **/
        try {
            DeepProtoType clone = (DeepProtoType) p.clone();
            System.out.println("p.name = " + p.name + "| p.deepCloneAbleTarget = " + p.deepCloneAbleTarget.hashCode());
            System.out.println("clone.name = " + clone.name + "| clone.deepCloneAbleTarget = " + clone.deepCloneAbleTarget.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        /** 方式二： 使用序列化来完成【推荐】**/
        DeepProtoType serClone = (DeepProtoType) p.deepClone();
        System.out.println("p.name = " + p.name + "| p.deepCloneAbleTarget = " + p.deepCloneAbleTarget.hashCode());
        System.out.println("serClone.name = " + serClone.name + "| serClone.deepCloneAbleTarget = " + serClone.deepCloneAbleTarget.hashCode());
    }
}
