package coderwars;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
 *
 * @author tamercankacak
 */
public class Counter {

  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter++;
      }
    }
    return counter;
  }

  public int countSheepsCodeWars(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
  }
}
