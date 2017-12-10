package logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tweet.Tweet;
import tweet.TweetRepository;

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
