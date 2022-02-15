package coderwars;

public class SquareSum {
  public static int squareSum(int[] n) {
    int sum = 0;
    for (int value : n) {
      sum += value * value;
    }
    return sum;
  }
}
