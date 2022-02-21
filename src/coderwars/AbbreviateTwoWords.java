package coderwars;

import java.util.Locale;

/**
 * https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
 *
 * @author tamercankacak
 */
public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    String[] arr = name.split(" ");

    return String.valueOf((arr[0].charAt(0))).toUpperCase(Locale.ROOT)
        + "."
        + String.valueOf((arr[1].charAt(0))).toUpperCase(Locale.ROOT);
  }

  public static String abbrevNameCodeWars(String name) {
    String[] names = name.split(" ");
    return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
  }
}
