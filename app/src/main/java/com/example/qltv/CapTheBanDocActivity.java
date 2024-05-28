package com.example.qltv;

import static com.example.qltv.SQLmanagement.SQLmanagement.connectionSQLSever;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.qltv.Datamanagement.CardPeople;
import com.example.qltv.SQLmanagement.SQLmanagement;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CapTheBanDocActivity extends AppCompatActivity {
    // Khai bao id
    TextView edtngaydangkyct;
    ImageButton btnback; // khai bao imagebutton back
    Button btncapthe;
    TextInputEditText edtidmathect,edthotenct, edtlopct, edtsdtct, edtnguoidangkyct, edttrangthaict;
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capthebandoc);
        Init();
        onClickChangePage();


        // Xu ly click btnback
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        edtngaydangkyct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDate(calendar,simpleDateFormat);
            }
        });
    }

    private void onClickChangePage() {
        btncapthe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mathe = edtidmathect.getText().toString();
                String hoten = edthotenct.getText().toString();
                String sdt = edtsdtct.getText().toString();
                String lopHC = edtlopct.getText().toString();
                String nguoidangky = edtnguoidangkyct.getText().toString();
                String trangthai = edttrangthaict.getText().toString();
                String ngaydangky = edtngaydangkyct.getText().toString();
                try {
                    CardPeople.insertTheBanDoc(mathe,hoten,lopHC,sdt,ngaydangky,nguoidangky,trangthai);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                finish();
            }
        });
    }

    private void Init() {
        //anh xa id image btnback
        btnback = findViewById(R.id.btnback);
        //anh xa id btn nhap cap the
        btncapthe = findViewById(R.id.btncapthe);
        edtidmathect = findViewById(R.id.edtidmathect);
        //anh xa id capthe
        edthotenct = findViewById(R.id.edthotenct);
        edtlopct = findViewById(R.id.edtlopct);
        edtsdtct = findViewById(R.id.edtsdtct);
        edtngaydangkyct = findViewById(R.id.edtngaydangkyct);
        edtnguoidangkyct = findViewById(R.id.edtnguoidangkyct);
        edttrangthaict = findViewById(R.id.edttrangthaict);
    }

    private void selectedDate(Calendar calendar,SimpleDateFormat simpleDateFormat){
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(year,month,dayOfMonth);

                edtngaydangkyct.setText(simpleDateFormat.format(calendar.getTime()));
            }
        }, year,month,day);
        datePickerDialog.show();
    }

    }