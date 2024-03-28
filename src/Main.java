import java.io.File;
import java.util.*;

import java.io.File;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Катенька\\Desktop\\VirtualPicnic\\untitled\\src\\input.txt");

        CountWords wordCounter = new CountWords();
        int wordCount = wordCounter.countWords(file);
        System.out.println("Количество слов в файле: " + wordCount);

        LongestWordFinder longestWordFinder = new LongestWordFinder();
        String longestWord = longestWordFinder.findLongestWord(file);
        System.out.println("Самое длинное слово в файле: " + longestWord);

        WordFrequencyCounter frequencyCounter = new WordFrequencyCounter();
        Map<String, Integer> wordFrequency = frequencyCounter.countWordFrequency(file);

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequency.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Частота слов в файле (отсортировано по встречаемости):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}