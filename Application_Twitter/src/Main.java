import logger.Logger;
import sun.rmi.runtime.Log;
import user.AnonymousUser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        AnonymousUser anonymousUser = new AnonymousUser();
        AnonymousUser anonymousUser1 = new AnonymousUser();
        Logger logger = new Logger();
        Logger.printTweets();
        Scanner scanner = new Scanner(System.in);

       // anonymousUser.tweetMessage();
        // anonymousUser1.tweetMessage();


        Logger.printTweets();

        Logger.log("Input \"1\" to Tweet a message");
        Logger.log("Input \"2\" to list all tweets in reversed order");
        Logger.log("Input \"3\" to quit the program");
    int tmpint ;
        while(true){
            tmpint=scanner.nextInt();
                if(tmpint==1){
                    anonymousUser.tweetMessage();
                }else if(tmpint==2){
                    anonymousUser.listAllTweets();
                }
                else if (tmpint==3){
                    System.exit(1);
                }


        }

    }

}
