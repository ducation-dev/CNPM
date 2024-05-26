package com.example.qltv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class TrangChuActivity extends AppCompatActivity {
    // Khai bao id
    Button btncapthett, btnthuhoithett, btnthemthongtinbdtt, btncapnhatthongtinbdtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        //anh xa id
        btncapthett = findViewById(R.id.btncapthett);
        btnthuhoithett = findViewById(R.id.btnthuhoithett);
        btnthemthongtinbdtt = findViewById(R.id.btnthemthongtinbdtt);
        btncapnhatthongtinbdtt = findViewById(R.id.btncapnhatthongtinbdtt);
        //xu ly click
        btncapthett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu = new Intent(TrangChuActivity.this, CapTheBanDocActivity.class);
                startActivity(intentTrangChu);
            }
        });
        btnthuhoithett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu1 = new Intent(TrangChuActivity.this, ThuHoiTheBanDocActivity.class);
                startActivity(intentTrangChu1);
            }
        });
        btnthemthongtinbdtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangchu2 = new Intent(TrangChuActivity.this, ThemThongTinBanDocActivity.class);
                startActivity(intentTrangchu2);
            }
        });
        btncapnhatthongtinbdtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangchu3 = new Intent(TrangChuActivity.this, CapNhatThongTinBanDocActivity.class);
                startActivity(intentTrangchu3);
            }
        });
    }}