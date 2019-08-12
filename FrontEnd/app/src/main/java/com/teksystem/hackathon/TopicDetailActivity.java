package com.teksystem.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.teksystem.hackathon.Adapters.CommentAdapter;
import com.teksystem.hackathon.Models.CommentsModel;
import com.teksystem.hackathon.rest.ApiClient;
import com.teksystem.hackathon.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TopicDetailActivity extends AppCompatActivity {
    private List<CommentsModel> commentlist = new ArrayList<>();
    CommentAdapter commentAdapter;
    RecyclerView recyclerView;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicdetails);

        Intent intent = getIntent();
        final int topic_id = Integer.parseInt(intent.getStringExtra("topic_id"));
        final String topic_name = intent.getStringExtra("topic_name");
        final String topic_desc = intent.getStringExtra("topic_desc");
        final String topic_img = intent.getStringExtra("topic_img");
        final String topic_genre = intent.getStringExtra("topic_genre");
        final String topic_emot = intent.getStringExtra("topic_emot");

        TextView topicname = findViewById(R.id.heading_topic);
        topicname.setText(topic_name);

        TextView topicdesc = findViewById(R.id.about_desc);
        topicdesc.setText(topic_desc);

        TextView topicgenre = findViewById(R.id.topic_genre);
        topicgenre.setText(topic_genre);

        ImageView imageView = findViewById(R.id.image_topic);
        GlideApp.with(getApplicationContext()).load(topic_img).into(imageView);

        ImageView imageView1 = findViewById(R.id.topic_emot);
        if(topic_emot.equals("Happy")) {
            imageView1.setImageResource(R.drawable.ic_happy);
        }
        else if(topic_emot.equals("Sad")) {
            imageView1.setImageResource(R.drawable.ic_sad);
        }
        else {
            imageView1.setImageResource(R.drawable.ic_confused);
        }

        ImageButton buttonback = findViewById(R.id.backbutton_details);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(TopicDetailActivity.this, MainActivity.class);
                startActivity(in);
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab_comment);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(TopicDetailActivity.this, AddCommentActivity.class);
                in.putExtra("topic_id", String.valueOf(topic_id));
                in.putExtra("topic_name", topic_name);
                in.putExtra("topic_image", topic_img);
                in.putExtra("topic_desc", topic_desc);
                in.putExtra("topic_genre", topic_genre);
                in.putExtra("topic_emot", topic_emot);
                startActivity(in);
            }
        });

        recyclerView = findViewById(R.id.comment_list);
        commentAdapter = new CommentAdapter(commentlist);
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(commentAdapter);
        commentsData(topic_id);
    }

    private void commentsData(int topic_id) {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<CommentsModel>> call = apiInterface.getComments(topic_id);
        call.enqueue(new Callback<List<CommentsModel>>() {
            @Override
            public void onResponse(Call<List<CommentsModel>> call, Response<List<CommentsModel>> response) {
                List<CommentsModel> commentlist = response.body();
                commentAdapter = new CommentAdapter(commentlist);
                recyclerView.setAdapter(commentAdapter);
            }

            @Override
            public void onFailure(Call<List<CommentsModel>> call, Throwable t) {
                Log.d("Error", t.getMessage());
            }
        });

        /*CommentsModel commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);
        commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        commentlist.add(commentsModel);

        commentAdapter.notifyDataSetChanged();*/
    }
}
