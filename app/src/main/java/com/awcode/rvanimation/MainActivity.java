package com.awcode.rvanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView newsRecyclerView;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsRecyclerView = findViewById(R.id.news_rv);
        mData = new ArrayList<>();

        mData.add(new NewsItem("Title Text 01", "Content 01", "01 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 02", "Content 01", "02 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 03", "Content 01", "03 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 04", "Content 01", "04 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 05", "Content 01", "05 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 06", "Content 01", "06 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 07", "Content 01", "07 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 08", "Content 01", "08 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 09", "Content 01", "09 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 10", "Content 01", "10 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 01", "Content 01", "01 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 02", "Content 01", "02 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 03", "Content 01", "03 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 04", "Content 01", "04 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 05", "Content 01", "05 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 06", "Content 01", "06 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 07", "Content 01", "07 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 08", "Content 01", "08 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 09", "Content 01", "09 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 10", "Content 01", "10 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 01", "Content 01", "01 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 02", "Content 01", "02 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 03", "Content 01", "03 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 04", "Content 01", "04 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 05", "Content 01", "05 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 06", "Content 01", "06 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 07", "Content 01", "07 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 08", "Content 01", "08 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 09", "Content 01", "09 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 10", "Content 01", "10 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 01", "Content 01", "01 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 02", "Content 01", "02 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 03", "Content 01", "03 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 04", "Content 01", "04 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 05", "Content 01", "05 January 2019", R.drawable.img05));
        mData.add(new NewsItem("Title Text 06", "Content 01", "06 January 2019", R.drawable.img01));
        mData.add(new NewsItem("Title Text 07", "Content 01", "07 January 2019", R.drawable.img02));
        mData.add(new NewsItem("Title Text 08", "Content 01", "08 January 2019", R.drawable.img03));
        mData.add(new NewsItem("Title Text 09", "Content 01", "09 January 2019", R.drawable.img04));
        mData.add(new NewsItem("Title Text 10", "Content 01", "10 January 2019", R.drawable.img05));


        newsAdapter = new NewsAdapter(this, mData);
        newsRecyclerView.setAdapter(newsAdapter);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
