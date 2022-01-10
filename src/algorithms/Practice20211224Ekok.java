package algorithms;

// https://www.hackerrank.com/challenges/kangaroo/problem
@SuppressWarnings("ALL")
public class Practice20211224Ekok {
  public static void main(String[] args) {
    //
    System.out.println(kangaroo(0, 2, 5, 3));
  }

  public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    for (int i = 1; i <= 10000; i++) {
      if ((x1 + i * v1) == (x2 + i * v2)) return "YES";
      //  alternative    (x1 - x2) % (v2 - v1) == 0
    }

    return "NO";
  }
}
