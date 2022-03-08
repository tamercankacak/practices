package coderwars;

public class BouncingBall {
  public static int bouncingBall(double h, double bounce, double window) {
    if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
      int count = 1;
      h *= bounce;
      while (h > window) {
        count+=2;
        h *= bounce;
      }
      return count;
    }

    return -1;
  }
}
