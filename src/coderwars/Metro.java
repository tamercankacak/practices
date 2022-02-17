package coderwars;

import java.util.ArrayList;

/**
 * https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
 *
 * @author tamercankacak
 */
public class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int passangerSum = 0;
    for (int[] stop : stops) {
      passangerSum += stop[0] - stop[1];
    }

    return passangerSum;
  }

  public static int countPassengersCodeWars(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
  }
}
