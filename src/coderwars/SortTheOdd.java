package coderwars;

import java.util.Arrays;

public class SortTheOdd {
  public static int[] sortArray(int[] array) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 1) {
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] % 2 == 1 && array[i] > array[j]) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
          }
        }
      }
    }

    return array;
  }

  public static int[] sortArrayCodeWars(final int[] array) {

    // Sort the odd numbers only
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

    // Then merge them back into original array
    for (int j = 0, s = 0; j < array.length; j++) {
      if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
    }

    return array;
  }
}
