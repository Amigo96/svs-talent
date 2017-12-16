package com.seavus.applicationtwitter.tweet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tweet {
    private String tweet;

    @Autowired
    public Tweet(){
        setTweet("randomTweet");
    }

    public Tweet(String tweet) {
        setTweet(tweet);
    }

    public void setTweet(String tweet){
        this.tweet = tweet;
    }

    public String getTweet(){
        return this.tweet;
    }

    public String toString(){
        return this.tweet.toString();
    }
}
