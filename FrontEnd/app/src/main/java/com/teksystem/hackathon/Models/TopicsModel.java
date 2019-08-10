package com.teksystem.hackathon.Models;

public class TopicsModel {
    private String topicname;
    private int thumbup;
    private int thumbdown;
    public String category;

    public TopicsModel(String topicname, int thumbup, int thumbdown, String category) {
        this.topicname = topicname;
        this.thumbdown = thumbdown;
        this.thumbup = thumbup;
        this.category = category;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    public String getCategory() { return category; }

    public String getTopicname() {
        return topicname;
    }

    public int getThumbup() {
        return thumbup;
    }

    public int getThumbdown() {
        return thumbdown;
    }
}
