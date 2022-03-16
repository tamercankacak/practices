package coderwars;

public class Conversion {
  public String solution(int n) {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanLiterals = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    StringBuilder roman = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      while (n >= values[i]) {
        n -= values[i];
        roman.append(romanLiterals[i]);
      }
    }
    return roman.toString();
  }
}
