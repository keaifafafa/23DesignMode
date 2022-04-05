package com.fafa.newdesignpattern.proxy.staticproxy;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 17:20
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("线上教学——>static");
    }
}
