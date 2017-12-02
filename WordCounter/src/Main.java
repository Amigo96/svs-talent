import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        if (args.length == 0) {
            System.out.println("The first argument must be FileUrl");
            System.exit(-1);
        }

        String fileUrl = args[0];
        WordCounter wordCounter = new WordCounter(fileUrl);
        wordCounter.countOccurencesOfEachWord();
        wordCounter.printMap();


    }
}
