package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class CapNhatThongTinBanDocActivity extends AppCompatActivity {
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    Button btncapnhatthongtinbd;
    TextInputEditText edthotencn, edtsdtcn, edtdiachicn, edtanhcn, edtlopcn, edtkhoaviencn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat_thong_tin_ban_doc);
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        //anh xa btn capnhat
        btncapnhatthongtinbd = findViewById(R.id.btncapnhatthongtinbd);
        // anh xa id cap nhat thong tin
        edthotencn = findViewById(R.id.edthotencn);
        edtsdtcn = findViewById(R.id.edtsdtcn);
        edtdiachicn = findViewById(R.id.edtdiachicn);
        edtanhcn = findViewById(R.id.edtanhcn);
        edtlopcn = findViewById(R.id.edtlopcn);
        edtkhoaviencn = findViewById(R.id.edtkhoaviencn);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu = getIntent();
                finish();
            }
        });
        btncapnhatthongtinbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentcapnhat = getIntent();
                finish();
            }
        });
    }
}