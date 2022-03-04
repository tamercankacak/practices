package coderwars;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/5842df8ccbd22792a4000245
 *
 * @author tamercankacak
 */
public class ExpandedForm {
  public static String expandedForm(int num) {
    List<String> list = new ArrayList<>();
    String numStr = String.valueOf(num);
    while (!(numStr == null || numStr.isEmpty())) {
      int firstDigit = Character.getNumericValue(numStr.charAt(0));
      if (firstDigit != 0) {
        list.add(String.valueOf(firstDigit * (int) Math.pow(10, numStr.length() - 1)));
      }
      numStr = numStr.substring(1);
    }

    return String.join(" + ", list);
  }

  public static String expandedFormCodeWars(int num) {
    String outs = "";
    for (int i = 10; i < num; i *= 10) {
      int rem = num % i;
      outs = (rem > 0) ? " + " + rem + outs : outs;
      num -= rem;
    }
    outs = num + outs;

    return outs;
  }
}
