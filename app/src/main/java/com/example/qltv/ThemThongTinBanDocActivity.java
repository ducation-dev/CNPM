package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.qltv.Datamanagement.InfReader;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

public class ThemThongTinBanDocActivity extends AppCompatActivity {
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    Button btnthemthongtinbd;
    TextInputEditText edtmabandocttt,edthotenttt, edtlopttt, edtsdtttt, edtdiachittt, edtmsvttt, edtkhoavienttt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_thong_tin_ban_doc);
        Init();
        onClickChangePage();
        // Xu ly click btnback
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void onClickChangePage() {
        btnthemthongtinbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IDThemTT = edtmabandocttt.getText().toString();
                String hoten = edthotenttt.getText().toString();
                String lopHC = edtlopttt.getText().toString();
                String SDT = edtsdtttt.getText().toString();
                String diachi = edtdiachittt.getText().toString();
                String maSinhVien = edtmsvttt.getText().toString();
                String khoa = edtkhoavienttt.getText().toString();
                try {
                    InfReader.insertTTBD(IDThemTT,hoten,lopHC,SDT,diachi,maSinhVien,khoa);
                }
                catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }

    private void Init() {
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        // anh xa id btn nhap them tt ban doc
        btnthemthongtinbd = findViewById(R.id.btnthemthongtinbd);
        // anh xa id them thong tin
        edtmabandocttt = findViewById(R.id.edtmabandocttt);
        edthotenttt = findViewById(R.id.edthotenttt);
        edtlopttt = findViewById(R.id.edtlopttt);
        edtsdtttt = findViewById(R.id.edtsdtttt);
        edtdiachittt = findViewById(R.id.edtdiachittt);
        edtmsvttt = findViewById(R.id.edtmsvcn);
        edtkhoavienttt = findViewById(R.id.edtkhoavienttt);
    }
}