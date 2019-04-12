package com.example.mvp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvp.MainActivity;
import com.example.mvp.R;
import com.example.mvp.bean.ShowBean;

import java.util.List;

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ViewHolder> {
    Context context;
    List<ShowBean.ResultBean> resultBeans;

    public ShowAdapter(Context context, List<ShowBean.ResultBean> resultBeans) {
        this.context = context;
        this.resultBeans = resultBeans;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.show_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(context).load(resultBeans.get(i).getLogo()).into(viewHolder.image);

        viewHolder.text.setText(resultBeans.get(i).getName());
        Log.d("zzz", resultBeans.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return resultBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.show_image);
            text = itemView.findViewById(R.id.show_text);

        }
    }
}
