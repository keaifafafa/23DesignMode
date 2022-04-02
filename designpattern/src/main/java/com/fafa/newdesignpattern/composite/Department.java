package com.fafa.newdesignpattern.composite;

/**
 * 专业
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-02 18:39
 */
public class Department extends OrganizationComponent {
    // 无集合

    public Department(String name, String des) {
        super(name, des);
    }

    /**
     * add 和 remove 不用写，因为这是叶子节点
     *
     * @param organizationComponent
     */
    @Override
    void add(OrganizationComponent organizationComponent) {

    }

    @Override
    void remove(OrganizationComponent organizationComponent) {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
