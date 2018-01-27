package com.aitp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aitp.Model.NewsModel;
import com.aitp.R;

import java.util.List;

/**
 * Created by kenneth on 05/01/2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private List<NewsModel> newsModels;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, description, date;
        public ImageView image;

        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.description);
            date = view.findViewById(R.id.date);
        }
    }

    public NewsAdapter(List<NewsModel> newsModels) {

        this.newsModels = newsModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        NewsModel newsModel = newsModels.get(position);
        holder.title.setText(newsModel.getTitle());
        holder.description.setText(newsModel.getDescription());
        holder.date.setText(newsModel.getDate());
        holder.image.setImageResource(newsModel.getImage());
    }

    @Override
    public int getItemCount() {
        return newsModels.size();
    }
}
