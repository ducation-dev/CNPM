package com.example.qltv.Datamanagement;

import com.example.qltv.SQLmanagement.SQLmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Logins {
    private String ID;
    private String Passwords;

    public Logins(){
        ID = "";
        Passwords = "";
    };

    public Logins(String ID, String passwords) {
        this.ID = ID;
        Passwords = passwords;
    }

    public static ArrayList<Logins> getIDlist() throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        ArrayList<Logins> list = new ArrayList<>();
        Statement statement = connection.createStatement();// Tạo đối tượng Statement.
        String sql = "select * from Logins"; //where ID = '"+ID + " ' and Passwords = '"+passwords + "' ";
        // Thực thi câu lệnh SQL trả về đối tượng ResultSet. // Mọi kết quả trả về sẽ được lưu trong ResultSet
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            list.add(new Logins(
                    rs.getString("ID").trim(),
                    rs.getString("Passwords").trim()));// Đọc dữ liệu từ ResultSet
        }
        connection.close();// Đóng kết nối
        return list;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPasswords() {
        return Passwords;
    }

    public void setPasswords(String passwords) {
        Passwords = passwords;
    }
}
