package com.example.qltv.Datamanagement;

import com.example.qltv.SQLmanagement.SQLmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InfReader {
    private Integer IDThemTT;
    private String Hoten;
    private String LopHC;
    private Integer SDT;
    private String Diachi;
    private Integer MaSinhVien;
    private String Khoa;

    public static void insertTTBD(String IDThemTT, String hoten, String lopHC, String SDT, String diachi, String maSinhVien, String khoa ) throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO TTBANDOC(IDTHEMTT,HOTEN,LOPHANHCHINH,SODIENTHOAI,DIACHI,MSV,KHOA) VALUES ('"+IDThemTT+"','"+hoten+"','"+lopHC+"','"+SDT+"','"+diachi+"','"+maSinhVien+"','"+khoa+"')";
        statement.execute(sql);
        statement.close();
        connection.close();
    }
        public static void updateTTBD(String IDThemTT, String hoten, String lopHC, String SDT, String diachi, String maSinhVien, String khoa) throws SQLException {
            Connection connection = SQLmanagement.connectionSQLSever();
            Statement statement = connection.createStatement();
            String sql = "UPDATE TTBANDOC SET IDTHEMTT = '" +IDThemTT+ "',HOTEN = '"+hoten+"', LOPHANHCHINH = '"+lopHC+"', SODIENTHOAI = '"+SDT+"', DIACHI = '"+diachi+"', MSV = '"+maSinhVien+"', KHOA = '"+khoa+"'";
            statement.execute(sql);
            statement.close();
            connection.close();
        }

    public static void deleteTTBD(String IDThemTT, String hoten, String lopHC, String SDT, String diachi, String maSinhVien, String khoa) throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM TTBANDOC WHERE IDTHEMTT = '" + IDThemTT + "'";
        statement.execute(sql);
        statement.close();
        connection.close();
    }

    public InfReader(Integer IDThemTT, String hoten, String lopHC, Integer SDT, String diachi, Integer maSinhVien, String khoa) {
        this.IDThemTT = IDThemTT;
        Hoten = hoten;
        LopHC = lopHC;
        this.SDT = SDT;
        Diachi = diachi;
        MaSinhVien = maSinhVien;
        Khoa = khoa;
    }

    public Integer getIDThemTT() {
        return IDThemTT;
    }

    public void setIDThemTT(Integer IDThemTT) {
        this.IDThemTT = IDThemTT;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getLopHC() {
        return LopHC;
    }

    public void setLopHC(String lopHC) {
        LopHC = lopHC;
    }

    public Integer getSDT() {
        return SDT;
    }

    public void setSDT(Integer SDT) {
        this.SDT = SDT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public Integer getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(Integer maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }
}
