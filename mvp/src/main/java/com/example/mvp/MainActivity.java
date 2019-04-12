package com.example.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.mvp.adapter.ShowAdapter;
import com.example.mvp.bean.ShowBean;
import com.example.mvp.mvp.presenter.Presenter;
import com.example.mvp.mvp.view.IView;
import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IView {

    private Presenter presenter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recy);
        presenter = new Presenter();
        presenter.getbang(this);

    }

    @Override
    public void getshow(String josn) {
//        Log.d("ggg",josn);
        Gson gson = new Gson();
        ShowBean showBean = gson.fromJson(josn, ShowBean.class);
        List<ShowBean.ResultBean> result = showBean.getResult();
        Log.d("sss", result.get(0).getName());
        ShowAdapter showAdapter = new ShowAdapter(MainActivity.this, result);
        recyclerView.setAdapter(showAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.getjie();
    }


}
