package object;

import org.json.JSONException;
import org.json.JSONObject;

public class ChapTruyen {
<<<<<<< HEAD
    private String tenChap,ngayDang;
=======
    private String tenChap,ngayDang,id;
>>>>>>> dd5c1e1 (truyentranh)

    public ChapTruyen(){

    }

    public String getTenChap() {
        return tenChap;
    }

    public void setTenChap(String tenChap) {
        this.tenChap = tenChap;
    }

    public String getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(String ngayDang) {
        this.ngayDang = ngayDang;
    }

    public ChapTruyen(String tenChap, String ngayDang) {
        this.tenChap = tenChap;
        this.ngayDang = ngayDang;
    }
<<<<<<< HEAD
    public ChapTruyen(JSONObject o) throws JSONException {
        tenChap = o.getString("tenchap");
        ngayDang = o.getString("ngaynhap");
=======

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChapTruyen(JSONObject o) throws JSONException {
        tenChap = o.getString("tenchap");
        ngayDang = o.getString("ngaynhap");
        id = o.getString("id");
>>>>>>> dd5c1e1 (truyentranh)
    }
}
