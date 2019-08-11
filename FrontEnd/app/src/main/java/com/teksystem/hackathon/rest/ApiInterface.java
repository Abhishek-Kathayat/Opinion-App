package com.teksystem.hackathon.rest;

import com.teksystem.hackathon.Models.CommentsModel;
import com.teksystem.hackathon.Models.TopicsModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("topics")
    Call<List<TopicsModel>> getTopics();

    @GET("topic_name={topicname}&topic_desc={topicdesc}&topic_img={topicimg}")
    Call<ResponseBody> addTopic(@Path("topicname") String topic_name, @Path("topicdesc") String topic_desc, @Path("topicimg") String topic_img);

    @GET("topic_id={topic_id}")
    Call<List<CommentsModel>> getComments(@Path("topic_id") int topic_id);
}
