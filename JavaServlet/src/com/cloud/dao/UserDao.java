package com.cloud.dao;

import java.sql.SQLException;

public interface UserDao{
    boolean login(String user, String password) throws SQLException;
    boolean register(String user, String password) throws SQLException;
}
