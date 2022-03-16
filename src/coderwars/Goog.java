package coderwars;

import java.util.Arrays;

public class Goog {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    return yourPoints > Arrays.stream(classPoints).average().getAsDouble();
  }
}
