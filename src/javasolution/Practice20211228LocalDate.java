package javasolution;

import java.time.LocalDate;

// https://www.hackerrank.com/challenges/java-date-and-time/problem
public class Practice20211228LocalDate {
  public static void main(String[] args) {
    System.out.println(findDay(8, 5, 2015));
  }

  public static String findDay(int month, int day, int year) {
    LocalDate localDate = LocalDate.of(year, month, day);
    return localDate.getDayOfWeek().toString();
  }
}
