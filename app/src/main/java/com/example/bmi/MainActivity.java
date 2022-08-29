package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Float sonang;
    Float socao;
    Float sokq;
    String str;
    boolean kt=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttinh = (Button) findViewById(R.id.btntinh);
        EditText nang = (EditText) findViewById(R.id.cannangtext);
        EditText cao = (EditText) findViewById(R.id.chieucaotext);
        TextView kq= (TextView) findViewById(R.id.textView);
        TextView kqc= (TextView) findViewById(R.id.textView1);
        bttinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonang = Float.parseFloat(nang.getText().toString());
                socao = Float.parseFloat(cao.getText().toString());
                if (socao==0){
                    kq.setText("Nhập sai!!".toString());
                }else{
                    str=String.valueOf(sonang*1.0/(socao*socao));
                    kq.setText(str);
                    sokq=Float.parseFloat(kq.getText().toString());
                    String loai;
                    if ( sokq <18 ) loai="Người gầy";
                    else if (sokq < 25) loai = "Người bình thường";
                    else if (sokq <30) loai = "Người béo phì độ I";
                    else if (sokq <35) loai ="Người béo phì độ II";
                    else loai= "Người béo phì độ III";
                    kqc.setText(loai);
                }}
        }
        );

    }
}