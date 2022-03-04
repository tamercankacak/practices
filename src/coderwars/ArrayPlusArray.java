package coderwars;

import java.util.Arrays;

public class ArrayPlusArray {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {

    return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
  }
}
