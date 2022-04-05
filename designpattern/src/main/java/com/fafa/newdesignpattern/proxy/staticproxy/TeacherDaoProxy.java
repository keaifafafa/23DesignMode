package com.fafa.newdesignpattern.proxy.staticproxy;

/**
 * @author Sire
 * @version 1.0
 * @date 2022-04-05 17:20
 */
public class TeacherDaoProxy implements ITeacherDao {
    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacherDao.teach();
        System.out.println("提交。。。。。。");
    }
}
