package com.example.moni;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class One extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("魏恒炜1", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("魏恒炜1", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("魏恒炜1", "onCreateView");
        View view = View.inflate(getActivity(), R.layout.laskd, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("魏恒炜1", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("魏恒炜1", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("魏恒炜1", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("魏恒炜1", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("魏恒炜1", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("魏恒炜1", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("魏恒炜1", "onDestroys");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("魏恒炜1", "onDetach");
    }
}
