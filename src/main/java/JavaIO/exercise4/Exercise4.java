package JavaIO.exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws FileNotFoundException {
        String theLongestWord = new Exercise4().findTheLongestWord();
        System.out.println(theLongestWord);
    }

    public String findTheLongestWord() throws FileNotFoundException {
        String path = null; // file path on one's pc
        String theLongestWord = "";
        String cur;
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNext()) {
            cur = scanner.next();
            if (cur.length() > theLongestWord.length()) {
                theLongestWord = cur;
            }
        }
        return theLongestWord;
    }
}
