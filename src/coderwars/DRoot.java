package coderwars;

public class DRoot {
  public static int digital_root(int n) {
    int sum = 0;
    while (true) {
      while (n != 0) {
        sum += n % 10;
        n /= 10;
      }
      if (sum >= 10) {
        n = sum;
        sum = 0;
      } else {
        break;
      }
    }

    return sum;
  }

  public static int digital_rootCoderWars(int n) {
    return (n != 0 && n % 9 == 0) ? 9 : n % 9;
  }
}
