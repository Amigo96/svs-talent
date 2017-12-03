public class Main {

    public static void main(String[] args) throws InterruptedException {
        if (args.length < 2) {
            System.out.println("There are no enough arguments");
            System.out.println("The first one specify upperBound of counting in thread ");
            System.out.println("The second one specify time interval (in Milliseconds)");
            System.exit(-1);
        }
        Integer upperBoundNumber = new Integer(String.valueOf(args[0]));
        Long timeInterval = new Long(String.valueOf(args[1]));

        System.out.println("Args[0]= " + upperBoundNumber);
        System.out.println("Args[1]= " + timeInterval);

        NumberPrinter numberPrinter = new NumberPrinter(upperBoundNumber);
        Thread numberPrinterThread = new Thread(numberPrinter);
        numberPrinterThread.start();
        
        Thread.sleep(timeInterval);
        numberPrinterThread.interrupt();
        if (numberPrinterThread.isAlive()) {
            System.out.println("the numberPrinterThread is Alive");
        }

        System.out.println("MAIN METHOD FINISHED HERE ");
        // System.exit(-1);
    }
}
