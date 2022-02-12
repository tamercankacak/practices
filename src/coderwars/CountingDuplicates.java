package coderwars;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 *
 * @author tamercankacak
 */
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    char[] chars = text.toLowerCase(Locale.ROOT).toCharArray();
    int count = 0;
    Map<Character, Integer> map = new HashMap<>();
    for (char c : chars) {
      if (map.containsKey(c)) {
        int counter = map.get(c);
        map.put(c, ++counter);
      } else {
        map.put(c, 1);
      }
    }

    for (char c : map.keySet()) {
      if (map.get(c) > 1) {
        count++;
      }
    }
    return count;
  }

  public static int duplicateCountCodeWars(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0, 1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
