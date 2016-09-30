package com.leonard.dao;

import com.leonard.db.DbUtil;
import com.leonard.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    //增
    public boolean addUser(User user) throws SQLException {
        //获取数据库连接
        Connection conn = DbUtil.getConnection();
        //sql
        String sql = "insert into user_table(userid,username,sex,age,birthday,email,phone)" +
                " values(?,?,?,?,?,?,?)";
        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql);
        //传参
        ptmt.setInt(1, user.getUserId());
        ptmt.setString(2, user.getUsername());
        ptmt.setString(3, user.getSex());
        ptmt.setInt(4, user.getAge());
        ptmt.setDate(5, (Date) user.getBirthday());
        ptmt.setString(6, user.getEmail());
        ptmt.setString(7, user.getPhone());
        //执行
        return ptmt.executeUpdate() > 0;
    }

    //查
    public List<User> findAll() throws SQLException {
        Connection conn = DbUtil.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select * from user_table";
        ResultSet rs = stmt.executeQuery(sql);

        List<User> users = new ArrayList<User>();
        User user;
        while (rs.next()) {
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUserId(rs.getInt("userId"));
            user.setUsername(rs.getString("username"));
            user.setSex(rs.getString("sex"));
            user.setAge(rs.getInt("age"));
            user.setBirthday(rs.getDate("birthday"));
            user.setEmail(rs.getString("email"));
            user.setPhone(rs.getString("phone"));
            users.add(user);
        }
        return users;
    }

    //改
    public boolean updateUser(User user, int id) throws SQLException {
        Connection conn = DbUtil.getConnection();
        String sql = "update user_table set " +
                "userid=?,username=?,sex=?,age=?,birthday=?,email=?,phone=? where userId=?";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, user.getUserId());
        ptmt.setString(2, user.getUsername());
        ptmt.setString(3, user.getSex());
        ptmt.setInt(4, user.getAge());
        ptmt.setDate(5, (Date) user.getBirthday());
        ptmt.setString(6, user.getEmail());
        ptmt.setString(7, user.getPhone());
        ptmt.setInt(8, id);

        return ptmt.executeUpdate() > 0;
    }

    //删
    public boolean deleteUser(int userId) throws SQLException {
        Connection conn = DbUtil.getConnection();
        String sql = "delete from user_table where userId=?";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, userId);

        return ptmt.executeUpdate() > 0;
    }
}
