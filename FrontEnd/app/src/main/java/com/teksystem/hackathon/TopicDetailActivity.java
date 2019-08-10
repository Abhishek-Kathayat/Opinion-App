package com.teksystem.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.teksystem.hackathon.Adapters.CommentAdapter;
import com.teksystem.hackathon.Models.CommentsModel;

import java.util.ArrayList;
import java.util.List;

public class TopicDetailActivity extends AppCompatActivity {
    private List<CommentsModel> commentlist = new ArrayList<>();
    CommentAdapter commentAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicdetails);

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
                startActivity(in);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.comment_list);
        commentAdapter = new CommentAdapter(commentlist);
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(commentAdapter);
        commentsData();
    }

    private void commentsData() {
        CommentsModel commentsModel = new CommentsModel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
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

        commentAdapter.notifyDataSetChanged();
    }
}
