package com.teksystem.hackathon.Models;

import com.google.gson.annotations.SerializedName;

public class TopicsModel {
    @SerializedName("topics_id")
    private int topic_id;
    @SerializedName("topics_name")
    private String topic_name;
    @SerializedName("topic_desc")
    private String topic_desc;
    @SerializedName("topic_image")
    private String topic_img;
    @SerializedName("topic_genre")
    private String topic_genre;
    @SerializedName("topic_emot")
    private String topic_emot;

    TopicsModel(int topic_id, String topic_name, String topic_desc, String topic_img, String topic_genre, String topic_emot) {
        this.topic_id = topic_id;
        this.topic_name = topic_name;
        this.topic_desc = topic_desc;
        this.topic_img = topic_img;
        this.topic_genre = topic_genre;
        this.topic_emot = topic_emot;
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

    public void setTopic_genre(String topic_genre) {
        this.topic_genre = topic_genre;
    }

    public String getTopic_genre() {
        return topic_genre;
    }

    public void setTopic_emot(String topic_emot) {
        this.topic_emot = topic_emot;
    }

    public String getTopic_emot() {
        return topic_emot;
    }
}
