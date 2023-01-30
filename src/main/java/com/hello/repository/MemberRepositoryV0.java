package com.hello.repository;

import com.hello.connection.DBConnectionUtil;
import com.hello.domain.Member;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class MemberRepositoryV0 {
    public Member save(Member member) throws SQLException {
        String sql = "insert into member(member_id,money) values(?, ?)";
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try{
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,member.getMemberId());
            pstmt.setInt(2,member.getMoney());
            return member;
        }catch (SQLException e){
            log.error("db error",e);
            throw e;
        } finally {
            close(con, pstmt, rs);
        }
    }
    private void close(Connection con, Statement stmt, ResultSet rs){
        if(rs !=null){
            try{
                rs.close();
            }catch (SQLException e){
                log.info("rs e = {}", e);
            }
        }

        if(stmt != null){
            try{
                stmt.close();
            }catch (SQLException e){
                log.info("stmt e = {}", e);
            }
        }
        if(con!= null){
            try{
                con.close();
            }catch(SQLException e){
                log.info("con e = {}", e);
            }
        }
    }

    private static Connection getConnection() throws SQLException {
        return DBConnectionUtil.getConnection();
    }
}
