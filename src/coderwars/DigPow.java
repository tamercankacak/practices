package coderwars;

public class DigPow {
  public static long digPow(int n, int p) {
    char[] ch = String.valueOf(n).toCharArray();
    int sum = 0;
    for (int i = 0; i < ch.length; i++) {
      sum += Math.pow(Character.getNumericValue(ch[i]), p++);
    }
    return (sum % n == 0) ? sum / n : -1;
  }
}
