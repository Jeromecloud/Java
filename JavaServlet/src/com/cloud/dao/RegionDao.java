package com.cloud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RegionDao {
    ResultSet query() throws SQLException;
    boolean add(String name);
}
