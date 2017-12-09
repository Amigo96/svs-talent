import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class WordCounter {
    private TreeMap<String, Integer> words;
    private File fileUrl;

    public WordCounter(String fileUrl) {
        this.words = new TreeMap<String, Integer>();
        this.fileUrl = new File(fileUrl);
    }

    public void countOccurencesOfEachWord() throws FileNotFoundException {
        if (fileUrl == null) {
            throw new FileNotFoundException();
        }

        Scanner scanner = new Scanner(this.fileUrl);
        countOccurenciesPerWord(scanner);
    }

    private void countOccurenciesPerWord(Scanner scanner) {
        Integer tmpInteger = new Integer(-1);
        while (scanner.hasNext()) {
            String tmpString = scanner.next();
            if (!StringUtils.equalsAnyIgnoreCase(tmpString, keySetToString())) {
                tmpInteger = 1;
            } else {
                tmpInteger = words.get(tmpString.toLowerCase());
                tmpInteger++;

            }
            words.put(tmpString.toLowerCase(), tmpInteger);
        }
    }

    public void printMap() {
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + " :[" + word.getValue() + "]");
        }
    }

    public CharSequence[] keySetToString() {
        CharSequence[] wordSequence = words.keySet().toArray(new CharSequence[0]);
        return wordSequence;
    }
}