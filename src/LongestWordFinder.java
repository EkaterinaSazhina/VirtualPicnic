import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LongestWordFinder {
    public String findLongestWord(File file) {
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
        return longestWord;
    }
}