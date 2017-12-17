package com.seavus.applicationtwitter.tweet;

import java.util.ArrayList;
import java.util.List;


public class TweetRepositoryDeprecated {
   private static ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

    public TweetRepositoryDeprecated(){
        tweetList = new ArrayList<Tweet>();
    }

    public List<Tweet> getTweetList(){
        return TweetRepositoryDeprecated.tweetList;
    }

    public static void add(Tweet tweet){
        TweetRepositoryDeprecated.tweetList.add(tweet);
    }

    public static void printTweets() {
        //tweetList.stream().sorted(Comparator.reverseOrder()).forEach(x -> Logger.printMessage(x));
       //List<Tweet> reversedTweet Collections.reverse(tweetList);
    //ListIterator<Tweet> listIterator = tweetList.listIterator();

        for(int i = TweetRepositoryDeprecated.tweetList.size()-1; i>=0; i--){
            System.out.println(TweetRepositoryDeprecated.tweetList.get(i).toString());
        }

    }






}
