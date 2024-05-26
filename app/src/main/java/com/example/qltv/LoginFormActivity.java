package com.example.qltv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//import com.example.qltv.Datamanagement.Logins;
import com.example.qltv.Datamanagement.Logins;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginFormActivity extends AppCompatActivity {
    // Khai bao id
    TextInputEditText login_user,login_password;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
         //anh xa id
        login_user = findViewById(R.id.login_user);
        login_password = findViewById(R.id.login_password);
        btnlogin = findViewById(R.id.btnlogin);
        // xu ly click
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlog = new Intent(LoginFormActivity.this, TrangChuActivity.class);
                startActivity(intentlog);
            }
        });
        ArrayList<Logins> arrayList = new ArrayList<>();
        try {
            arrayList = Logins.getIDlist();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Toast.makeText(this, arrayList.get(0).getPasswords(), Toast.LENGTH_SHORT).show();
    };
    }