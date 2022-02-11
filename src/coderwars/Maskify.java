package coderwars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5412509bd436bd33920011bc
 *
 * @author tamercankacak
 */
public class Maskify {
  public static String maskify(String str) {

    return str.length() > 4
        ? str.replaceAll(
            "^.{0," + (str.length() - 4) + "}",
            IntStream.range(0, str.length() - 4).mapToObj(i -> "#").collect(Collectors.joining("")))
        : str;
  }

  public static String maskifyCodeWars(String str) {
    if (str.length() <= 4) return str;
    String result = "";
    for (int i = 0; i < str.length()-4; i++) {
      result += "#";
    }
    return result + str.substring(str.length()-4);
  }
}
