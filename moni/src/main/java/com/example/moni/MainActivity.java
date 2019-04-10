package com.example.moni;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("魏恒炜", "onCreate");
        pager = findViewById(R.id.viewpager);
        final List<Fragment> list = new ArrayList<>();
        list.add(new One());
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("魏恒炜", "onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("魏恒炜", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("魏恒炜", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("魏恒炜", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("魏恒炜", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("魏恒炜", "onResume");
    }
}
