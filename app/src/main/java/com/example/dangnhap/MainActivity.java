package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv_1, v_dki;
    Button bt_1;
    EditText edt_nhaptk,edt_nhapmk1,edt_nhaplaimk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
    void init(){
        tv_1 = findViewById(R.id.tv_1);
        v_dki = findViewById(R.id.v_dki);
        bt_1 = findViewById(R.id.bt_1);
        edt_nhaptk = findViewById(R.id.edt_nhaptk);
        edt_nhapmk1 = findViewById(R.id.edt_nhapmk1);
        edt_nhaplaimk = findViewById(R.id.edt_nhaplaimk);

        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edt_nhaptk.getText().toString().equals("")){
                    tv_1.setText("Vui lòng nhập tên tài khoản");
                }
                else if (edt_nhapmk1.getText().toString().equals("")){
                    tv_1.setText("Vui lòng nhập mật khẩu");
                }
                else if (edt_nhaplaimk.getText().toString().equals("")){
                    tv_1.setText("Vui lòng nhập lại mật khẩu");
                }
                else {
                    tv_1.setText("Đăng ký thành công");
                    Intent intent = new  Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }

            }

        });


    }
}