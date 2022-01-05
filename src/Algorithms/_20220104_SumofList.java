package Algorithms;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/bon-appetit/problem
public class _20220104_SumofList {
  public static void main(String[] args) {
    bonAppetit(
        new ArrayList<Integer>() {
          {
            add(3);
            add(10);
            add(2);
            add(9);
          }
        },
        1,
        7);
  }

  public static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum = bill.stream().mapToInt(Integer::intValue).sum();
    int pd = (sum - bill.get(k)) / 2;
    System.out.println(pd == b ? "Bon Appetit" : b - pd);
  }
}
