package com.clonet.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.clonet.twitterclone.databinding.ActivityMainBinding
import com.clonet.twitterclone.databinding.TweetListItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayTweets()
    }
    fun displayTweets(){
        var tweet1 = TweetData("Eunice","Eunice","@Senyia", "I am lucky to be here and I am sure" +
                " I will come out of this strong because I am energetic and I can do hard things",
            88,4,6)
        var tweet2 = TweetData("Musenyia","Senyia","@Senyia", " I choose to create my happiness",
            1,4,6)
        var tweet3 = TweetData("Senyia","Musenyia","@Musenyia", " I will work hard",
            5,4,9)
        var tweet4 = TweetData("Mutunga","Mutunga","@Mutunga", " I must understand these concepts",
            11,9,8)
         var tweetList = listOf<TweetData>(tweet1,tweet2,tweet3,tweet4)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        var tweetsAdapter = TweetsRVAdapter(tweetList)
        binding.rvTweets.adapter=tweetsAdapter
    }

}