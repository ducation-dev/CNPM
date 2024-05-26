package com.example.qltv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.qltv.Datamanagement.Logins;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // khai bao id
    Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa id cho button start
        btnstart = findViewById(R.id.btnstart);
        //xu ly click
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khai bao intent de chuyen giao dien
                Intent intentbd = new Intent(MainActivity.this,LoginFormActivity.class);
                startActivity(intentbd);
            }
        });
//        ArrayList<Logins> list = new ArrayList<>();
//        try {
//            list = Logins.getIDlist();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        Toast.makeText(MainActivity.this,list.get(0).getPasswords(),Toast.LENGTH_SHORT).show();
    }
}