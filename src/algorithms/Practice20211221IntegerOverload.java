package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//https://www.hackerrank.com/challenges/mini-max-sum/problem
public class Practice20211221IntegerOverload {
  public static void main(String[] args) {
    miniMaxSum(
        new ArrayList<Integer>() {
          {
            add(256741038);
            add(623958417);
            add(467905213);
            add(714532089);
            add(938071625);
          }
        });
  }

  public static void miniMaxSum(List<Integer> arr) {
    //Integer List Sorting
    arr = arr.stream().sorted().collect(Collectors.toList());

    //Integer List to Long List => arr.stream().mapToLong(Integer::longValue)
    long total = arr.stream().mapToLong(Integer::longValue).sum();

    System.out.println(
        (total - arr.get(arr.size() - 1))
            + " "
            + (total - arr.get(0)));
  }
}
