import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class WordCounter {
    private TreeMap<String, Integer> words;
    private File fileUrl;

    public WordCounter(String fileUrl) {
        this.words = new TreeMap<>();
        this.fileUrl = new File(fileUrl);
    }

    public void countOccurencesOfEachWord() throws FileNotFoundException {
        if (fileUrl == null) {
            throw new FileNotFoundException();
        }

        Scanner scanner = new Scanner(this.fileUrl);
        countOccurencies(scanner);
    }

    private void countOccurencies(Scanner scanner) {
        while (scanner.hasNext()) {
            String tmpString = scanner.next();
            if (!words.containsKey(tmpString)) {
                words.put(tmpString, 1);
            } else {
                Integer tmpInteger = words.get(tmpString);
                tmpInteger++;
                words.put(tmpString, tmpInteger);
            }
        }

    }

    public void printMap() {
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + " :[" + word.getValue()+"]");
        }
    }

}