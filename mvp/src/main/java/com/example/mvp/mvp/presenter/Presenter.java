package com.example.mvp.mvp.presenter;

import android.util.Log;

import com.example.mvp.mvp.model.IMdel;
import com.example.mvp.mvp.model.IModel;
import com.example.mvp.mvp.view.IView;

public class Presenter implements IPresenter {
    IModel iModel;
    IView iView;

    @Override
    public void getmod() {

    }

    @Override
    public void getbang(final IView iView) {
        this.iView = iView;
        iModel = new IMdel();
        iModel.ipre(new IModel.CallBack() {

            @Override
            public void callche(String json) {
                iView.getshow(json);
                Log.d("xxx", json);
            }

            @Override
            public void callshi() {

            }
        });

    }

    @Override
    public void getjie() {
        if (iView != null) {
            iView = null;
        }
        if (iModel != null) {
            iModel = null;
        }
        System.gc();
    }
}
