package coderwars;

public class GrassHopper {
  public static int summation(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public static int summationCodeWars(int n) {

    return n * (n + 1) / 2;
  }
}
