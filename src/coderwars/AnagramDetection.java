package coderwars;

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetection {
  public static boolean isAnagram(String test, String original) {
    char testArr[] = test.toLowerCase(Locale.ROOT).toCharArray();
    char originalArr[] = original.toLowerCase(Locale.ROOT).toCharArray();
    Arrays.sort(testArr);
    Arrays.sort(originalArr);

    return new String(testArr).equals(new String(originalArr));
  }
}
