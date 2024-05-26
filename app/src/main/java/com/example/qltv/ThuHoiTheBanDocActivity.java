package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class ThuHoiTheBanDocActivity extends AppCompatActivity{
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    TextInputEditText edthotenth, edtlopth, edtsdtth, edtnguoidangkyth, edtngaythuhoith, edtlydoth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thu_hoi_the_ban_doc);
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        edthotenth = findViewById(R.id.edthotenth);
        edtlopth = findViewById(R.id.edtlopth);
        edtsdtth = findViewById(R.id.edtsdtth);
        edtnguoidangkyth = findViewById(R.id.edtnguoidangkyth);
        edtngaythuhoith = findViewById(R.id.edtngaythuhoith);
        edtlydoth = findViewById(R.id.edtlydoth);

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