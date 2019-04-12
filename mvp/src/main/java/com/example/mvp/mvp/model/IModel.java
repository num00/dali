package com.example.mvp.mvp.model;

public interface IModel {
    void ipre(CallBack callBack);

    interface CallBack {
        void callche();

        void callshi();
    }
}
