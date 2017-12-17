package com.seavus.applicationtwitter.tweet;

import com.seavus.applicationtwitter.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Component
@Entity
public class Tweet {
    @Id
    @GeneratedValue
    Long id;

    private String tweet;

    @ManyToOne
    private User user;

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
