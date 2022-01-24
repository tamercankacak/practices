package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Practice20220123VestelChallenge. */
public class Practice20220123VestelChallenge {
  /**
   * main func.
   *
   * @param args param args.
   */
  public static void main(String[] args) {
    System.out.println(
        findMinimumDays(
            new ArrayList<Float>() {
              {
                add((float) 1.01);
                add((float) 1.991);
                add((float) 1.32);
                add((float) 1.4);
              }
            }));
    closestNumbers(null);
  }

  /**
   * Program gets closest 2 number.
   *
   * @param numbers getting int list.
   */
  public static void closestNumbers(List<Integer> numbers) {
    Collections.sort(numbers);
    int minimumDifference = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.size() - 1; i++) {
      int differenceBetweenTwoElement = Math.abs(numbers.get(i) - numbers.get(i + 1));
      if (differenceBetweenTwoElement < minimumDifference) {
        minimumDifference = differenceBetweenTwoElement;
      }
    }
    for (int j = 0; j < numbers.size() - 1; j++) {
      int differenceBetweenTwoElement = Math.abs(numbers.get(j) - numbers.get(j + 1));
      if (differenceBetweenTwoElement == minimumDifference) {
        System.out.println(numbers.get(j) + " " + numbers.get(j + 1));
      }
    }
  }

  /**
   * find minimum days.
   *
   * @param durations durations means hours.
   * @return needs days.
   */
  public static int findMinimumDays(List<Float> durations) {

    float sum = durations.stream().reduce((float) 0, Float::sum);

    return (int) Math.ceil(sum / 3.0);
  }
}
