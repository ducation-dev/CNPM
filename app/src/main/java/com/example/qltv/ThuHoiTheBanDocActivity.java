package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.qltv.Datamanagement.CardPeople;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThuHoiTheBanDocActivity extends AppCompatActivity{
    // Khai bao id
    ImageButton btnback; // khai bao imagebutton back
    Button btnthuhoithe;
    TextInputEditText edtidmatheth,edthotenth, edtlopth, edtsdtth, edtnguoidangkyth, edttrangthaith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Init();
        OnClickChangePage();

        // Xu ly click btnback
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangChu = getIntent();
                finish();
            }
        });



    }

    private void OnClickChangePage() {
        btnthuhoithe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String mathe = edtidmatheth.getText().toString();
                    String hoten = edthotenth.getText().toString();
                    String sdt = edtsdtth.getText().toString();
                    String lopHC = edtlopth.getText().toString();
                    String nguoidangky = edtnguoidangkyth.getText().toString();
                    String trangthai = edttrangthaith.getText().toString();
                    try {
                        CardPeople.deleteTheBanDoc(mathe, hoten, lopHC, sdt, nguoidangky, trangthai);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    finish();
                }
        });
    }

    private void Init() {
        setContentView(R.layout.activity_thu_hoi_the_ban_doc);
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        //anh xa id btn nhap thu hoi
        btnthuhoithe = findViewById(R.id.btnthuhoithe);
        //anh xa id thu hoi the
        edtidmatheth = findViewById(R.id.edtidmatheth);
        edthotenth = findViewById(R.id.edthotenth);
        edtlopth = findViewById(R.id.edtlopth);
        edtsdtth = findViewById(R.id.edtsdtth);
        edtnguoidangkyth = findViewById(R.id.edtnguoidangkyth);
        edttrangthaith = findViewById(R.id.edttrangthaith);
    }
}