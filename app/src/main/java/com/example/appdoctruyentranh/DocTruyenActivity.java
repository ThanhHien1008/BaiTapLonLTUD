package com.example.appdoctruyentranh;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appdoctruyentranh.adapter.ChapTruyenAdapter;
import com.example.appdoctruyentranh.adapter.TruyenTranhAdapter;
import com.example.appdoctruyentranh.api.ApiLayAnh;
import com.example.appdoctruyentranh.api.ApiLayTruyen;
import com.example.appdoctruyentranh.interfaces.LayAnhVe;
import com.example.appdoctruyentranh.object.ChapTruyen;
import com.example.appdoctruyentranh.object.TruyenTranh;
=======
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
>>>>>>> 49c0df9 (truyentranh)

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

<<<<<<< HEAD
=======
import api.ApiLayAnh;
import interfaces.LayAnhVe;

>>>>>>> 49c0df9 (truyentranh)
public class DocTruyenActivity extends AppCompatActivity implements LayAnhVe {
    ImageView imgAnh;
    ArrayList<String> arrUrlAnh;
    int soTrang,soTrangDangDoc;
    TextView txvSoTrang;
    String idChap;
<<<<<<< HEAD
=======

>>>>>>> 49c0df9 (truyentranh)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_truyen);
        init();
        anhXa();
        setUp();
<<<<<<< HEAD
        setClik();
        new ApiLayAnh(this,idChap).execute();
    }

    private void init() {

        Bundle b = getIntent().getBundleExtra("data");
        idChap= b.getString("idChap");
        /*
        arrUrlAnh = new ArrayList<>();
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/0000-rental-credit.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/001-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/002-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/003-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/004-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/005-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/006-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/007-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/008-copy.jpg");
        arrUrlAnh.add("http://cdn5.truyentranh8.net/u2/lacthientt8/25538-tt8-rental-girls/1-/009-copy.jpg");
        soTrangDangDoc = 1;
        soTrang=arrUrlAnh.size();
        */
    }

    private void anhXa() {
        txvSoTrang =findViewById(R.id.txvSoTrang);
        imgAnh =findViewById(R.id.imgAnh);
    }

    private void setUp(){
        //docTheoTrang(0);
    }

    private void setClik() {

    }

    public void right(View view) {
        docTheoTrang(1);
=======
        setClick();
        new ApiLayAnh(this,idChap).execute();
    }
    private void init(){
        Bundle b = getIntent().getBundleExtra("data");
        idChap= b.getString("idChap");
    }
    private void anhXa(){
        imgAnh = findViewById(R.id.imgAnh);
        txvSoTrang = findViewById(R.id.txvSoTrang);
    }
    private void setUp(){
        //docTheoTrang(0);
    }
    private void setClick(){

    }






    public void right(View view) {
        docTheoTrang(+1);
>>>>>>> 49c0df9 (truyentranh)
    }

    public void left(View view) {
        docTheoTrang(-1);
    }

    private void docTheoTrang(int i){
<<<<<<< HEAD
        soTrangDangDoc= soTrangDangDoc+i;
=======
        soTrangDangDoc = soTrangDangDoc+i;
>>>>>>> 49c0df9 (truyentranh)
        if(soTrangDangDoc==0){
            soTrangDangDoc=1;
        }
        if(soTrangDangDoc>soTrang){
            soTrangDangDoc = soTrang;
        }
<<<<<<< HEAD
        txvSoTrang.setText(soTrangDangDoc+" / "+soTrang);
=======
        txvSoTrang.setText(soTrangDangDoc+"/"+soTrang);
>>>>>>> 49c0df9 (truyentranh)
        Glide.with(this).load(arrUrlAnh.get(soTrangDangDoc-1)).into(imgAnh);
    }

    @Override
    public void batDau() {

    }

    @Override
    public void ketThuc(String data) {
<<<<<<< HEAD
        try {
            arrUrlAnh = new ArrayList<>();
            JSONArray array = new JSONArray(data);
            for(int i=0;i<array.length();i++){
                arrUrlAnh.add(array.getString(i));
            }
            soTrangDangDoc = 1;
            soTrang=arrUrlAnh.size();
            docTheoTrang(0);
        } catch (JSONException e) {
            e.printStackTrace();
=======
        arrUrlAnh = new ArrayList<>();
        try {
            soTrangDangDoc =1;
            soTrang=arrUrlAnh.size();
            docTheoTrang(0);
            JSONArray arr = new JSONArray(data);
            for(int i=0;i<arr.length();i++){
                arrUrlAnh.add(arr.getString(i));
            }
        }catch (JSONException e){

>>>>>>> 49c0df9 (truyentranh)
        }
    }

    @Override
    public void biLoi() {

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 49c0df9 (truyentranh)
