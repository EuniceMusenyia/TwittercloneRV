package com.clonet.twitterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.clonet.twitterclone.databinding.ActivityMainBinding
import com.clonet.twitterclone.databinding.TweetListItemBinding

class TweetsRVAdapter (var tweetsList: List<TweetData>):RecyclerView.Adapter<TweetsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var binding = TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var tweet = tweetsList[position]
        holder.binding.tvname.text = tweet.displayName
        holder.binding.tvhandle.text = tweet.handle
        holder.binding.tvTweet.text = tweet.tweet
        holder.binding.tvReplyCount.text = tweet.replyCount.toString()
        holder.binding.tvlikecount.text = tweet.likeCount.toString()
        holder.binding.tvretweetcount.text =tweet.tweet.toString()

//            holder.binding.apply { TweetListItemBinding }
    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}
class TweetsViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root)