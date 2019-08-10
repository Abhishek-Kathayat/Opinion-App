package com.teksystem.hackathon.Adapters;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teksystem.hackathon.Models.TopicsModel;
import com.teksystem.hackathon.R;
import com.teksystem.hackathon.TopicDetailActivity;

import java.util.List;

public class TopicsAdapter extends RecyclerView.Adapter<TopicsAdapter.TopicViewHolder> {
    private List<TopicsModel> topics;

    public class TopicViewHolder extends RecyclerView.ViewHolder {
        public TextView topicname, topiccategory;
        public TextView thumbup, thumbdown;
        public CoordinatorLayout taptopic;

        public TopicViewHolder(View view) {
            super(view);
            topicname = (TextView)view.findViewById(R.id.desc_tweet);
            thumbup = (TextView)view.findViewById(R.id.plus_count);
            thumbdown = (TextView)view.findViewById(R.id.minus_count);
            topiccategory = (TextView)view.findViewById(R.id.topic_category);
            taptopic = view.findViewById(R.id.tab_topic);
        }
    }

    public TopicsAdapter(List<TopicsModel> topics) {
        this.topics = topics;
    }

    @Override
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contentview = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_tweet, parent, false);

        return new TopicViewHolder(contentview);
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {
        TopicsModel topicsModel = topics.get(position);
        holder.topicname.setText(topicsModel.getTopicname());
        holder.thumbup.setText(String.valueOf(topicsModel.getThumbup()));
        holder.thumbdown.setText(String.valueOf(topicsModel.getThumbdown()));
        holder.topiccategory.setText(topicsModel.getCategory());
        holder.taptopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(view.getContext(), TopicDetailActivity.class);
                view.getContext().startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

}
