package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Practice20210124TargetSum {
  public static void main(String[] args) {
    long startTime = System.nanoTime();
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] twoSum = twoSum(nums, target);
    for (int value : twoSum) {
      System.out.println(value);
    }
    long endTime = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println((float) totalTime / 1000000);
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] sumOfValues = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        sumOfValues[1] = i;
        sumOfValues[0] = map.get(target - nums[i]);
        return sumOfValues;
      }
      map.put(nums[i], i);
    }
    return sumOfValues;
  }
}
