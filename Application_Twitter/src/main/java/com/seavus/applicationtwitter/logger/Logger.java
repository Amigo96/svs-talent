package com.seavus.applicationtwitter.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.seavus.applicationtwitter.tweet.Tweet;
import com.seavus.applicationtwitter.tweet.TweetRepository;

@Component
public class Logger {

    @Autowired
    public Logger() {

    }

    public static void log(String msg) {
        TweetRepository.add(new Tweet(msg));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }


}
