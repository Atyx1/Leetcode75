import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is fun. Java is powerful. Java is everywhere.";
        Map<String, Integer> wordCounts = countWordFrequency(text);
        System.out.println("Word frequencies: " + wordCounts);
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}