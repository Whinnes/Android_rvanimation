package com.awcode.rvanimation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    Context mContext;
    List<NewsItem> mData;

    public NewsAdapter(Context mContext, List<NewsItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false);

        return new NewsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int i) {

        newsViewHolder.img_user.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_transition_animation));

        newsViewHolder.container.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_scale_animation));

        newsViewHolder.tv_title.setText(mData.get(i).getTitle());
        newsViewHolder.tv_description.setText(mData.get(i).getContent());
        newsViewHolder.tv_date.setText(mData.get(i).getDate());
        newsViewHolder.img_user.setImageResource(mData.get(i).getUserPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        TextView tv_title, tv_description, tv_date;
        ImageView img_user;
        RelativeLayout container;



        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            container = itemView.findViewById(R.id.container);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tv_date);
            img_user = itemView.findViewById(R.id.img_user);

        }
    }
}
