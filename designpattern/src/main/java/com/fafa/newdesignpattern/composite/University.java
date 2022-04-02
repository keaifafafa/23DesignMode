package com.fafa.newdesignpattern.composite;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-02 18:33
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
        System.out.println("---------------" + getName() + "----------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            // 打印
            organizationComponent.print();
        }
    }
}
