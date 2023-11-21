package com.example.appdoctruyentranh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import adapter.TruyenTranhAdapter;
import object.TruyenTranh;

public class MainActivity extends AppCompatActivity {
GridView gdvDSTruyen;
TruyenTranhAdapter adapter;
ArrayList<TruyenTranh> truyenTranhArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init(){
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("Doraemon","Chapter 1","https://st.nettruyenus.com/data/comics/99/doraemon-che.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Thanh Guom Diet Quy","Chapter 106","https://st.nettruyenus.com/data/comics/235/thanh-guom-diet-quy.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("7 Vien Ngoc Rong","Chapter 234","https://st.nettruyenus.com/data/comics/124/dragon-ball-rebon.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Doraemon","Chapter 1","https://st.nettruyenus.com/data/comics/99/doraemon-che.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Thanh Guom Diet Quy","Chapter 106","https://st.nettruyenus.com/data/comics/235/thanh-guom-diet-quy.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("7 Vien Ngoc Rong","Chapter 234","https://st.nettruyenus.com/data/comics/124/dragon-ball-rebon.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Doraemon","Chapter 1","https://st.nettruyenus.com/data/comics/99/doraemon-che.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Thanh Guom Diet Quy","Chapter 106","https://st.nettruyenus.com/data/comics/235/thanh-guom-diet-quy.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("7 Vien Ngoc Rong","Chapter 234","https://st.nettruyenus.com/data/comics/124/dragon-ball-rebon.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));
        truyenTranhArrayList.add(new TruyenTranh("Cong Chua Ori","Chapter 7","https://st.nettruyenus.com/data/comics/185/co-dau-cua-obsidian.jpg"   ));

         adapter= new TruyenTranhAdapter(this,0,truyenTranhArrayList);
    }
    private void anhXa(){
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
    }
    private void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private void setClick(){}
}