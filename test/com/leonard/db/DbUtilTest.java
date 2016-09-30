package com.leonard.db;

import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class DbUtilTest {
    @Test
    public void getConnection() throws Exception {
        Connection conn = DbUtil.getConnection();
        System.out.println(String.valueOf(conn)+",Connect success!");
    }

}