package coderwars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ArrayDiff {
  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    loop:
    for (int num : a) {
      for (int i : b) if (num == i) continue loop;
      list.add(num);
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  @Test
  public void sampleTests() {
    assertArrayEquals(new int[] {2}, arrayDiff(new int[] {1, 2}, new int[] {1}));
    assertArrayEquals(new int[] {2, 2}, arrayDiff(new int[] {1, 2, 2}, new int[] {1}));
    assertArrayEquals(new int[] {1}, arrayDiff(new int[] {1, 2, 2}, new int[] {2}));
    assertArrayEquals(new int[] {1, 2, 2}, arrayDiff(new int[] {1, 2, 2}, new int[] {}));
    assertArrayEquals(new int[] {}, arrayDiff(new int[] {}, new int[] {1, 2}));
  }
}
