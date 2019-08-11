package com.teksystem.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.teksystem.hackathon.Adapters.TopicsAdapter;
import com.teksystem.hackathon.Models.TopicsModel;
import com.teksystem.hackathon.rest.ApiClient;
import com.teksystem.hackathon.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TopicsAdapter topicsAdapter;
    private List<TopicsModel> topics = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.tweet_list);
        topicsAdapter = new TopicsAdapter(topics);
        RecyclerView.LayoutManager tLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(tLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(topicsAdapter);
        topicsData();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, AddTopicActivity.class);
                startActivity(in);
            }
        });
    }

    private void topicsData() {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<TopicsModel>> call = apiInterface.getTopics();
        call.enqueue(new Callback<List<TopicsModel>>() {
            @Override
            public void onResponse(Call<List<TopicsModel>> call, Response<List<TopicsModel>> response) {
                List<TopicsModel> topiclist = response.body();
                TopicsAdapter topicsAdapter = new TopicsAdapter(topiclist);
                recyclerView.setAdapter(topicsAdapter);
            }

            @Override
            public void onFailure(Call<List<TopicsModel>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });
        /*TopicsModel topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Tech");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Politics");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Social");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Science");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Social");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Education");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Sports");
        topics.add(topicsModel);
        topicsModel = new TopicsModel("Lorem Ipsum dolor sit amet", 100, 100, "Tech");
        topics.add(topicsModel);

        topicsAdapter.notifyDataSetChanged();*/
    }
}
