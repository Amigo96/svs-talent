package com.seavus.applicationtwitter.user;

import com.seavus.applicationtwitter.logger.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.seavus.applicationtwitter.tweet.TweetRepositoryDeprecated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Scanner;


@Component
@Entity
@Profile("anonymous")
public class AnonymousUser {
   @Id
   @GeneratedValue
    private long userId;

@Autowired
    public AnonymousUser(){
        this.userId = this.hashCode();

    }

    public void tweetRandomMessage(){
       // Logger.log("randomMessageExample");
        System.out.println("startSpringProject");
    }

    public void tweetMessage(){
        Scanner scanner = new Scanner(System.in);
        Logger.log(scanner.nextLine());
    }

    public void listAllTweets(){
        TweetRepositoryDeprecated.printTweets();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnonymousUser that = (AnonymousUser) o;

        return userId == that.userId;
    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }

}
