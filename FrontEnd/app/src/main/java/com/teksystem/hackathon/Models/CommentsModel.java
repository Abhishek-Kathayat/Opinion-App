package com.teksystem.hackathon.Models;

import com.google.gson.annotations.SerializedName;

public class CommentsModel {
    @SerializedName("comment_content")
    private String comment;

    public CommentsModel(String comment) {
        this.comment = comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
