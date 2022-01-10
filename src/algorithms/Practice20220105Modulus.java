package algorithms;

// https://www.hackerrank.com/challenges/drawing-book/problem
@SuppressWarnings("ALL")
public class Practice20220105Modulus {
  public static void main(String[] args) {
    int result = pageCount(5, 4);
    System.out.println(result);
  }

  public static int pageCount(int n, int p) {
    int firstLong = p / 2;
    int lastLong = n % 2 == 0 ? (n - 1 - p) / 2 + 1 : (n - p) / 2;
    return n == p ? 0 : firstLong < lastLong ? firstLong : lastLong;
  }
}
