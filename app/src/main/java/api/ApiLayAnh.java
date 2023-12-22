package api;

import android.os.AsyncTask;

<<<<<<< HEAD
import com.example.appdoctruyentranh.interfaces.LayAnhVe;
import com.example.appdoctruyentranh.interfaces.LayTruyenVe;
=======
>>>>>>> 49c0df9 (truyentranh)
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

<<<<<<< HEAD
=======
import interfaces.LayAnhVe;

>>>>>>> 49c0df9 (truyentranh)
public class ApiLayAnh extends AsyncTask<Void,Void,Void> {
    String data;
    String idChap;
    LayAnhVe layAnhVe;

    public ApiLayAnh(LayAnhVe layAnhVe,String idChap) {
        this.layAnhVe = layAnhVe;
        this.idChap = idChap;
        this.layAnhVe.batDau();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
<<<<<<< HEAD
                //.url("https://api.myjson.com/bins/agugc")
                .url("http://duliet1995.000webhostapp.com/layAnh.php?idChap="+idChap)
                .build();
        data =null;
        try {
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            data = body.string();//1
        }catch (IOException e){
=======
                .url("https://doctruyenmtu.000webhostapp.com/layAnh.php?idChap="+idChap)
                .build();
        data =null;
        try{
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            data = body.string();//1
        }catch (IOException e) {
>>>>>>> 49c0df9 (truyentranh)
            data=null;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
<<<<<<< HEAD
        if(data == null){
            this.layAnhVe.biLoi();
        }else {
            this.layAnhVe.ketThuc(data);
        }
=======
    if(data == null){
        this.layAnhVe.biLoi();
    }else {
        this.layAnhVe.ketThuc(data);
    }
>>>>>>> 49c0df9 (truyentranh)
    }
}
