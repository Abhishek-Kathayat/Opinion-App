package com.teksystem.hackathon.Models;

import com.google.gson.annotations.SerializedName;

public class TopicsModel {
    @SerializedName("topic_id")
    private int topic_id;
    @SerializedName("topic_name")
    private String topic_name;
    @SerializedName("topic_desc")
    private String topic_desc;
    @SerializedName("topic_image")
    private String topic_img;

    TopicsModel(int topic_id, String topic_name, String topic_desc, String topic_img) {
        this.topic_id = topic_id;
        this.topic_name = topic_name;
        this.topic_desc = topic_desc;
        this.topic_img = topic_img;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_desc(String topic_desc) {
        this.topic_desc = topic_desc;
    }

    public String getTopic_desc() {
        return topic_desc;
    }

    public void setTopic_img(String topic_img) {
        this.topic_img = topic_img;
    }

    public String getTopic_img() {
        return topic_img;
    }
}
