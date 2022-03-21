package com.fafa.newdesignpattern.prototype.deepclone;

import java.io.*;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-03-21 16:43
 */
public class DeepProtoType implements Serializable, Cloneable {
    /**
     * String 属性
     */
    public String name;
    /**
     * 引用类型
     */
    public DeepCloneAbleTarget deepCloneAbleTarget;

    public DeepProtoType() {
        super();
    }

    /**
     * 深拷贝 - 方式 1 使用clone 方法【不建议使用】
     **/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 首先完成对基本类型的拷贝【因为他们不会去进行引用指向】
        deep = super.clone();
        // 然后对引用类型的属性，进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneAbleTarget =
                (DeepCloneAbleTarget) deepCloneAbleTarget.clone();
        return deepProtoType;
    }

    /**
     * 深拷贝 — 方式2 使用序列化实现【推荐使用】
     **/
    public Object deepClone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            // 创建对象
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }

    }
}
