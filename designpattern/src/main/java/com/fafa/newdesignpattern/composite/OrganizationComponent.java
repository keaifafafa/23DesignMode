package com.fafa.newdesignpattern.composite;

/**
 * 组织组件
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-02 18:28
 */
public abstract class OrganizationComponent {
    /**
     * 名字
     */
    private String name;
    /**
     * 描述
     */
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    abstract void add(OrganizationComponent organizationComponent);

    abstract void remove(OrganizationComponent organizationComponent);

    protected abstract  void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
