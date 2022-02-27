package coderwars;

import java.util.List;
import java.util.regex.Pattern;

public class SmileFaces {
  public static int countSmileys(List<String> arr) {
    int count = 0;
    for (String smile : arr) {
      boolean isSmileCorrect = Pattern.compile("[:;][-~]?[)D]").matcher(smile).matches();
      if (isSmileCorrect) count++;
    }

    return count;
  }
}
