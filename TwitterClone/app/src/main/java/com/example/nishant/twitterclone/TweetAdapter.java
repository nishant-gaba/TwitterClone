package com.example.nishant.twitterclone;

import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.List;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.TweetHolder>{
    public List<Tweet> messages;

    public TweetAdapter(List<Tweet> messages){
        this.messages=messages;
    }

    @NonNull

    public TweetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new TweetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TweetHolder holder, int position) {

        holder.message.setText(messages.get(position).getMessage());
        holder.authorName.setText(messages.get(position).getAuthor());
    }

    public int getItemCount() {

        return messages.size();

    }

    public class TweetHolder extends RecyclerView.ViewHolder {
        TextView authorName;
        TextView message;

        public TweetHolder(View itemView) {
            super(itemView);
            authorName = itemView.findViewById(R.id.author);
            message = itemView.findViewById(R.id.tweet);
        }
    }
}
