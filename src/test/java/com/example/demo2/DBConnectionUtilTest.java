package com.example.demo2;

import com.hello.connection.DBConnectionUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

class DBConnectionUtilTest {

    @Test
    void getConnection() throws SQLException {
        Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
}