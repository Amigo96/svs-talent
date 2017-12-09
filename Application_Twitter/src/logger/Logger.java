package logger;

import tweet.Tweet;
import tweet.TweetRepository;

import java.util.ArrayList;
import java.util.Comparator;

public class Logger {

    public Logger() {

    }

    public static void log(String msg) {
        TweetRepository.add(new Tweet(msg));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }


}
