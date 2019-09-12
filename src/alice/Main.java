package alice;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> wordsCounts = new HashMap<>();
        FileReader read = new FileReader();

        String fileContents = read.readFile();
        String[] words = fileContents.split(" ");

        for (String word : words) {
            if (wordsCounts.containsKey(word)) {
                wordsCounts.put(word, wordsCounts.get(word) + 1);
            } else {
                wordsCounts.put(word, 1);
            }
        }

        String mostCommonWord = (String) wordsCounts.keySet().toArray()[0];
        for (Map.Entry<String, Integer> entry : wordsCounts.entrySet()) {
            if (wordsCounts.get(mostCommonWord) < entry.getValue()) {
                mostCommonWord = entry.getKey();
            }

        }

        System.out.println("{" + mostCommonWord + " = " + wordsCounts.get(mostCommonWord) + "}");
    }
}
