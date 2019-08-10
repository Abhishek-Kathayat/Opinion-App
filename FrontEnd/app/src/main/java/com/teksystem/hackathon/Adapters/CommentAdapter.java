package com.teksystem.hackathon.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teksystem.hackathon.Models.CommentsModel;
import com.teksystem.hackathon.R;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder> {
private List<CommentsModel> commentlist;

public class CommentViewHolder extends RecyclerView.ViewHolder {
    public TextView commentholder;

    public CommentViewHolder(View view) {
        super(view);
        commentholder = (TextView)view.findViewById(R.id.comments_holder);
    }
}

    public CommentAdapter(List<CommentsModel> commentlist) {
        this.commentlist = commentlist;
    }

    @Override
    public CommentAdapter.CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentview = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_comments, parent, false);

        return new CommentAdapter.CommentViewHolder(contentview);
    }

    @Override
    public void onBindViewHolder(CommentAdapter.CommentViewHolder holder, int position) {
        CommentsModel commentModel = commentlist.get(position);
        holder.commentholder.setText(commentModel.getComment());
    }

    @Override
    public int getItemCount() {
        return commentlist.size();
    }

}