package com.example.appdoctruyentranh;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
>>>>>>> dd5c1e1 (truyentranh)
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

<<<<<<< HEAD
=======
import androidx.appcompat.app.AppCompatActivity;

>>>>>>> dd5c1e1 (truyentranh)
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

import adapter.ChapTruyenAdapter;
import api.ApiChapTruyen;
<<<<<<< HEAD
import api.ApiLayTruyen;
=======
>>>>>>> dd5c1e1 (truyentranh)
import interfaces.LayChapVe;
import object.ChapTruyen;
import object.TruyenTranh;

public class ChapActivity extends AppCompatActivity implements LayChapVe {
    TextView txvConan;
    ImageView imgAnhTruyens;
    TruyenTranh truyenTranh;
    ListView lsvDanhSachChap;
    ArrayList<ChapTruyen> arrChap;
    ChapTruyenAdapter chapTruyenAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap);
        init();
        anhXa();
        setUp();
        setClick();
        new ApiChapTruyen(this,truyenTranh.getId()).execute();
    }
    private void init() {
        Bundle b = getIntent().getBundleExtra("data");
        truyenTranh=(TruyenTranh) b.getSerializable("truyen");

        //tao du lieu ao
        arrChap= new ArrayList<>();
       /* for(int i=0;i<20;i++){
            arrChap.add(new ChapTruyen("Chapter" +i,"06 - 10 - 2023"));
        }
        chapTruyenAdapter= new ChapTruyenAdapter(this,0,arrChap);
    */
    }
    private void anhXa() {
        imgAnhTruyens = findViewById(R.id.imgAnhTruyens);
        txvConan  =  findViewById(R.id.txvConan);
        lsvDanhSachChap = findViewById(R.id.lsvDanhSachChap);
    }

    private void setUp() {
        txvConan.setText(truyenTranh.getTenTruyen());
        Glide.with(this).load(truyenTranh.getLinkAnh()).into(imgAnhTruyens);

        //   lsvDanhSachChap.setAdapter(chapTruyenAdapter);
    }
<<<<<<< HEAD
    private void setClick() {}
=======
    private void setClick() {
        lsvDanhSachChap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Bundle b = new Bundle();
                b.putString("idChap",arrChap.get(i).getId());
                Intent intent = new Intent(ChapActivity.this,DocTruyenActivity.class);
                intent.putExtra( "data",b);
                startActivity(intent);
            }
        });
    }
>>>>>>> dd5c1e1 (truyentranh)


    @Override
    public void batDau() {
        Toast.makeText(this,"Lay Chap Ve", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void ketThuc(String data) {
        try {
            JSONArray array =new JSONArray(data);
            for (int i=0;i<array.length();i++){
                ChapTruyen chapTruyen = new ChapTruyen(array.getJSONObject(i));
                arrChap.add(chapTruyen);
            }
            chapTruyenAdapter= new ChapTruyenAdapter(this,0,arrChap);
            lsvDanhSachChap.setAdapter(chapTruyenAdapter);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void biLoi() {

    }
}