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

public class AddTopicActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtopic);

        Button submittopic = findViewById(R.id.submittopic);
        ImageButton backbutton = findViewById(R.id.imagebutton_back);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(AddTopicActivity.this, MainActivity.class);
                startActivity(in);
            }
        });

        submittopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = findViewById(R.id.editext_topichead);
                EditText editText1 = findViewById(R.id.editext_topicdesc);
                EditText editText2 = findViewById(R.id.editext_topicimg);

                String topic_name = "", topic_desc = "", topic_img = "";
                String et = editText.getText().toString();
                for (int i = 0; i < et.length(); ++i) {
                    if (et.charAt(i) == ' ') {
                        topic_name = topic_name + '_';
                    } else {
                        topic_name = topic_name + et.charAt(i);
                    }
                }

                String et1 = editText1.getText().toString();
                for (int i = 0; i < et1.length(); ++i) {
                    if (et1.charAt(i) == ' ') {
                        topic_desc = topic_desc + '_';
                    } else {
                        topic_desc = topic_desc + et1.charAt(i);
                    }
                }
                String et2 = editText2.getText().toString();
                for (int i = 0; i < et2.length(); ++i) {
                    if (et2.charAt(i) == ' ') {
                        topic_img = topic_img + '_';
                    } else {
                        topic_img = topic_img + et2.charAt(i);
                    }
                }

                ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
                Call<ResponseBody> call = apiInterface.addTopic(topic_name, topic_desc, topic_img);
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

