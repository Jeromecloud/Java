package com.cloud.dao;

import com.cloud.util.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionDaoImplement implements RegionDao {

    @Override
    public ResultSet query() throws SQLException {
        String sql = "select * from city";
        ResultSet rs = JDBCUtils.executeQuery(sql);
        System.out.println("DAO:数据库关闭，即将开始处理数据");
        return rs;
    }

    @Override
    public boolean add(String name) {
        String sql = "insert into city(name) values('" + name + "')";
        System.out.println("DAO:生成sql语句：" + sql + "\n准备执行sql语句,开始调用JDBC");
        return JDBCUtils.insert(sql);
    }

}
