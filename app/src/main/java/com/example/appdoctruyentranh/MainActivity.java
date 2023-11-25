package com.example.appdoctruyentranh;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import object.TruyenTranh;

public class MainActivity extends AppCompatActivity {
GridView gdvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
EditText edtTimKiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClik();
    }
    private void init(){
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("a","Chapter 24","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Tham tu lung danh Conan","Chapter 242","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("v","Chapter 2.2","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Tư","Chapter 4.2","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("vsa","Chapter 2","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("sa","Chapter 4","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("gb","Chapter 22","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("sdv","Chapter 42","https://vov2-media.emitech.vn/sites/default/files/styles/large/public/2022-07/image001.jpg"));

        adapter=new TruyenTranhAdapter(this,0,truyenTranhArrayList);
    }
    private void anhXa(){
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
        edtTimKiem = findViewById(R.id.edtTimKiem);
    }
    private void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private void setClik(){
        edtTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
String s =edtTimKiem.getText().toString();
adapter.sortTruyen(s);
            }
        });
    }
}