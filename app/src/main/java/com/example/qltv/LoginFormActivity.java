package com.example.qltv;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.qltv.Datamanagement.Logins;
import com.google.android.material.textfield.TextInputEditText;

import java.sql.SQLException;

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
        btnlogin.setOnClickListener(new View.OnClickListener() { //chạy
            @Override
            public void onClick(View v) {
                String user = login_user.getText().toString(); // gắn biến user để lấy dữ liệu từ text user
                String passwords = login_password.getText().toString(); // gắn biến passwords để lấy dữ liệu từ text password
                Logins login = new Logins(); // tạo 1 login mới
                try {
                    login = login.getuserlist(user,passwords);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                if(user.equals(login.getUser()) && passwords.equals(login.getPass())){
                    Toast.makeText(LoginFormActivity.this, "OK", Toast.LENGTH_SHORT).show();
                }
                if(user.length()==0 || passwords.length()==0){
                    Toast.makeText(LoginFormActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();// kiểm tra xem user và pass của người dùng nhập có đúng với csdl k

                }else if(login.getUser().equals(user) && login.getPass().equals(passwords)){
                    Intent intentlog = new Intent(LoginFormActivity.this, TrangChuActivity.class); // tạo intent để chuyển qua giao diện bạn đọc
                    startActivity(intentlog); // bắt đầu chuyển giao diện
                }else{
                    Toast.makeText(LoginFormActivity.this, "Tài khoản mật khẩu không chính xác", Toast.LENGTH_SHORT).show(); // nếu người dùng nhập k đúng báo tk mk k chính xác
                }
    };
        });

    }
}