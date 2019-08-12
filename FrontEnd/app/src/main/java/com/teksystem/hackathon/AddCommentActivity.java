package com.teksystem.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.teksystem.hackathon.rest.ApiClient;
import com.teksystem.hackathon.rest.ApiInterface;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddCommentActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentadd);

        Button submitbutton = findViewById(R.id.opinionsubmit);

        ImageButton button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AddCommentActivity.this, TopicDetailActivity.class);
                in.putExtra("topic_id", getIntent().getStringExtra("topic_id"));
                in.putExtra("topic_name", getIntent().getStringExtra("topic_name"));
                in.putExtra("topic_img", getIntent().getStringExtra("topic_img"));
                in.putExtra("topic_desc", getIntent().getStringExtra("topic_desc"));
                in.putExtra("topic_genre", getIntent().getStringExtra("topic_genre"));
                in.putExtra("topic_emot", getIntent().getStringExtra("topic_emot"));
                startActivity(in);
            }
        });

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = getIntent();
                String topic_id = in.getStringExtra("topic_id");
                int topicid = Integer.parseInt(topic_id);
                EditText editText = findViewById(R.id.editext_opinion);
                String str = editText.getText().toString();
                String opinion = "";
                for(int i = 0; i < str.length(); ++i) {
                    if(str.charAt(i) != ' ') {
                        opinion = opinion + str.charAt(i);
                    }
                    else {
                        opinion = opinion + '_';
                    }
                }
                ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
                Call<ResponseBody> call = apiInterface.putComment(opinion, topicid);
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            String responsestr = response.body().toString();
                            Toast.makeText(getApplicationContext(), responsestr, Toast.LENGTH_LONG).show();
                        } catch (NullPointerException e) {
                            Toast.makeText(getApplicationContext(), "No response", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.d("Error", t.getMessage());
                    }
                });
            }
        });
    }
}
