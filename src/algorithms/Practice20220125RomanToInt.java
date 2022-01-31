package algorithms;

import java.util.HashMap;
import java.util.Map;

/** https://leetcode.com/problems/roman-to-integer/ */
public class Practice20220125RomanToInt {
  /**
   * main.
   *
   * @param args main args.
   */
  public static void main(String[] args) {
    System.out.println(romanToInt("MCMXCIV"));
  }

  /**
   * romantoint.
   *
   * @param s string.
   * @return return number of roman value.
   */
  public static int romanToInt(String s) {
    Map<Character, Integer> numbersMap = new HashMap<>();
    numbersMap.put('I', 1);
    numbersMap.put('V', 5);
    numbersMap.put('X', 10);
    numbersMap.put('L', 50);
    numbersMap.put('C', 100);
    numbersMap.put('D', 500);
    numbersMap.put('M', 1000);

    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (i > 0 && numbersMap.get(ch) > numbersMap.get(s.charAt(i - 1))) {
        result += numbersMap.get(ch) - 2 * numbersMap.get(s.charAt(i - 1));
      } else {
        result += numbersMap.get(ch);
      }
    }
    return result;
  }
}
