package com.example.mvp.mvp.model;

import android.util.Log;

import com.example.mvp.wangluo.AsyncHttpClient;

public class IMdel implements IModel {
    String url = "http://172.17.8.100/movieApi/cinema/v1/findRecommendCinemas?page=1&count=10";

    @Override
    public void ipre(final CallBack callBack) {
        AsyncHttpClient.getInstance().GetAsyns(url, new AsyncHttpClient.CallBack() {
            @Override
            public void calladd(int ads, String messa) {

            }

            @Override
            public void Succore(String urfs) {
                Log.d("ddd",urfs);
                callBack.callche(urfs);
            }
        });
    }
}
