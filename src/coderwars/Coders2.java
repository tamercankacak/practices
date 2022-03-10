package coderwars;

import java.util.ArrayList;
import java.util.List;

public class Coders2 {
  public static List<Integer> evenOdd(List<Integer> arr, List<List<Integer>> operations) {
    List<Integer> resultList = new ArrayList<>();

    for (List<Integer> list : operations) {
      if (list.get(0) == 1) {
        arr.set(list.get(1), list.get(2));
      } else if (list.get(0) == 2) {
        int min = Math.min(list.get(1), list.get(2));
        int max = Math.max(list.get(1), list.get(2));
        int counter = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
          for (int j = i + 1; j < arr.size(); j++) {
            int ivalue = arr.get(i);
            int jValue = arr.get(j);
            if ((arr.get(i) <= max && arr.get(i) >= min) || (arr.get(j) <= max && arr.get(j) >= min)) {
              if (arr.get(i) % 2 == 0) {
                if (arr.get(j) % 2 == 1) {
                  counter++;
                }
              } else {
                if (arr.get(j) % 2 == 0) {
                  counter++;
                }
              }
            }

          }
        }
        resultList.add(counter);
      }
    }

    return resultList;
  }
}
