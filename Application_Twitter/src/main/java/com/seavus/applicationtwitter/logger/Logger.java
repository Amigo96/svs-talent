package com.seavus.applicationtwitter.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.seavus.applicationtwitter.tweet.Tweet;
import com.seavus.applicationtwitter.tweet.TweetRepositoryDeprecated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class Logger {
    @Id
    @GeneratedValue
    Long id ;
    @Autowired
    public Logger() {

    }

    public static void log(String msg) {
        TweetRepositoryDeprecated.add(new Tweet(msg));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }


}
