package com.example.mvp.mvp.presenter;

import com.example.mvp.mvp.model.IMdel;
import com.example.mvp.mvp.model.IModel;
import com.example.mvp.mvp.view.IView;

public class Presenter implements IPresenter {
    IModel iModel;
    IView iView;

    @Override
    public void getmod() {
        iModel.ipre(new IModel.CallBack() {
            @Override
            public void callche() {

            }

            @Override
            public void callshi() {

            }
        });
    }

    @Override
    public void getbang(IView iView) {
        this.iView = iView;
        iModel = new IMdel();

    }

    @Override
    public void getjie(IView iView) {
        if (iView != null) {
            iView = null;
        }
        if (iModel != null) {
            iModel = null;
        }
        System.gc();
    }
}
