package com.leonard.dao;

import com.leonard.model.User;
import org.junit.Test;


import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoTest {
    @Test
    public void deleteUser() throws Exception {
        UserDao dao = new UserDao();
        //新增一个测试user,测试删除userId=100的user
        User user = new User(100, "新", "男", 22, Date.valueOf("2007-12-25"), "123@qq.com", "18829078216");
        dao.addUser(user);

        assertTrue(dao.deleteUser(100));
    }

    @Test
    public void updateUser() throws Exception {
        UserDao dao = new UserDao();
        //新增一个测试user,测试更新
        User user = new User(100, "新", "男", 22, Date.valueOf("2007-12-25"), "123@qq.com", "18829078216");
        dao.addUser(user);
        User updateUser = new User(2, "更新", "女", 10, Date.valueOf("2000-12-25"), "110@qq.com", "11111111111");

        assertTrue(dao.updateUser(updateUser, 100));
    }

    @Test
    public void findAll() throws Exception {
        UserDao dao = new UserDao();
        List<User> users = dao.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void addUser() throws Exception {
        UserDao dao = new UserDao();
        User user = new User(1, "新1", "男", 22, Date.valueOf("2007-12-25"), "123@qq.com", "18829078216");
        assertTrue(dao.addUser(user));
    }

}