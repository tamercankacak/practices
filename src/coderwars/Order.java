package coderwars;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java
 *
 * @author tamercankacak
 */
public class Order {
  public static String order(String words) {

    String[] wordArr = words.split(" ");
    String[] sortedArr = new String[wordArr.length];

    for (String word : wordArr) {
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        if (ch >= 49 && ch <= 57) {
          int index = Character.getNumericValue(ch);
          sortedArr[index - 1] = word;
        }
      }
    }

    return sortedArr[0] != null ? String.join(" ", sortedArr) : "";
  }

  public static String orderCodeWars(String words) {
    return Arrays.stream(words.split(" ")) // split words by blank
        .sorted // sorting array
                (Comparator.comparing // Compare method
                        (s -> Integer.valueOf // String to Int
                                (s.replaceAll // replace by regex
                                        ("\\D", "") // replace non-digit letters to blank
                                )))
        .reduce((a, b) -> a + " " + b)
        .get();
  }
}
