package algorithms;

import java.util.ArrayList;
import java.util.List;
// https://www.hackerrank.com/challenges/grading/problem
public class Practice20211222Modulus {
  public static void main(String[] args) {
    List<Integer> list =
        new ArrayList<Integer>() {
          {
            add(73);
            add(67);
            add(38);
            add(33);
          }
        };
    System.out.println(gradingStudents(list));
  }

  public static List<Integer> gradingStudents(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      if (grades.get(i) < 38 || grades.get(i) % 5 < 3) continue;
      if (grades.get(i) % 5 != 0) {
        grades.set(i, grades.get(i) + (5 - (grades.get(i) % 5)));
      }
    }

    return grades;
  }
}
