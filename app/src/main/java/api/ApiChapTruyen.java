package api;

import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import interfaces.LayChapVe;
<<<<<<< HEAD
import interfaces.LayTruyenVe;
=======
>>>>>>> dd5c1e1 (truyentranh)

public class ApiChapTruyen extends AsyncTask<Void,Void,Void> {
    String data;
    LayChapVe layChapVe;
    String idTruyen;

    public ApiChapTruyen(LayChapVe layChapVe, String idTruyen) {
        this.idTruyen = idTruyen;
        this.layChapVe = layChapVe;
        this.layChapVe.batDau();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                //.url("https://api.myjson.online/v1/records/f3ac9a77-958e-49cf-946e-e5a05e6de7c8")
                .url("https://doctruyenmtu.000webhostapp.com/layChap.php?id="+idTruyen)
                .build();
        data =null;
        try{
            Response response = client.newCall(request).execute();
            ResponseBody body = response.body();
            data = body.string();//1
        }catch (IOException e) {
            data=null;
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        if(data == null){
            this.layChapVe.biLoi();
        }else {
            this.layChapVe.ketThuc(data);
        }
    }
}
