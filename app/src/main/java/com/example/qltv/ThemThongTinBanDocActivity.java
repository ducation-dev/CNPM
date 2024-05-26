package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class ThemThongTinBanDocActivity extends AppCompatActivity {
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    TextInputEditText edthotenttt, edtlopttt, edtsdtttt, edtdiachittt, edtanhttt, edtmsvttt, edtkhoavienttt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_thong_tin_ban_doc);
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        // anh xa id them thong tin
        edthotenttt = findViewById(R.id.edthotenttt);
        edtlopttt = findViewById(R.id.edtlopttt);
        edtsdtttt = findViewById(R.id.edtsdtttt);
        edtdiachittt = findViewById(R.id.edtdiachittt);
        edtanhttt = findViewById(R.id.edtanhttt);
        edtmsvttt = findViewById(R.id.edtmsvttt);
        edtkhoavienttt = findViewById(R.id.edtkhoavienttt);

        // Xu ly click btnback
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu = getIntent();
                finish();
            }
        });
    }
}