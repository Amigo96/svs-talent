package tweet;

import logger.Logger;

import java.util.*;

public class TweetRepository {
   private static ArrayList<Tweet> tweetList = new ArrayList<Tweet>();

    public TweetRepository(){
        tweetList = new ArrayList<Tweet>();
    }

    public List<Tweet> getTweetList(){
        return TweetRepository.tweetList;
    }

    public static void add(Tweet tweet){
        TweetRepository.tweetList.add(tweet);
    }

    public static void printTweets() {
        //tweetList.stream().sorted(Comparator.reverseOrder()).forEach(x -> Logger.printMessage(x));
       //List<Tweet> reversedTweet Collections.reverse(tweetList);
    //ListIterator<Tweet> listIterator = tweetList.listIterator();

        for(int i=TweetRepository.tweetList.size()-1;  i>=0; i--){
            System.out.println(TweetRepository.tweetList.get(i).toString());
        }

    }






}
