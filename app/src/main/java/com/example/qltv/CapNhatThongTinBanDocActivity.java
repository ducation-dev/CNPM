package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.qltv.Datamanagement.InfReader;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

public class CapNhatThongTinBanDocActivity extends AppCompatActivity {
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    Button btncapnhatthongtinbd,btnxoathongtinbd;
    TextInputEditText edthotencn, edtsdtcn, edtdiachicn, edtlopcn, edtkhoaviencn,edtmabandoccn,edtmsvcn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat_thong_tin_ban_doc);
        Init1();
        OnClickChangePage1();
        OnClickChangePage2();

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu = getIntent();
                finish();
            }
        });
    }

    private void Init1() {
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        //anh xa btn capnhat
        btncapnhatthongtinbd = findViewById(R.id.btncapnhatthongtinbd);
        btnxoathongtinbd = findViewById(R.id.btnxoathongtinbd);
        // anh xa id cap nhat thong tin
        edthotencn = findViewById(R.id.edthotencn);
        edtsdtcn = findViewById(R.id.edtsdtcn);
        edtdiachicn = findViewById(R.id.edtdiachicn);
        edtlopcn = findViewById(R.id.edtlopcn);
        edtkhoaviencn = findViewById(R.id.edtkhoaviencn);
        edtmabandoccn = findViewById(R.id.edtmabandoccn);
        edtmsvcn = findViewById(R.id.edtmsvcn);

    }

    private void OnClickChangePage2() {
        btnxoathongtinbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDThemTT = edtmabandoccn.getText().toString();
                String hoten = edthotencn.getText().toString();
                String lopHC = edtlopcn.getText().toString();
                String SDT = edtsdtcn.getText().toString();
                String diachi = edtdiachicn.getText().toString();
                String maSinhVien = edtmsvcn.getText().toString();
                String khoa = edtkhoaviencn.getText().toString();
                try {
                    InfReader.deleteTTBD(IDThemTT, hoten, lopHC, SDT, diachi, maSinhVien, khoa);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }

    private void OnClickChangePage1() {
        btncapnhatthongtinbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDThemTT = edtmabandoccn.getText().toString();
                String hoten = edthotencn.getText().toString();
                String lopHC = edtlopcn.getText().toString();
                String SDT = edtsdtcn.getText().toString();
                String diachi = edtdiachicn.getText().toString();
                String maSinhVien = edtmsvcn.getText().toString();
                String khoa = edtkhoaviencn.getText().toString();
                try {
                    InfReader.updateTTBD(IDThemTT, hoten, lopHC, SDT, diachi, maSinhVien, khoa);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }
}