package user;

import logger.Logger;

import java.util.Scanner;

public class AnonymousUser implements User {
    private long userId;


    public AnonymousUser(){
        this.userId = this.hashCode();

    }

    public void tweetMessage(){
        Scanner scanner = new Scanner(System.in);
        Logger.log(scanner.nextLine());
    }

    public void listAllTweets(){
        Logger.printTweets();
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
