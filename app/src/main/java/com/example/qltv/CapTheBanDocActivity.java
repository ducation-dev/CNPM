package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;

public class CapTheBanDocActivity extends AppCompatActivity {
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    TextInputEditText edthotenct, edtlopct, edtsdtct, edtanhct, edtngaydangkyct, edtnguoidangkyct, edttrangthaict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capthebandoc);
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        //anh xa id capthe
        edthotenct = findViewById(R.id.edthotenct);
        edtlopct = findViewById(R.id.edtlopct);
        edtsdtct = findViewById(R.id.edtsdtct);
        edtanhct = findViewById(R.id.edtanhct);
        edtngaydangkyct = findViewById(R.id.edtngaydangkyct);
        edtnguoidangkyct = findViewById(R.id.edtnguoidangkyct);
        edttrangthaict = findViewById(R.id.edttrangthaict);
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