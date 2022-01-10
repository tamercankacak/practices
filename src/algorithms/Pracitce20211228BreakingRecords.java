package algorithms;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class Pracitce20211228BreakingRecords {
  public static void main(String[] args) {
    //
    System.out.println(
        breakingRecords(
            new ArrayList<Integer>() {
              {
                add(10);
                add(5);
                add(20);
                add(20);
                add(4);
                add(5);
                add(2);
                add(25);
                add(1);
              }
            }));
  }

  public static List<Integer> breakingRecords(List<Integer> scores) {
    int highest, lowest;
    highest = lowest = scores.get(0);
    List<Integer> finalScores = new ArrayList<Integer>(){{
      add(0);
      add(0);
    }};
    for (int i = 1; i < scores.size(); i++) {
      if (scores.get(i) > highest) {
        highest = scores.get(i);
        finalScores.set(0, finalScores.get(0) + 1);
      } else if (scores.get(i) < lowest) {
        lowest = scores.get(i);
        finalScores.set(1, finalScores.get(1) + 1);
      }
    }
    return finalScores;
  }
}
