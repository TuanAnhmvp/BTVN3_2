package com.example.dangnhap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText nhapso1,nhapso2;
    TextView ketqua;
    Button btcong,bttru,btnhan,btchia;
    float a,b,y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        nhapso1 = findViewById(R.id.edt_nhapso1);
        nhapso2 = findViewById(R.id.edt_nhapso2);
        ketqua = findViewById(R.id.tv_3);
        btcong = findViewById(R.id.bt_cong);
        bttru = findViewById(R.id.bt_tru);
        btnhan = findViewById(R.id.bt_nhan);
        btchia = findViewById(R.id.bt_chia);

        btcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nhapso1.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 1");
                } else if(nhapso2.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 2");
                }
                else {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a + b;

                    ketqua.setText(String.valueOf(y));
                }

            }
        });
        bttru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nhapso1.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 1");
                } else if(nhapso2.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 2");
                }
                else {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a - b;

                    ketqua.setText(String.valueOf(y));
                }

            }
        });
        btnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nhapso1.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 1");
                } else if(nhapso2.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 2");
                }
                else {
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a * b;

                    ketqua.setText(String.valueOf(y));
                }

            }
        });
        btchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nhapso1.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 1");
                } else if(nhapso2.getText().toString().equals("")){
                    ketqua.setText("Hãy nhập số 2");
                }
                else{
                    a = Float.parseFloat(nhapso1.getText().toString());
                    b = Float.parseFloat(nhapso2.getText().toString());
                    y = a / b;
                    y = (float) (Math.round(y*10000.0)/ (10000.0));
                    ketqua.setText(String.valueOf(y));
                }

            }
        });

    }
}