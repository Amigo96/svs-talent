import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("This program implements work of stopWatch");
        System.out.println("Use the keywords: \"START\" and \"STOP\" to test it");
        System.out.println("When program starts, the stopWatch thread is started, but counter is stopped (like real stopWatch)");
        System.out.println("Once typed: START , stopWatch starts counting.");
        System.out.println("Typing START while stopWatch is running causes stopWatch to pause counting");
        System.out.println("Once typed: STOP , stopWatch will pause counting");
        System.out.println("Typing STOP two times in a row causes stopWatch to reset");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        StopWatch task = new StopWatch();
        Thread taskThread = new Thread(task);
        taskThread.start();


        while (true) {
            String tmpString = scanner.next();
            if (tmpString.equals("START")) {
                if (task.getSTARTED() == true) {
                    task.stopStopWatch();
                } else {
                    task.startStopWatch();
                }
            } else if (tmpString.equals("STOP")) {
                if (task.getSTOPPED() == true) {
                    task.resetStopWatch();
                } else {
                    task.stopStopWatch();
                }
            }


        }

    }


}
