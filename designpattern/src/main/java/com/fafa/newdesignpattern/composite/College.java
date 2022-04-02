package com.fafa.newdesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 *
 * @author Sire
 * @version 1.0
 * @date 2022-04-02 18:41
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
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
    protected void print() {
        System.out.println("---------------" + getName() + "----------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
