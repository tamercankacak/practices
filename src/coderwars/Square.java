package coderwars;

public class Square {
  public static boolean isSquare(int n) {
    int sqrt = (int) Math.sqrt(n);
    return sqrt * sqrt == n ? true : false; // fix me!
  }

  public static boolean isSquareCodeWars(int n) {
    return Math.sqrt(n) % 1 == 0;
  }
}
