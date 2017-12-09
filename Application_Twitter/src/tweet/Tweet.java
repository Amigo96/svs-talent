package tweet;

public class Tweet {
    private String tweet;

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
