package coderwars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java
 *
 * @author tamercankacak
 */
public class School {
  public static int getAverage(int[] marks) {
    return (int) Arrays.stream(marks).average().getAsDouble();
  }
}
