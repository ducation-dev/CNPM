package com.example.qltv.Datamanagement;

import com.example.qltv.SQLmanagement.SQLmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Logins {
    private String user;
    private String pass;

    public Logins() {
        user = "";
        pass = "";
    }

    ;

    public Logins(String user, String pass) {
        this.user = user;
        this.pass = pass; 
    }


    public static Logins getuserlist(String user, String pass) throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        Logins login = new Logins();
        Statement statement = connection.createStatement();// Tạo đối tượng Statement.
        String sql = "SELECT * FROM LOGINS WHERE ID = '" + user + "' AND PASSUSERS = '" + pass + "'";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet. // Mọi kết quả trả về sẽ được lưu trong ResultSet
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            login = new Logins(
                    rs.getString("ID").trim(),
                    rs.getString("PASSUSERS"));// Đọc dữ liệu từ ResultSet

        }
        statement.close();
        connection.close();// Đóng kết nối
        return login;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

