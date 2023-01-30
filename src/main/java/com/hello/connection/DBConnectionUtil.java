package com.hello.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class DBConnectionUtil {
    public static Connection getConnection() {
        try{
            Class.forName(ConnectionConst.DRIVER);
            log.info("ConnectionConst.URL = {}", ConnectionConst.URL);
            return DriverManager.getConnection(ConnectionConst.URL, ConnectionConst.USERNAME, ConnectionConst.PASSWORD);
        } catch (SQLException e){
            throw new IllegalStateException("get connection");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
