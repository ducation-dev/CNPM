package com.example.qltv.Datamanagement;

import com.example.qltv.SQLmanagement.SQLmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class CardPeople {
    private Integer IDcapthe;
    private String Hoten;
    private String LopHC;
    private Integer SoDT;
    private Date NgayDangKy;
    private String NguoiDangKy;
    private String TrangThai;

    public static void insertTheBanDoc(String IDcapthe, String hoten, String lopHC, String soDT, String ngayDangKy, String nguoiDangKy, String trangThai) throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO THEBANDOC(IDCAPTHE,HOTEN,LOPHANHCHINH,SODIENTHOAI,NGAYDANGKY,NGUOIDANGKY,TRANGTHAI) VALUES ('"+IDcapthe+"','"+hoten+"','"+lopHC+"','"+soDT+"','"+ngayDangKy+"','"+nguoiDangKy+"','"+trangThai+"')";
        statement.execute(sql);
        statement.close();
        connection.close();
    }
    public static void deleteTheBanDoc(String IDcapthe, String hoten, String lopHC, String soDT, String nguoiDangKy, String trangThai) throws SQLException {
        Connection connection = SQLmanagement.connectionSQLSever();
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM THEBANDOC WHERE IDCAPTHE = '" + IDcapthe + "'";
        statement.execute(sql);
        statement.close();
        connection.close();
    }
    public CardPeople(Integer IDcapthe, String hoten, String lopHC, Integer soDT, Date ngayDangKy, String nguoiDangKy, String trangThai) {
        this.IDcapthe = IDcapthe;
        Hoten = hoten;
        LopHC = lopHC;
        SoDT = soDT;
        NgayDangKy = ngayDangKy;
        NguoiDangKy = nguoiDangKy;
        TrangThai = trangThai;
    }

    public Integer getIDcapthe() {
        return IDcapthe;
    }

    public void setIDcapthe(Integer IDcapthe) {
        this.IDcapthe = IDcapthe;
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

    public Integer getSoDT() {
        return SoDT;
    }

    public void setSoDT(Integer soDT) {
        SoDT = soDT;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        NgayDangKy = ngayDangKy;
    }

    public String getNguoiDangKy() {
        return NguoiDangKy;
    }

    public void setNguoiDangKy(String nguoiDangKy) {
        NguoiDangKy = nguoiDangKy;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }
}
