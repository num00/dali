package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvp.mvp.presenter.Presenter;
import com.example.mvp.mvp.view.IView;

public class MainActivity extends AppCompatActivity implements IView {

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter();
        presenter.getbang(this);

    }

    @Override
    public void getshow() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.getjie(this);
    }
}
