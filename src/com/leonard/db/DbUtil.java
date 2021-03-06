package com.leonard.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/jdbcdemo?useUnicode=true&characterEncoding=UTF-8";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    private static Connection conn = null;

    static {
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
}
