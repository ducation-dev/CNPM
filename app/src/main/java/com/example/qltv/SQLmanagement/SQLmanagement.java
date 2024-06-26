package com.example.qltv.SQLmanagement;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
public class SQLmanagement {
    private static String sql = "jdbc:jtds:sqlserver://172.16.10.101:1433;databasename=QLTV;user=CNPM;password=nguyenduc123"; // dia chi ket noi
    public static Connection connectionSQLSever(){
        Connection connection = null;
        try {
            try {
                StrictMode.ThreadPolicy policy =
                        new StrictMode.ThreadPolicy.Builder().permitAll().build(); // lay tat ca cac quyen
                StrictMode.setThreadPolicy(policy); // thiet lap chinh sac ket noi bao gom tat ca cac quyen
                Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
                connection = DriverManager.getConnection(sql);
                Log.i("THONG BAO:","Ket noi thanh cong");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
