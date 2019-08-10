package com.teksystem.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AddCommentActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentadd);

        ImageButton button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AddCommentActivity.this, TopicDetailActivity.class);
                startActivity(in);
            }
        });
    }
}
