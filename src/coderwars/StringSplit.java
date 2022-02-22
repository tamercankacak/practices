package coderwars;

/**
 * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
 *
 * @author tamercankacak
 */
public class StringSplit {
  public static String[] solution(String s) {
    if (s.length() % 2 == 1) s+="_";
    String[] arr = s.split("(?<=\\G.{2})");
    return arr;
  }
}
