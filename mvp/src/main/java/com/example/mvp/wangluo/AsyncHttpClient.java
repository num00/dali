package com.example.mvp.wangluo;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;

import com.google.common.io.ByteStreams;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AsyncHttpClient {
    private static AsyncHttpClient httpClient = new AsyncHttpClient();

    public static AsyncHttpClient getInstance() {
        return httpClient;
    }

    public void GetAsyns(String url, final CallBack callBack) {
        new AsyncTask<String, Void, String>() {

            @Override
            protected String doInBackground(String... strings) {
                Log.d("xxx", strings[0]);
                return GetHttp(strings[0]);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                if (!TextUtils.isEmpty(s)) {
                    callBack.Succore(s);
                } else {
                    callBack.calladd(503, "为请求到数据");
                }
            }
        }.execute(url);

    }

    private String GetHttp(String list) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(list);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = httpURLConnection.getInputStream();
                String s = new String(ByteStreams.toByteArray(inputStream));
                Log.d("xxx", s);
                return s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public interface CallBack {
        void calladd(int ads, String messa);

        void Succore(String urfs);
    }


}
