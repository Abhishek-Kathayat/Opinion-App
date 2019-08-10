package com.teksystem.hackathon.Models;

public class CommentsModel {
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
