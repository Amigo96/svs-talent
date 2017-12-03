package logger;

import java.util.ArrayList;
import java.util.Comparator;

public class Logger {
    static ArrayList<String> listMessages;

    public Logger(){
        this.listMessages = new ArrayList<>();
    }
    public static void log(String msg){
        System.out.println(Thread.currentThread().getName()+" : "+ msg);
        Logger.listMessages.add(msg);
    }

    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printTweets(){
        /*for (String stringLine : listMessages){
            Logger.printMessage(stringLine);
        }*/

        listMessages.stream().sorted(Comparator.reverseOrder()).forEach(x -> Logger.printMessage(x));


    }

}
